import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombreFactura = "";
        System.out.print("Ingrese el nombre de la factura: ");
        nombreFactura = scanner.nextLine();
        System.out.print("Ingrese el monto de un producto: ");
        double prod1 = scanner.nextDouble();
        System.out.print("Ingrese el monto de un producto: ");
        double prod2 = scanner.nextDouble();
        double sumaBruto = prod1 + prod2;
        double impuesto = 0.19 * sumaBruto;
        double sumaTotal = sumaBruto + impuesto;
        System.out.printf("La factura %s tiene un total bruto de %.2f, con un impuesto de %.4f y el monto despues de impuesto es de %.4f", nombreFactura, sumaBruto, impuesto, sumaTotal);
    }
}
