import java.util.Scanner;

public class Factorial {
    private int numero;
    public void resolucion(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero que quiere sacar el factorial");
        numero = teclado.nextInt();
    }

    public void factotial(){
        int i =1,resultado=1;
        while (i<=numero) {
            resultado*=i;
            i++;
        }
        System.out.println("El factorial de: "+numero+" es: "+resultado);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.resolucion();
        factorial.factotial();
    }

}
