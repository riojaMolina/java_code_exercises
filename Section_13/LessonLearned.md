## Lesson Learned: *Matrices: arreglos bidimensionales*
1. Matrices: son arreglos bidimensionales, donde cada uno de sus elementos es a su vez un arreglo en su segunda dimension
2. Permite que no todos los elementos tengan el mismo tamaño
3. Es posible crear matrices recursivas y multi-dimensionales
4. Para la declaracion es int[][] numeros; los primeros corchetes son las filas y los segundos las columnas
   1. int[][] numeros = new int[2][3]
5. Para obtener el tamaño de las filas numeros.length
   1. Para obtener el tamaño de una fila numeros[0].length
6. Para crear de forma simplificada int[][] numeros = {{1,2,3,4},{11,12,13,14}};
7. Para recorrer una matriz usando for:
   ```
   for (int i = 0; i < numeros.length; i++) {
     for (int j = 0; j < numeros[i].length; j++) {
   ```
8. Para recorrer una matriz usando foreach:
   ```
   for (String[] fila: nombres) {
     for (String nombre: fila) {
   ```
9. Puede haber columnas variables: 
   1. int[][] matriz = new int[3][];
   2. matriz[0] = new int[2];
   3. matriz[1] = new int[3];
   4. matriz[2] = new int[4];
10. Una matriz simetrica significa que los elementos de sus filas es igual a los elementos de sus columnas
   ```
   int[][] matriz = {
      {1,2,3,4},
      {2,1,0,5},
      {3,0,1,6},
      {4,5,6,7}
    }
   ...
   for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < i; j++) { //solo la diagonal inferior j < i
         if (matriz[i][j] != matriz[j][i]) {
            simetrica = false;
         }
      }
   }
   ```
11. La matriz transpuesta: la idea es dar vuelta las filas por las columnas o viceversa: es decir el [i][j] lo dejamos en [j][i]
   ```
   int aux;
   for (int i = 1; i < matriz.length; i++) { //es mejor que parta en i = 1
      for (int j = 0; j < i; j++) { //solo la diagonal inferior j < i
         aux = matriz[i][j];
         matriz[i][j] = matriz[j][i];
         matriz[j][i] = aux;
      }    
   }
   ```
12. Para crear una matriz transpuesta de otra:
   ```
   int[][] a, b;
   a = new int[8][4];
   b = new int[4][8];
   ...
   for (int i = 0; a < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
         b[j][i] = a[i][j];
      }
   }
   ```
13. Para crear una matriz identidad:
   ```
   int[][] matriz = new int[5][5];
   for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
         if (i == j) {
            matriz[i][j] = 1;
         }
      }
   }
   ```
14. Para crear una matriz marco:
   ```
   int[][] matriz = new int[5][5];
   for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
         if (i == 0 || matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
            matriz[i][j] = 1;
         }
      }
   }
   ```
15. Para crear una matriz combinada entre identidad y marco:
   ```
   int[][] matriz = new int[5][5];
   for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
         if (i == 0 || matriz.length - 1 || j == 0 || j == matriz[i].length - 1 || i == j) {
            matriz[i][j] = 1;
         }
      }
   }
   ```
