import java.util.Scanner;

public class Palindromo {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num,c;
    String a,b="";
    System.out.println("Determinar si el numero es un palindromo");
    System.out.println("Seleccione un numero del 0 al 9.999");
    num = teclado.nextInt();
    if (num<0 | num>9999) {
        System.out.println("El numero ingresado es invalido");
    }
    else {
        a=Integer.toString(num);
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        c=Integer.parseInt(b);
        if (num==c) {
            System.out.println("El número: " + num + " es palíndromo.");
        } else {
            System.out.println("El número: " + num + " no es palíndromo.");
        }
    }
}
}
