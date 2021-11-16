import java.util.Random;

public class Histograma {
    public static void main(String[] args) {
        Random r = new Random();
        int[] numeros = new int[12];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(6 - 1 + 1) + 1; //aleatorio entre 1 y 6
            System.out.print(numeros[i] + " ");
        }

        int[] sample = {1, 2, 3, 4, 5, 6};
        System.out.println();
        for (int i = 0; i < sample.length; i++) {
            System.out.print(sample[i] + ": ");
            for (int j = 0; j < numeros.length; j++) {
                if (sample[i] == numeros[j]) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
