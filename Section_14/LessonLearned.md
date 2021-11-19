## Lesson Learned: *POO: Clases y objetos*
1. Los objetos son entidades que combinan estado y comportamiento
2. El estado son los atributos o caracteristicas que tienen en cierto momento
3. El comportamiento son las funciones, funcionalidades o metodos
4. Los objetos los sacamos de una clase
   1. Un molde de como va ser la entidad que queremos crear
   2. Las instancias de la clase son los objetos
5. Los objetos son unicos en el sistema
6. Como ejemplo las clases se definen como
   ```
   public class Automovil {
   ```
7. Como ejemplo para crear un objeto:
   ```
   Automovil auto = new Automovil();
   ```
8. Los atributos de un objeto instanciado se pueden acceder y cambiar de forma directa cuando no tienen modificador o son publicos
9. Los nombres de clase son camel case. Los nombres de atributos y metodos en lower camel case
10. El pricipio de encapsulamiento no es lo mismo que el principio de ocultacion
    1. El encapsulamiento no revela el proceso interno. Por ejemplo un metodo del mismo nombre con diferentes parametros
    2. La ocultacion es sobre la visibilidad de un metodo o variable implementado con los modificadores de acceso
11. Se pueden tener varios constructores.
    1. Por defecto existe el constructor sin parametros.
    2. Si definimos un constructor con parametros y NO definimos explicitamente el sin parametros, el sin parametros deja de existir
12. Se pueden sobreescribir los metodos de la clase padre (Object), por ejemplo equals, toString, etc.. para customizar mi clase
13. Los atributos y metodos estaticos pertenecen a la clase y son compartidos por todos los objetos de esta clase
    1. No se puede usar this en un contexto estatico
    2. Es recomendable siempre invocar los atributos y metodos estaticos con el nombre de la clase
14. Los atributos final son constantes
15. Los Enum son parecidos a las clases y contienen constantes
    1. Se pueden usar dentro de los switch case