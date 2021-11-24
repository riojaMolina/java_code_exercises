## Lesson Learned: *POO: Herencia*
1. Es una relacion de parentesco entre dos clases, una es padre de la otra, una es hija de la otra
2. Es el mecanismo de la programacion orientada a objetos para implementar relaciones de jerarquia de clases
3. Una subclase hereda el estado y el comportamiento de todos sus ancestros
4. Es una de las bases de reutilizacion de codigo y polimorfismo
5. Tambien es un principio fundamental de la POO
6. No puede existir herencia si no existe alguna relacion familiar entre ambas clases
7. Se utiliza la palabra reservada extends. El termino superclase se refiere a la clase que es el ancestro mas directo, asi como a todas las clases ascendentes
8. Hay dos formas distintas para el el proceso de creacion de jerarquias de clases o herencia
   1. Generalizacion
   2. Especializacion
9. Con la palabra super puedo invocar el constructor del padre y luego los atributos del hijo
10. Se pueden sobreescribir en el hijo los metodos del padre
11. Para impedir la herencia usamos la palabra final.
12. Los atributos privados en la clase padre no pueden ser accedidos desde la clase hijo.
    1. Se pueden implementar los getters para poder ser accedidos desde el hijo
    2. O cambiar el modificador a protected en los atributos
13. Cuando tengo un constructor con parametros en el hijo tengo que llamar explicitamente al constructor del padre con super
14. 