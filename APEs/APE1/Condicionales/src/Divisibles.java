import java.util.Scanner;

public class Divisibles {
public static void main(String[] args) {
    //Importamos la biblioteca de Scanner
    Scanner teclado = new Scanner(System.in);
    //Definimos las varibles
    int num1,num2;
    //Pedimos el ingreso de los numeros
    System.out.println("Ingrese el valor 1");
    num1 = teclado.nextInt();
    System.out.println("Ingrese el valor 2");
    num2 = teclado.nextInt();
    //Proceso para saber si alguno de los dos numero es divisible y salida
    if (num1%num2==0) {
        System.out.println("El numero "+num2+" es el divisor del numero "+num1);
    }
    else {
        if (num2%num1==0) {
            System.out.println("El numero "+num1+" es el divisor del numero "+num2);
        }
        else {
            System.out.println("Ninguno de los dos numero son divisor del otro");
        }
    }
}
}
