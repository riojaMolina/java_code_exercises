import java.util.Scanner;

public class ImprimirX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño 'n' de la matriz (nxn): ");
        int n = scanner.nextInt();

        if (n > 0) {
            String[][] matriz = new String[n][n];
            //popula la identidad e identidad espejo
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j || i + j == matriz.length - 1) {
                        matriz[i][j] = "X";
                    }
                    else {
                        matriz[i][j] = "_";
                    }
                }
            }

            //imprime la matriz X
            for (String[] fila: matriz) {
                for (String value: fila) {
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
