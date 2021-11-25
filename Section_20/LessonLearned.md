## Lesson Learned: *POO: Interfaces*
1. Una interfaz es una coleccion de metodos abstractos (sin implementar) y de valores constantes que puede realizar un objeto determinado
2. Una interface es como una clase abstracta pero no permite que ninguno de sus metodos este implementado
3. Capturar similitudes entre clases no relacionadas sin forzar una relacion entre ellas
4. Es decir definen comportamientos que una o varias clases necesitan implementar
5. Es un tipo de dato de referencia, que puede utilizarse como tipo de dato del objeto (argumento de metodos y una declaracion de variables)
6. Definen relaciones de clases en base al comportamiento y no por sus atributos
7. En Java, las interfaces permiten pasar del estilo de diseño "orientado a la implementacion" a uno "orientado a la interfaz"
8. Donde todas las clases acceden a servicios a traves de interfaces que son implementadas por clases concretas
9. Y al no depender de clases concretas (solo de entidades abstractas) nuestro diseño sera mas reutilizable
10. ```
    public interface Imprimible {
        public void imprimir();
    }
    ```
11. Con Java 8 las interfaces pueden tener metodos default (que son opcionales a implementar y con cuerpo en la interfaz) y metodos estaticos con cuerpo que son propios de la interfaz
    ```
    public interface Imprimible {
        default String imprimir() {
            return "Imprimiendo un valor por defecto";
        }
        static void imprimir(Imprimible imprimible) {
            System.out.println(imprimible.imprimir());
        }
    }
    ```
    Entonces las clases que implementan esta interfaz nueva no tienen que implementar obligatoriamente el metodo imprimir().. La interfaz da un imprimir() por defecto  
    Y puedo usar desde la interfaz misma los metodos estaticos como si fueran de utilidad
    ```
    Imprimible.imprimir(algo);
    ```
12. Tambien en las interfaces puedo tener constantes
