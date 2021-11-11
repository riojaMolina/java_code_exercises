import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros a ingresar: ");
        int cant = scanner.nextInt();

        int numeros[] = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = scanner.nextInt();
        }

        int min = numeros[0];
        for (int i = 0; i < cant; i++) {
            if (numeros[i] < min)
                min = numeros[i];
        }

        System.out.println("El menor numero es: " + min);
        if (min < 10)
            System.out.println("El numero menor es menor que 10!");
        else
            System.out.println("El numero menor es igual o mayor que 10!");
    }
}
