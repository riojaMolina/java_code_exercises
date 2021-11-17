import java.util.Scanner;

public class ImprimirSilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño 'n' de la matriz (nxn): ");
        int n = scanner.nextInt();

        if (n > 0) {
            int[][] matriz = new int[n][n];

            //popula la silla
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    //respaldo y patas traseras
                    if (j == 0) {
                        matriz[i][j] = 1;
                    }
                    else {
                        //asiento
                        if (i == matriz[i].length/2) {
                            matriz[i][j] = 1;
                        }
                        //patas delanteras
                        else if (i > matriz[i].length/2 && j == matriz[i].length - 1){
                            matriz[i][j] = 1;
                        }
                    }
                }
            }
            //imprime la silla
            for (int[] fila: matriz) {
                for (int value: fila) {
                    System.out.print(value);
                }
                System.out.println();
            }
        }
        else {
            System.out.println("ERROR");
        }
    }
}
