## Lesson Learned: *Spring Framework 5: CRUD using Spring Data JPA*
1. Por defecto Springboot trabaja con Hibernate como proveedor de JPA
2. Agregamos la dependencia Spring Data JPA
   1. Para empezar podemos seleccionar H2 Database para trabajar con una base de datos de desarrollo en memoria
3. Las clases anotadas con @Entity mapean a una tabla en la base de datos
   1. Podemos indicar el nombre de la tabla con @Table(name="clientes")
   2. ```
      @Entity
      @Table(name="clientes")
      public class Cliente implements Serializable {
        
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;
        
        private String nombre;
        private String apellido;
        private String email;
        
        @Column(name="create_at")
        @Temporal(TemporalType.DATE)
        private Date createAt;
        
        @PrePersist
        public void prePersist() {
            createAt = new Date();
        }
        ...
        //todos los getters y setters
        ...
      }
      ```
   3. Para hacer validaciones sobre los campos se pueden usar etiquetas @NotEmpty (para String), @NotNull (para otro tipo de objetos), @Email (ademas para validar el String del email), @Size(min=3, max=6) (para validar el length del String)
   4. En el metodo del controller que trae los datos del formulario agregar la anotacion @Valid y otro argumento BindingResult
      1. ```
         @RequestMapping(value="/form", method=RequestMethod.POST)
         public String guardar(@Valid Cliente cliente, BindingResult result, Model model) {
            if (result.hasErrors()) {
                return "form";
            }
            clienteDao.save(cliente);
            return "redirect:listar";
         }
         ```
   5. Para hacer mensajes de errores personalizados creo un archivo en resources messages.properties
      1. Adentro por ejemplo: NotEmpty.cliente.nombre= El nombre del cliente es requerido
4. ¿Que es un DAO?
   1. En Ingenieria de software, un Data Access Object (DAO) es una clase que implementa y provee una interfaz comun para acceder y trabajar con los datos, independiente de las tecnologias a utilizar JDB, JPA, Hibernate, TopLink, OpenJpa, Codo, EclipseLink, iBATIS o JDO
   2. Esta interface tiene que tener los metodos necesarios para recuperar y amlacenar los datos (contrato de implementacion) con las operaciones basicas: listar, obtener por id, guardar, eliminar, etc
   3. ```
      public interface IClienteDao {
        public List<Cliente> findAll();
        public void save(Cliente cliente);
        public Cliente findOne(Long id);
        public void delete(Long id);
      }
      ```
      ```
      @Repository
      public class ClienteDaoImpl implements IClienteDao {
        
        @PersistenceContext
        private EntityManager em;
      
        @Override
        @Transactional(readOnly=true)
        public List<Cliente> findAll() {
            return em.createQuery("from Cliente").getResultList();
        }
        
        
        @Override
        @Transactional
        public void save(Cliente cliente) {
            if (cliente.getId() != null && cliente.getId() > 0) {
                em.merge(cliente);
            }
            else {
                em.persist(cliente);
            }
        }
        
        @Override
        @Transactional(readOnly=true)
        public Cliente findOne(Long id) {
            return em.find(Cliente.class, id);
        }
      
        @Override
        @Transactional
        public void delete(Long id) {
            em.remove(findOne(id));
        }
      }
      ```
   4. Una entidad pasara a ser manejada por el contexto de persistencia cuando ésta sea persistida mediante el metodo persist() del Entity Manager, o bien un objeto destachado es unido al contexto de persistencia mediante el metodo merge()
   5. En este punto, la entidad pasara a estar asociada a lo que comunmente llamamos el contexto de persistencia
   6. En este caso, y mientras la entidad sea manejada/asociada por el contexto de persistencia (tambien se las conoce como entidades atachadas o attached entities) y el estado (valores de las propiedades) de la entidad seran automaticamente sincronizadas con la BD mediante el metodo flush()
   7. Entity Manager:
      1. persist(Object entity): Almacena un objeto entity en el contexto de persistencia y en la base de datos
      2. merge(Object entity): Actualiza las modificaciones en una entidad devolviendo un objeto entity manejado por el contexto Doctrine
      3. remove(Object entity): Elimina la entidad
      4. find(Class<T> entity, Object primaryKey): Busca la entidad a traves de su clave primaria
5. Para crear y configurar el controller
   1. ```
      @Controller
      @SessionAttributes("cliente")
      public class ClienteController {
        
        @Autowired
        private IClienteDao clienteDao;
        
        @RequestMapping(value="/listar", method=RequestMethod.GET)
        public String listar(Model model) {
            model.addAttribute("titulo", "Listado de clientes");
            model.addAttribute("clientes", clienteDao.findAll());
            return "listar";
        }
        
        @RequestMapping(value="/form")
        public String crear(Map<String, Object> model) {
            
            Cliente cliente = new Cliente();
            model.put("cliente", cliente);
            model.put("titulo", "Formulario de Cliente");
            return "form";
        }
        
        @RequestMapping(value="/form", method=RequestMethod.POST)
        public String guardar(@Valid Cliente cliente, BindingResult result, Model model, SessionStatus status) {
            if (result.hasErrors()) {
                return "form";
            }
            clienteDao.save(cliente);
            status.setComplete();
            return "redirect:listar";
         }
        
        @RequestMapping(value="/form/{id})"
        public String editar(@PathVariable(value="id") Long id, Map<String, Object> model) {
            Cliente cliente = null;
            if (id > 0) {
                cliente = clienteDao.findOne(id);
            }
            else {
                return "redirect:/listar";
            }
            model.put("cliente", cliente);
            model.put("titulo", "Editar Cliente");
            return "form";
        }
      
         @RequestMapping(value="/eliminar/{id})"
         public String eliminar(@PathVariable(value="id") Long id) {
            if (id > 0) {
                clienteDao.eliminar(id);
            }
            return "redirect:/listar";
        }
      }
      ```
6. Para importar algunos datos de pruebas podemos crear un archivo import.sql en la carpeta resources
7. Para habilitar la consola de H2 Database
   1. Dentro del application.properties agregamos: spring.h2.console.enabled=true
   2. Para acceder a la consola: en el navegador http://localhost:8080/h2-console
8. Podemos implementar un @Service para no manejar los DAOs directamente en el controller
   1. Se pueden remover las anotaciones @Transactional del DAO y ponerlas en el Service
   2. Esto seria una implementacion del patron Facade 
   3. ```
      public interface IClienteService {
        public List<Cliente> findAll();
        public void save(Cliente cliente);
        public Cliente findOne(Long id);
        public void delete(Long id);
      }
      ```
   4. ```
      @Service
      public class ClienteServiceImpl implements IClienteService {
        
        @Autowired
        private IClienteDao clienteDao;
        
        @Override
        @Transactional(readOnly=true)
        public List<Cliente> findAll() {
            return (List<Cliente>) clienteDao.findAll();
        }
        
        @Override
        @Transactional
        public void save(Cliente cliente) {
            clienteDao.save(cliente);
        }
        
        @Override
        @Transactional(readOnly=true)
        public Cliente findOne(Long id) {
            return clienteDao.findById(id).orElse(null);
        }
      
        @Override
        @Transactional
        public void delete(Long id) {
            clienteDao.deleteById(id);
        }
      }
      ```
9. Implementando el DAO con la interface CrudRepository de Spring Data JPA
   1. Es una interfaz pero por debajo ya estan contruidas las implementaciones
   2. Eliminamos IClienteDaoImpl
   3. Modificamos la interfaz IClienteDao y la extendemos de CrudRepository
   4. ```
      public interface IClienteDao extends CrudRepository<Cliente, Long> {
        
      }
      ```
   5. En nuestro ClienteServiceImpl van haber varios errores despues de extender de CrudRepository.(ya los corregi)
   6. Con esto nos olvidamos de implementar los metodos del crud nosotros mismos
   7. Tambien existe la interfaz JpaRepository para extender. Similar al CrudRepository
   