## Lesson Learned: *Spring Framework 5: Creando webapps con Spring Boot*
1. Caracteristicas:
   1. Inyeccion de Dependencia
   2. Modelo Vista Controlador (MVC)
   3. Modelo Programacion Reactiva (WebFlux)
   4. Acceso a Datos y Persistencia (JPA)
   5. Programacion orientada a Aspectos (AOP)
   6. Cero configuracion
   7. Minimo requerido JDK 8
   8. Programacion funcional con Reactor
2. Lo que se verá:
   1. Spring Boot
   2. Spring IoC
   3. Spring MVC
   4. Vistas Thymeleaf
3. La anotacion @Controller marca a la clase como controlador. Viene de org.springframework.stereotype.Controller
   1. Tiene metodos handlers que se encarga de manejar las peticiones http. Con la anotacion @RequestMapping(value="/index", method=RequestMethod.GET)
   2. Tambien puede ser @GetMapping(value="/index") para peticiones GET
4. Creamos la vista en /templates -> en esta ocasion es index.html
5. Para pasar datos a la vista desde el controlador se puede usar:
   1. Model
   2. ModelMap
   3. Map
   4. ModelAndView
6. Para agregar una ruta general para todos los metodos del controlador utilizo por ej -> @RequestMapping("/app")
   1. Va abajo de la etiqueta @Controller
   2. Es una ruta de primer nivel
7. Modelo Vista Controlador (MVC)
   1. Toma ventajas de los principios
      1. Modelo, Vista y Controlador
      2. Inyeccion de Dependencia
      3. Orientado al uso de Interfaces
      4. Uso de clases POJO
   2. Es un patron de arquitectura
      1. Funciona con el Front Controller DispatcherServlet recibe una solicitud HTTP del navegador
      2. Luego aplica un controlador basado en la URL (Handler mapping) y asigna el request al Controlador
      3. El controlador se relaciona con componentes de la logica de negocio y envia datos a la vista usando el objeto Model
      4. El controlador retorna/asigna el nombre de la vista logica a mostrar
      5. Se selecciona un ViewResolver, el cual aplica un determinado tipo de vista (Html, PDF, Excel, etc.)
      6. Finalmente la vista es mostrada al cliente usando los datos del objeto Model
   3. Hay una clara separacion de funciones
      1. Controlador, validadores, objeto form, DispatcherServlet, handler mapping, view resolver, etc
      2. Llevan a cabo una tarea especifica y pueden ser reemplazadbles sin afectar a los demas
   4. ¿Que hace un controlador?
      1. Los Controladores proporcionan acceso a la logica de negocio
      2. Delega la logica de negocio a un conjunto de componentes de servicios
      3. Los servicios a su vez acceden a las bases de datos mediante la interfaz DAO (objeto de acceso a datos)
      4. Los Controladores reciben parametros del usuario (input) y lo convierten en un objeto del modelo, poblando en sus atributos los datos enviados, como resultado de la logica de negocio
   5. La anotacion @ModelAttribute
      1. Provee datos para pasarle a la vista de forma separada al metodo del controlador
      2. Provee datos para todo el controlador y que esté disponible para todas las vistas
      3. ```
         @ModelAttribute("usuarios")
         public List<Usuario> poblarUsuarios() {
            ...
            //creamos la lista usuarios
            ...
            return usuarios;
         }
         ```
   6. La anotacion @RequestParam
      1. Envia parametros a nuestro controlador mediante la URL
      2. Tambien se puede usar el objeto HttpServletRequest para inyectarlo en el metodo
   7. La anotacion @PathVariable
      1. Envia parametros mediante la ruta
      2. ```
         @GetMapping("/string/{texto}")
         public String variables(@PathVariable String texto, Model model) {
         ...
         ```
      3. ```
         @GetMapping("/string/{texto}/{numero}")
         public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
         ...
         ```
   8. La anotacion @Value
      1. Inyecta valores que estan dentro de nuestra application.properties
      2. Dentro de nuestro controlador
      3. ```
         @Value("${texto.indexcontroller.index.titulo}")
         private String textoIndex;
         ```
      4. Dentro de nuestro application.properties
      5. ```
         texto.indexcontroller.index.titulo=Hola Spring Framework con Model!
         ```
         