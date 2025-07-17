import java.util.Scanner;

public class Digitos_Pares {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num, contador=0,digito=0;
    System.out.println("Ingrese un numero");
    num=teclado.nextInt();
    while (num>0) {
        digito=num%10;
        if (digito%2==0) {
            contador++;
        }
        num/=10;
    }
    System.out.println("El numero de digitos pares es de: "+contador);
}
}
