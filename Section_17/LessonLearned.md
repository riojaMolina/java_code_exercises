## Lesson Learned: *POO: Sobrecarga de metodos*
1. Se refiere a la posibilidad de tener dos o mas metodos con el mismo nombre pero con funcionalidad diferente
2. La cantidad de argumentos y el tipo de argumentos es la clave para hacer sobrecarga de metodos
3. El tipo de retorno no influye en la sobrecarga
4. Varargs es numero de argumentos variable. Se lo representa con 3 puntos.
    ```
    public int sumar(int... argumentos) {
        int total = 0;
        for(int i: argumentos) {
            total += i;
        }
        return total;
    }
    ```