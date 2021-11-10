## Lesson Learned: *Operadores*
- Distintos tipos de operadores
1. Operadores aritmeticos
   1. Suma/Resta de numeros con String (precedencia). El unico que se puede usar es la suma si la precedencia es String primero
   2. Division de enteros si la variable de destino es distinto a entero hay que hacer un casting
2. Operadores de asignacion
   1. Asigna un valor a una variable
   2. Asignacion compuesta. Ejemplo i += 5 es lo mismo que i = i + 5. Sirve para todos los tipos de datos primitivos y String
3. Operadores unarios
   1. Se usan para invertir el signo int i = -5; int j = -i; j va a valer 5 positivo
4. Operadores de Incremento y Decremento
   1. Pre incremento: ++i
   2. Post incremento: i++
   3. Pre decremento: --i
   4. Post decremento: i--
5. Operadores relacionales
   1. Devuelven un tipo booleano
   2. Solo usar el operador == para comparar tipos de datos primitivos
6. Operadores logicos
   1. Evaluan operandos para devolver un tipo booleano
   2. AND (& y &&) el doble and es cortocicuitante
   3. OR (| y ||) el doble or es cortocircuitante
   4. XOR (^) true si los dos son distintos
7. Operador ternario
   1. variable = condicion ? retorno si es true : retorno si es false;
   2. Simplificacion del if-else
   3. Siempre retorna un valor 
8. Operador instanceof
   1. Determina si un objeto es del tipo de una clase