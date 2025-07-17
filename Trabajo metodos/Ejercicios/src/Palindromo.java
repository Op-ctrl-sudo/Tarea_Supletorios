import java.util.Scanner;

public class Palindromo{

    public Scanner teclado;
    public String palabra="", palabrainversa="";
    public void IngresarPalabra(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabra = teclado.next();
        palabra=palabra.toLowerCase();
    }

    public void Inversa(){
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabrainversa += palabra.charAt(i);
        }
        if (palabra.equals(palabrainversa)) {
            System.out.println("La palabra " + palabra + " es un palíndromo.");
        } else {
            System.out.println("La palabra " + palabra + " no es un palíndromo.");
        }
    }

    public static void main(String[] args) {
        Palindromo obj = new Palindromo();
        obj.IngresarPalabra();
        obj.Inversa();
    }
}

