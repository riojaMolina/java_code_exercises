import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Ingrese un 1er nombre completo");
        String name2 = JOptionPane.showInputDialog("Ingrese un 2do nombre completo");
        String name3 = JOptionPane.showInputDialog("Ingrese un 3er nombre completo");

        String nameMax;
        nameMax = name1.split(" ")[0].length() > name2.split(" ")[0].length()? name1 : name2;
        nameMax = nameMax.split(" ")[0].length() > name3.split(" ")[0].length()? nameMax : name3;

        System.out.println(nameMax.concat(" tiene el nombre mas largo"));
    }
}
