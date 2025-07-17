import java.util.Scanner;

public class Orden {
public static void main(String[] args) {
    //Importar la bibliotecaScanner
    Scanner teclado = new Scanner(System.in);
    //Definimos las varibles
    int num1,num2,num3;
    //Pedimos el ingreso de datos
    System.out.println("Ingrese el valor 1");
    num1 = teclado.nextInt();
    System.out.println("Ingrese el valor 2");
    num2 = teclado.nextInt();
    System.out.println("Ingrese el valor 3");
    num3 = teclado.nextInt();
    //Proceso para saber si esta en orden o no y salida
    if (num1>num2) {
        if (num1>num3) {
            if (num2>num3) {
                System.out.println("Los numeros estan en orden de mayor a menor");
            }
            else {
                System.out.println("Los numeros no estan en orden");
            }
        }
        else {
            System.out.println("Los numeros no estan en orden");
        }
    }
    else {
        if (num3>num2) {
            if (num3>num1) {
                if (num2>num1) {
                    System.out.println("Los numero estas ordenanos de menor a mayor");
                }
                else {
                    System.out.println("Los numeros no estan en orden");
                }
            }
            else {
                System.out.println("Los numeros no estan en orden");
            }
        }
        else {
            System.out.println("Los numeros no estan en orden");
        }
    }
}
}
