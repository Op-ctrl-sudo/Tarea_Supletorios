import java.util.Scanner;

public class Caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] caracteres = new String[5];
        String[] inverso = new String[5];
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Ingrese la palabra "+i);
            caracteres[i] = teclado.nextLine();
        }
        for (int i = 0; i < caracteres.length; i++) {
            inverso[i] = caracteres[caracteres.length - 1 - i];
        }
        for (String palabra : caracteres) {
            System.out.println(palabra);
        }
        System.out.println("El orden invertido es: ");
        for (String palabra : inverso) {
            System.out.println(palabra);
        }

    }
}
