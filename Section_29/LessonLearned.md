## Lesson Learned: *Spring Framework 5: Manejo de errores*
1. Una forma de manejar errores por convencion dentro de Templates se crea una carpeta "error"
   1. Dentro de la carpeta "error", por convencion crear un HTML file llamado 500.html para manejar los errores 500
   2. Por convencion tambien puedo crear el HTML 404.html para manejar los errores de 404
2. Otra forma para manejar errores es crear un controlador especial
   1. ```
      @ControllerAdvice
      public class ErrorHandlerController {
        
        @ExceptionHandler(ArithmeticException.class)
        public String aritmeticaError(ArithmeticException ex, Model model) {
            model.addAttribute("error", "Error de aritmetica");
            model.addAttribute("message", ex.getMessage());
            model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROOR.value());
            model.addAttribute("timestamp", new Date());
            return "error/aritmetica"
        }
      }
      ```
   2. Creamos en los templates dentro de error el HTML file aritmetica.html
3. Otra forma de manejar errores mas personalizado podria ser crear exceptions personalizadas, lanzarlas cuando ocurra alguna excepcion de nuestros objetos y manejarlas en nuestro ErrorHandlerController