## Lesson Learned: *Valor v/s referencia*
1. Cuando se pasa una variable por valor (un primitivo) a un metodo y lo cambia el metodo, no se cambia en el programa principal 
2. Tambien cuando se pasan las referencias del tipo inmutables. Ejemplo String, Integer, Short, Double. No se cambia el valor en el programa principal
3. Cuando se pasa una variable por referencia (un arreglo, un objeto no inmutable, objetos custom, etc) y lo cambia el metodo, tambien se cambia en el programa principal