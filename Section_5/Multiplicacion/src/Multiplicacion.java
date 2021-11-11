import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese otro numero entero: ");
        int num2 = scanner.nextInt();

        int multi = 0;
        if (num1 == 0 || num2 == 0) {
            multi = 0;
        }
        else if (num2 < 0) {
            for (int i = 0; i < -num2; i++) {
                multi += -num1;
            }
        }
        else {
            for (int i = 0; i < num2; i++) {
                multi += num1;
            }
        }

        System.out.println("La multiplicacion es: " + multi);
    }
}
