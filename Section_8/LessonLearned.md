## Lesson Learned: *Las clases Date y Calendar*
1. Se usa la clase Date para crear un objeto que contiene la fecha actual: Date fecha = new Date();
2. Con SimpleDateFormat se puede formatear la Date
3. getTime() da el tiempo actual en milisegundos. Se usa para calcular tiempos de ejecucion
4. Calendar es una clase abstracta
   1. Para sacar un instancia de Calendar seria: Calendar calendario = Calendar.getInstance();
   2. calendario.getTime() devuelve la fecha actual en objeto Date
5. El metodo parse de SimpleDateFormat convierte un string en una fecha
   1. Se tiene que setearle el formato que tiene que aceptar
6. Ejercicio  
    Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.

    Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante, también se pueden apoyar de google que hay varios ejemplos.