import java.util.Scanner;

public class ClasificarCaracter {

    public Scanner teclado;

    public void clasificar(char c) {
        if (Character.isDigit(c)) {
            System.out.println("Número");
        } else if (Character.isLetter(c)) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                if (Character.isUpperCase(c)) {
                    System.out.println("Vocal mayúscula");
                } else {
                    System.out.println("Vocal minúscula");
                }
            } else {
                if (Character.isUpperCase(c)) {
                    System.out.println("Consonante mayúscula");
                } else {
                    System.out.println("Consonante minúscula");
                }
            }
        } else {
            System.out.println("Símbolo");
        }
    }

    public static void main(String[] args) {
        ClasificarCaracter obj = new ClasificarCaracter();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un carácter: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Mas de un caracter.");
        } else {
            char c = input.charAt(0);
        }
        char c = input.charAt(0);
        obj.clasificar(c);
    }

}
