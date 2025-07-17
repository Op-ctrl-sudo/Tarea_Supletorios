import java.util.Scanner;

public class Determinado_Digito {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num,digito,digitob;
    System.out.println("Ingrese el digito a encontrar");
    digito=teclado.nextInt();
    System.out.println("Ingrese el numero");
    num=teclado.nextInt();
    while (num>0) {
        digitob=num%10;
        num/=10;
        if (digito==digitob) {
            System.out.println("El digito "+digito+" si se encuentra en el numero");
        break;
        }
        else {
            System.out.println("El digito "+digito+" no se encuentra en el numero");
        }
    }
}
}
