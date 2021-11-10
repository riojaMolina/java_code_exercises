import java.util.Scanner;

public class OrdenaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 > num2? num1 + " " + num2: num2 + " " + num1);
    }
}
