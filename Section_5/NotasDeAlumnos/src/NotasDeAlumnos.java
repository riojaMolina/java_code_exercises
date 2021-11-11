import java.util.Scanner;

public class NotasDeAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        double notas[] = new double[20];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese una nota (escala 1 a 7): ");
            notas[i] = scanner.nextDouble();
            if (notas[i] == 0) {
                salir = true;
                break;
            }
        }
        if (!salir) {
            double sumaTotal = 0.0;

            double menoresCuatro = 0.0;
            int cantMenoresCuatro = 0;

            double mayoresCinco = 0.0;
            int cantMayoresCinco = 0;

            int cantUnos = 0;

            for (int i = 0; i < notas.length; i++) {
                sumaTotal += notas[i];
                if (notas[i] <= 4) {
                    menoresCuatro += notas[i];
                    cantMenoresCuatro++;
                    if (notas[i] == 1) {
                        cantUnos++;
                    }
                }
                else if (notas[i] >= 5){
                    mayoresCinco += notas[i];
                    cantMayoresCinco++;
                }
            }
            System.out.printf("Promedio de las notas mayores a 5: %.1f", mayoresCinco/cantMayoresCinco);
            System.out.printf("\nPromedio de las notas inferiores a 4: %.1f", menoresCuatro/cantMenoresCuatro);
            System.out.printf("\nCantidad de notas 1: %d", cantUnos);
            System.out.printf("\nPromedio total: %.1f", sumaTotal/notas.length);
        }
        else
            System.out.println("Error!: programa finalizado");
    }
}
