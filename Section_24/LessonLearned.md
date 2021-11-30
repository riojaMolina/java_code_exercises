## Lesson Learned: *Estructura de Datos: API de Coleccion de Java*
1. Las colecciones son para almacenar objetos, agrupar y tiene dos grandes tipos: Collection y Map
2. Los Collection es un API para agrupacion de objetos, consta de tres tipos: *List*, *Set* y *Map*, siempre con alguna regla que se les puede aplicar
   1. Una List almacenará objetos en una secuencia determinada
   2. Un Set no permitirá elementos duplicados y NO mantiene el orden de sus elementos
   3. Los Maps (Mapas) almacenan informacion en base a parejas de llaves y valores
3. TreeSet agregara elementos unicos y los ordenará de acuerdo a Comparable
   1. Tengo que implementar la interfaz Comparable en la clase que construí
   2. Ó pasar en el constructor del TreeSet el Comparator que quiero (a confirmar)
   3. Ojo que el Comparable tambien se usa para la singularidad de la estructura, no solo para el ordenamiento
4. En el HashSet la singularidad primero la da el hashcode y despues por el equals
5. En el TreeMap ordena mediante la llave o sino puedo pasarle un Comparator en el constructor
6. 