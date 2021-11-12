## Lesson Learned: *La clase System*
1. Se utiliza para obtener propiedades del sistema
2. El archivo de propiedades tiene que ser .properties
   1. Se escriben en texto plano, minusculas y separados con puntos. Ejemplo user.name=martin molina
   2. System.getProperty("[nombre del property]")
3. Para obtener las variables de entorno System.getenv()
4. System.err.print... imprime en el estandar out de color rojo
5. Se puede invocar el garbage collector con System.gc();
6. Se puede salir del programa con System.exit(0); el 0 es recomendable cuando se hace un exit successful
7. Se puede ejecutar un programa del sistema operativo con Process