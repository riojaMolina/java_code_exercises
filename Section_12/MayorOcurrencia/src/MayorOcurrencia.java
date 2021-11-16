import java.util.Random;

public class MayorOcurrencia {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(9 - 1 + 1) + 1; //aleatorio entre 1 y 9
            System.out.print(numeros[i] + " ");
        }
        int counter = 0 , maxCounter = 0, maxElement = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            counter = 1;
            for (int j = i; j < numeros.length - 1; j++) {
                if (numeros[i] == numeros[j + 1]) {
                    counter++;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                maxElement = numeros[i];
            }
        }
        System.out.println("\nLa mayor ocurrencias es: " + maxCounter);
        System.out.println("El elemento que mas se repite es: " + maxElement);
    }
}
