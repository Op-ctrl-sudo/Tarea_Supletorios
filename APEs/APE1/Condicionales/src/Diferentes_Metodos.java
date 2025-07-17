import java.util.Scanner;

public class Diferentes_Metodos {
public static void main(String[] args) {
    //Importamos la biblioteca Scanner
    Scanner teclado = new Scanner(System.in);
    //Definimos las variables
    float num1,num2,num3,resul1,resul2,resul3;
    //Escribir las diferentes formas de saber que una variable numerica es par
    System.out.println("Los metodos para saber si un numero es par son los siguientes:");
    System.out.println("1.- Dividir el numero para 2 y que el resultado sea un numero entero");
    System.out.println("Ingrese un numero");
    num1 = teclado.nextFloat();
    //Primer proceso para saber si es entero o no y salida de datos
    resul1 = num1/2;
    if (resul1==Math.floor(resul1) ) {
        System.out.println("El numero "+num1+" es par");
    }
    else {
        System.out.println("El numero "+num1+" no es par");
    }
    System.out.println("2.- El modulo del numero al dividir para dos debe ser 0");
    System.out.println("Ingrese un numero");
    num2 = teclado.nextFloat();
    //Segundo proceso para saber si es entero o no y salida de datos
    resul2=num2%2;
    if (resul2==0) {
        System.out.println("El numero "+num2+" es par");
    }
    else {
        System.out.println("El numero "+num2+" no es par");
    }
    System.out.println("3.- Fijarnos en el ultimo digito y si es multiplo de 2 es par");
}
}
