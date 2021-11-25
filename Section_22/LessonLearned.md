## Lesson Learned: *Tipos Genericos (Java Generics)*
1. Comprobacion de tipos mas fuerte en tiempo de compilacion
2. Eliminacion de casts aumentando la legibilidad del codigo
3. Posibilidad de implementar alritmos genericos, con tipado seguro
4. Se pueden usar con metodos tambien
   ```
   public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
   }
   ```
    Este metodo convierte cualquier array de cualquier tipo a una lista tipada
5. ```
   public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
      for(G elemento: x) {
         System.out.println(elemento);
      }
      return Arrays.asList(c);
   }
   ```
   Este metodo hace lo mismo que el de arriba pero tambien recibe otro parametro generico y lo imprime
6. Para limitar el tipo se usa Bounded Generics
   ```
   public static <T extends Number> List<T> fromArrayToList(T[] c) {
      return Arrays.asList(c);
   }
   ```
   Solo va a convertir arrays a lista a tipos que sean del tipo Number.. como Integer, Double, Short, etc..
7. Wildcards o comodines. Si tenemos el siguiente codigo:
   ```
   public static void imprimirClientes(List<Cliente> clientes) {
      clientes.forEach(System.out::println);
   }
   ```
   Solamente va a imprimir listas que sean de Cliente.. no va a ser perimitido usar listas que sean hijas de cliente.. por ejemplo ClientePremium. Por lo tanto podemos usar un comodin ?
   ```
   public static void imprimirClientes(List<? extends Cliente> clientes) {
   ```
8. Un metodo bien generico para comparar tres objetos y saber cual es el maximo:
   ```
   public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
      T max = a;
      if (b.compareTo(max)) {
         max = b;
      }
      if (c.compareTo(max)) {
         max = c;
      }
      return max;
   }
   ```
   Es un metodo que solo se puede utilizar si la clase implementa la interfaz Comparable
9. Tambien se pueden hacer clases genericas:
   ```
   public class Camion<T> implements Iterable<T> {
      private List<T> objetos;
      private int max;
      
      public Camion(int max) {
         this.max = max;
         this.objetos = new ArrayList<>();
      }
      
      public void add(T objeto) {
         if (this.objetos.size() <= max) {
            this.objetos.add(objeto);
         }
         else {
            throw new RuntimeException("no hay mas espacio.");
         }
      }
      
      @Override
      public Iterator<T> iterator() { return this.objetos.iterator(); }
   }
   ```
10. 
   



