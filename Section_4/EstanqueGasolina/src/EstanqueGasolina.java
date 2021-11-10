import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la medida actual de gasolina en litros: ");
        double medida = scanner.nextDouble();

        String res;
        if (medida == 70)
            res = "Estanque lleno";
        else if (medida < 70 && medida >=60)
            res = "Estanque casi lleno";
        else if (medida < 60 && medida >= 40)
            res = "Estanque 3/4";
        else if (medida < 40 && medida >= 35)
            res = "Medio Estanque";
        else if (medida < 35 && medida >= 20)
            res = "Suficiente";
        else
            res = "Insuficiente";

        System.out.println(res);
    }
}
