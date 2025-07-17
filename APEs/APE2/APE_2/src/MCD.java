import java.util.Scanner;

public class MCD {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1,num2,mcd;
    System.out.println("Ingrese el valor 1");
    num1=teclado.nextInt();
    System.out.println("Ingrese el valor 2");
    num2=teclado.nextInt();
    while (num2!=0) {
        mcd=num1%num2;
        num1=num2;
        num2=mcd;
    }
    System.out.println("El MCD de los numeros es: "+num1);
}
}
