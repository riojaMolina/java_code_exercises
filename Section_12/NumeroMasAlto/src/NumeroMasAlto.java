import java.util.Random;

public class NumeroMasAlto {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(99 - 11 + 1) + 11; //aleatorio entre 11 y 99 incluidos
            System.out.print(numeros[i] + " ");
        }

        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            max = max < numeros[i]? numeros[i] : max;
        }
        System.out.println("\nEl numero mas alto es: " + max);
    }
}
