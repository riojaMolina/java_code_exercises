## Lesson Learned: *Flujos de control*
1. Se usan para ejecutar codigo de acuerdo a alguna condicion
2. Separadores () [] {} ; , .
3. IF ELSE
   1. La condicion adentro del if es del tipo booleano
   2. Se ejecuta el codigo dentro del bloque if si se cumple la condicion
   3. Si existe un else correspondiente al if, se ejecuta el codigo adentro de este si la condicion no se cumplió
   4. Se pueden anidar varios if con else
4. SWITCH CASE
   1. Evalua casos de acuerdo a una variable que puede ser char, int, byte, short, int, wrappers, String o enum
   2. Se ejecuta el codigo adentro del case
   3. Recomendable usar el break en cada caso
   4. El caso default es opcional
5. FOR
   1. Cuando se conoce los limites del bucle
   2. (inicializacion, su condicion de termino y su instruccion de incremento)
   3. Se puede terminar prematuramente con la palabra break
   4. Se puede pasar a la siguiente iteracion con la palabra continue
6. WHILE
   1. Se repite el bloque de codigo mientras la condicion sea verdadera
   2. Se puede terminar prematuramente con la palabra break
   3. Se puede pasar a la siguiente iteracion con la palabra continue
7. DO WHILE
   1. Se ejecuta al menos una vez y despues se repite mientras la condicion sea verdadera
   2. Se puede terminar prematuramente con la palabra break
   3. Se puede pasar a la siguiente iteracion con la palabra continue
8. FOREACH
   1. Mas resumido que un for comun 
   2. Se usa para colecciones que implementan la interfaz Iterable
   3. Se puede terminar prematuramente con la palabra break
   4. Se puede pasar a la siguiente iteracion con la palabra continue
9. Etiquetas
   1. Controlan la ejecucion
   2. Se utilizaon justo antes de un ciclo que a su vez tenga otro ciclo y/o un switch anidado
   3. Trabajan con las palabras break y continue 
