import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese 1er nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese 2do nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese 3er nombre: ");
        String nombre3 = scanner.nextLine();

        String n1Formatted = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2));
        String n2Formatted = nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        String n3Formatted = nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));
        String result = n1Formatted.concat("_").concat(n2Formatted).concat("_").concat(n3Formatted);
        System.out.println(result);
    }
}
