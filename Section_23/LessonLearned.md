## Lesson Learned: *Manejo de Excepciones*
1. Una excepcion es un problema o evento que ocurre durante la ejecucion del programa que interrumpe el flujo normal.
2. Separa el codigo que gestiona los errores del codigo principal del programa
3. Nos permite manejar el error y continuar con la ejecucion del programa
4. Agrupar y diferenciar entre diferentes tipos de errores
5. Propagar errores hacia arriba en la pila de llamadas (StackTrace)
6. Se maneja con la estructura try...catch...finally
   1. Una estructura que nos permite capturar excepciones, reaccionar a un error de ejecucion, podemos imprimir mensajes de error "a la medida" y continuar con la ejecucion del programa
7. Se pueden capturar multiples excepciones (con varios bloques catch)
8. Cuando se lanza una excepcion, lo que se hace es lanzar una instancia de Exception o de una clase derivada.
9. Existen 2 tipos de Excepciones: Chequeadas y NO chequeadas
10. Los metodos deben capturar o propagar todas las excepciones chequeadas que puedan ser lanzadas dentro de su ambito
    1. Esto es con la clausula throws que lista una o varias excepciones que son lanzadas en el metodo
    2. Los metodos utilizan la sentencia throw para lanzar una excepcion
       1. Esta sentencia requiere un solo argumento, un objeto Throwable
