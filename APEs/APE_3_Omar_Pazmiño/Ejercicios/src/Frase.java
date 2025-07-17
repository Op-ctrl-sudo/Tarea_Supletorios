import java.util.Scanner;

public class Frase {

    private Scanner teclado;
    private String frase;

    public void proceso() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = teclado.next();

    }

    public void CantidadPalabras() {
        String[] palabras = frase.trim().split("//s+");
        System.out.println("La cantidad de palabras es: " + palabras.length);
    }

    public void CantidadLetras() {
        int letras = 0;
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                letras++;
            }
        }
        System.out.println("El numero de letras es: " + letras);
    }

    public void CantidadVocales() {
        int vocales = 0;
        String lista = "aeiouAEIOU";
        for (char c : frase.toCharArray()) {
            if (lista.indexOf(c) != -1) {
                vocales++;
            }
        }
        System.out.println("El numero de vocales es: " + vocales);
    }

    public static void main(String[] args) {
        Frase obj = new Frase();
        obj.proceso();
        obj.CantidadLetras();
        obj.CantidadPalabras();
        obj.CantidadVocales();
    }

}
