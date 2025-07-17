import java.util.Scanner;

public class Numero_Central {
    public static void main(String[] args) throws Exception {
        //Importamos la libreria del scanner
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables
        int num1,num2,num3;
        //Pedimos el ingreso de datos
        System.out.println("Ingrese el valor 1");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el valor 2");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el valor 3");
        num3 = teclado.nextInt();
        //Proceso para identificar el numero central y salida del numero central
        if (num1>num2) {
            if (num1>num3) {  
                if (num2>num3) {
                    System.out.println("El numero "+num2+" es el central");
                }
                else {
                    System.out.println("El numero "+num3+" es el central");
                }
            }
            else if (num1<num3) {
                System.out.println("El numero "+num1+" es el central");
            }
        }
        else if (num2>num1) {
            if (num2>num3) {  
                if (num1>num3) {
                    System.out.println("El numero "+num1+" es el central");
                }
                else {
                    System.out.println("El numero "+num3+" es el central");
                }
            }
            else if (num2<num3) {
                System.out.println("El numero "+num2+" es el central");
            }
        }
    }
}
