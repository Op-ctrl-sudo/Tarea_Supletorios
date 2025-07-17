import java.util.Scanner;

public class Palindromo {

    private Scanner teclado;
    private String palabra;

    public void proceso(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabra = teclado.next();
    }

    public void PalabraPalindromo(){
        String b="";
        for (int i = palabra.length() -1; i>= 0; i--) {
            b += palabra.charAt(i);
        }
        if (palabra.equalsIgnoreCase(b)) {
            System.out.println("La palabra"+palabra+" es un palindromo");
        }
        else {
            System.out.println("La palabra "+palabra+" no es un palindromo");
        }
    }

    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();
        palindromo.proceso();
        palindromo.PalabraPalindromo();
    }

}
