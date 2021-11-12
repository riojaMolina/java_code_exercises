## Lesson Learned: *Clases Wrapper*
1. Cada tipo primitivo tiene su equivalente en un tipo de referencia o clase
2. Dan mayor funcionalidad para operaciones de comprobaciones y conversiones
3. Cada tipo numerico tiene su propia clase de objetos
4. INTEGER (Similares a Long, Short, Byte, Double, Character, Boolean)
   1. El tipo int tiene la clase Integer
   2. Se implementan varios metodos utiles dentro del wrapper Integer: .intValue() .longValue() Integer.parseInt("12345")
   3. Ya no se utiliza el new para crear un objeto de la clase Integer, se utiliza Integer.valueOf(1234);
   4. Hay que tener cuidado con la perdida de datos cuando se convierte de uno de menor espacio. Ejemplo Integer a Short
5. Autoboxing y unboxing
   1. Autoboxing toma un valor literal y lo convierte en un wrapper de forma automatica. Ejemplo Integer entero = 1;
   2. Unboxing significa que se pueden usar como literales con las operaciones
6. En los wrappers numericos se pueden usar los operadores > y < directamente. El == se puede usar hasta el numero 127, despues usar el equals
7. El Boolean se pueden comparar con el == para comparar los valores. No va comparar las referencias de instancias
8. El metodo .getClass() brinda informacion sobre la clase