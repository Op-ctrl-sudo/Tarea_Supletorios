import java.util.Scanner;

public class Digito_Mayor {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num,digito,mayor=0;
    System.out.println("Ingrese un numero");
    num=teclado.nextInt();
    do {
        digito=num%10;
        if (digito>mayor) {
            mayor=digito;
        }
        num/=10;
    } while (num>0);
    System.out.println("El digito mayor es: "+mayor);
}
}
