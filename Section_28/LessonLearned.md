## Lesson Learned: *Spring Framework 5: Inyeccion de Dependencia*
1. Un Service es una fachada de acceso a los objetos DAO y realizan operaciones de negocio
2. Desacopla el codigo y permite escabilidad mediante la inyeccion e interfaces
3. A mi servicio lo tengo que anotar con @Component y ahora se puede inyectar
   1. Tambien se puede usar @Service y queda mas explicito que es una fachada. La diferencia es semantica, nada mas
4. Para inyectar usamos @Autowired en el controlador y nos deshacemos del "new"
   1. Lo recomendable NO es inyectar clases concretas SINO interfaces
   2. Las clases concretas implementan la interface
   3. Así se desacopla el codigo
5. Siempre un @Component o @Service siempre debe tener un constructor sin parametros
6. ¿Que es la Inyeccion de Dependencia?
   1. Es suministrar a un objeto una referencia de otro(s) objeto(s) que necesite segun la relacion
   2. Resuelve el problema de reutilizacion y modularidad entre los componentes
   3. El Contenedor se ecncarga de gestionar las instancias y dependencias de componentes mediante la relacion e inyeccion de objetos
   4. En contra-oposicion de la creacion explicita de objetos
   5. Esto permite un bajo acoplamiento entre los objetos
   6. Tiene que plasmarse mediante la anotacion @Autowired
   7. Resumen: Permite a una clase o componente A obtener desde el contenedor una referencia de otra instancia de otro componete B, haciendo que el contenedor inyecte o suministre mediante un atributo en la clase A
   8. Respecto a @Autowired
      1. Especifica que se inyectara un objeto de spring (bean o componente) en un atributo de otro objeto
      2. Es decir inyectar un bean de spring en el componente actual
      3. Por defecto, la inyeccion falla si no encuentra candidatos disponibles
      4. Se puede utilizar en Atributos, Metodos setter, Constructor
   9. Respecto a @Component
      1. Es un estereotipo generico para cualquier componente manejado por Spring
      2. @Repository, @Service y @Controller son especializaciones de @Component para usos mas especificos
      3. @Repository para persistencia, componentes que acceden a los datos (DAOs)
      4. @Service para servicios de logica de negocio
      5. @Controller para controladores MVC
   10. Componentes o Beans
       1. El termino "Bean" se utiliza para referirse a cualquier componente manejado por Spring
       2. Los beans deben ser anotados con la anotacion @Component o sus derivados
       3. Debe tener un constructor vacio por defecto, sin argumentos. Excepto si anotamos con @Autowired un contructor con parametros
       4. Cualquier beans anotado con @Component (o derivados) bajo el package base seran instanciados y manejados por el contenedor DI de Spring (Auto-scanning)
       5. Otra forma de anotar componentes es usar @Configuration y @Bean en una clase de configuracion
       6. Una clase anotada con @Configuration indica que la clase puede ser utilizada por el contenedor Spring como una fuente de definiciones beans
          1. ```
             @Configuration
             public class AppConfig {
                
                @Bean
                public IUsuarioService registrarUsuarioService() {
                    return new UsuarioServiceImpl();
                }
             }
             ```
       7. La anotacion @Bean juega el mismo papel que anotar la clase con @Component
       8. Lo definido anteriormente en la clase AppConfig es equivalente a:
          1. ```
             @Component
             public class UsuarioService implements IUsuarioService {
             }
             ```
   11. Respecto a @Primary
       1. Si tenemos por ej. dos servicios que implementan la misma interfaz en alguna de las clases concretas la anotamos despues de @Component con @Primary
       2. Permite seleccionar el candidato que queremos inyectar por defecto
   12. Respecto a @Qualifier
       1. Es cuando algunas veces no quiero que sea el @Primary el componente que quiero utilizar
       2. Los componentes tienen que tener un calificador en su anotacion, por ej. @Service("miServicioComplejo")
       3. Despues en donde lo estoy inyectando agrego el @Qualifier
       4. ```
          @Autowired
          @Qualifier("miServicioComplejo")
          private IServicio servicio;
          ```
   13. Otra forma de inyectar es usando una clase de configuracion
       1. ```
          @Configuration
          public class AppConfig {
          
            @Bean("miServicioSimple")
            @Primary
            public IServicio registrarMiServicio() {
                return new MiServicio();
            }
            
            @Bean("miServicioComplejo")
            public Iservicio rgistrarMiServicioComplejo() {
                return new MiServicioComplejo();
            }
          }
          ```
       2. Capaz sea conveniente usar la clase de configuracion cuando utilizamos algunas librerias externas y las queremos registrar en el contenedor
       3. Cuando son clases escritas por nosotros capaz sea conveniente utilizar las anotaciones @Component, @Service, etc
   14. Las clases POJO tambien pueden ser registradas e inyectadas mediante anotaciones y/o clase de configuracion
   15. La anotacion @PostConstruct
       1. Se ejecuta justo despues de crear el objeto y despues de que se haya inyectado la dependencia
       2. Puede servir para cambiar algun valor
       3. Se lo puede asignar a un metodo en particular para que se ejecute en ese tiempo
   16. La anotacion @PreDestroy
       1. Se ejecuta antes de destruirse el componente
       2. Tiene en cuenta el scope del componente
   17. El scope (o contexto) de los componentes por defecto es singleton: Una sola instancia para toda la aplicacion
       1. Con @RequestScope va a durar lo que dure la request a nuestra aplicacion
       2. Con @SessionScope va a durar lo que dure una sesion en el navegador o por un timeout
          1. Los componentes deben implementar la interface Serializable
          2. En este scope no aplica el @PreDestroy
       3. Con @ApplicationScope, es muy parecido al singleton pero se guarda en el servlet context
       