import java.util.Random;
import java.util.Scanner;

public class SistemaEstadistico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero entero: ");
            numeros[i] = scanner.nextInt();
        }
        double sumPosi = 0.0, sumNega = 0.0;
        int cantCero = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0)
                sumPosi += numeros[i];
            else if (numeros[i] < 0)
                sumNega += Math.abs(numeros[i]);
            else
                cantCero++;
        }
        System.out.println("\nEl promedio de numeros positivos es: " + (sumPosi/numeros.length));
        System.out.println("El promedio de numeros negativos es: " + (sumNega/numeros.length));
        System.out.println("La cantidad de ceros es: " + cantCero);
    }
}
