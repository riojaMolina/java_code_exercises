## Lesson Learned: *Unit Testing: JUnit 5*
1. Nos permite escribir nuestras pruebas y tener en una sola clase multiples pruebas
2. Nos da un sistema de reporteria para saber en donde ocurrieron errores
3. Las pruebas unitarias son un proceso de examen para verificar que una pieza de codigo cumple con ciertas reglas de negocio y afirmar un resultado esperado
4. JUnit test es una libreria java para escribir y ejecutar repetibles pruebas unitarias
5. JUnit  es un framework para escribir pruebas unitarias de nuestro codigo y ejecutarlas en la JVM. Utiliza programacion funcional y lambda e incluye varios estilos diferentes de pruebas, configuraciones, anotaciones, ciclos de vita, etc.
6. JUnit 5 se compone de varios componentes:
   1. JUnit Platform: es el core, libreria principal. Es el framework de ejecucion
   2. JUnit Jupiter: es donde nosotros escribimos nuestras purebas
      1. API para escribit nuestros tests
      2. Agrega nuevo modelo y caracteristicas en JUnit 5
      3. Nuevas anotaciones y estilos de testing
      4. Permite escribir extensiones
   3. JUnit Vintage: es un componente que nos permite integrar versiones 4 y 3 si ya teniamos
7. Si falla al menos un Assertion en un test, falla todo el test
8. Test Driven Development
   1. Primero creamos nuestros tests de acuerdo a nuestras reglas de negocio y despues implementamos el codigo
   2. Podemos crear primero los metodos vacios para que quede definido y para que en el test exista