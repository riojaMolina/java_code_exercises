## Lesson Learned: *Patrones de Diseño*
1. Son fragmentos de codigo, algoritmos, que nos permiten resolver algun problema cotidiano que se repite una y otra vez
2. Hay trs tipos, patrones creacionales, estructurales y de comportamiento
3. Singleton:
   1. Es creacional. Nos permite crear una sola instancia de una clase. Tipicamente se usa para conexiones de base de datos
   2. Tiene un constructor private
   3. Tiene un metodo estatico que nos devuelva la instancia
4. Abstrac Factory:
   1. Es creacional. Para crear familias de objetos. Familias que estan relacionadas mediante la herencia o interfaces
   2. Tiene dos partes. El producto y las clases fabrica
   3. Las clases fabrica son concretas y crean los productos concretos. Heredan de una fabrica abstracta
5. Decorator:
   1. Es estructural. Anida componentes. Hay una relacion de agregacion al componente de forma recursiva
   2. Componente: Define la interfaz para los objetos que pueden tener responsabilidades añadidas
   3. Componente concreto: Define un objeto al cual se le pueden agregar responsabilidades adicionales
   4. Decorador: Mantiene una referencia al componente asociado. Implementa una interfaz de la superclase Componente delegando en el componente asociado.
   5. Decorador concreto: Añasde responsabilidades al componente
6. Composite:
   1. Es estructural. Nos permite construir objetos complejos a partir de otros objetos mas simples, pero que tengan en comun alguna clase abstracta o interfaz.
   2. Tiene tambien un metodo recursivo
   3. Hay una clase compositor que es hija del componente (abstracto) y que tiene a su vez componentes
7. Observer:
   1. Es de comportamiento
   2. Define una dependencia del tipo uno a muchos entre objetos, de manera que cuando uno de los objetos cambia su estado, notifica este cambio a todos los dependientes
   3. Un sujeto tiene uno o mas observadores