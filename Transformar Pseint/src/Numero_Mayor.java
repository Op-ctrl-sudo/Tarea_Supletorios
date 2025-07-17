import java.util.Scanner;

public class Numero_Mayor {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
 int num1,num2;
 System.out.println("Ingrese el valor 1");
 num1 = teclado.nextInt();
 System.out.println("Ingrese el valor 2");
 num2 = teclado.nextInt();
 if (num1>num2) {
    System.out.println("El numero "+num1+" es mayor a "+num2);
 }
 else {
    if (num1<num2) {
        System.out.println("El numero "+num2+" es mayor a "+num1);
    }
 }
}
}
