## Lesson Learned: *Arreglos*
1. Son tipos de datos de referencia que contienen varios elementos ordenados, una coleccion
2. Sus elementos o valores estan asociados a un indice que puede contener tipos de referencia o primitivos
   1. Siempre asociado a un solo tipo de datos
3. El indice siempre comienza en 0. El total de elementos es con length
4. La declaracion es por ejemplo int[] numeros;
5. La instanciacion es int[] numeros = new int[3]; el 3 es la capacidad (tamaño fijo) que queramos
6. La inicializacion es numeros[0] = 1;
7. Otra forma de declaracion, instanciacion e inicializacion, todo en uno: int[] numeros = {1, 2, 3};
8. Recorrer un arreglo usando for: for (int i = 0; i < numeros.length; i++) {...
9. Recorrer un arreglo usando for each: for (int numero: numeros) {...
10. Para ordenar un arreglo de String: Arrays.sort(productos); ordena de la A a la Z
    1. Para ordenar un arreglo de int: Arrays.sort(numeros); ordena de menor a mayor
    2. Se pueden ordenar con cualquier tipo de datos
11. Modificar un arreglo a la inversa tiene que ser hasta numeros.length/2 ó decrementar el total dentro del for: total--
    1. Tambien se puede usar Collections.reverse(Arrays.asList(numeros));
12. Algoritmo de ordenamiento burbuja:
    ``` 
    for (int i = 0; i < total; i++){  
      for (int j = 0; j < total; j++){  
        if (productos[i].compareTo(productos[j]) < 0){  
          String auxiliar = productos[i];  
          productos[i] = productos[j];  
          productos[j] = auxiliar;
    ```
13. Algoritmo de ordenamiento burbuja optimizado:
    ``` 
    for (int i = 0; i < total - 1; i++){  
      for (int j = 0; j < total - 1 - i; j++){  
        if (productos[j + 1].compareTo(productos[j]) < 0){  
          String auxiliar = productos[j];  
          productos[j] = productos[j + 1];  
          productos[j + 1] = auxiliar;
    ```
14. Para combinar arreglos en un tercero se puede usar una variable auxiliar y postincrementarla en el for. Solo recorrer hasta la mitad o restar un total - i
15. Para copiar un arreglo System.arraycopy(...)