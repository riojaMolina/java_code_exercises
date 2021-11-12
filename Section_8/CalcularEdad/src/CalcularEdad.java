import java.text.*;
import java.util.*;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print("Ingrese una fecha de nacimiento (dia-mes-año): ");

        try {
            Calendar calendarNac = Calendar.getInstance();
            calendarNac.setTime(formatter.parse(scanner.nextLine()));

            Calendar calendarActual = Calendar.getInstance();
            calendarActual.setTime(new Date());

            System.out.println("Tiene: " + (calendarActual.get(Calendar.YEAR) - calendarNac.get(Calendar.YEAR)) + " años");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
