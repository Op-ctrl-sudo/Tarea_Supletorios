import java.util.Scanner;

public class Raiz_Cuadrada {
public static void main(String[] args) {
    //Importamos la biblioteca Scanner
    Scanner teclado = new Scanner(System.in);
    //Definimos las variables
    int num;
    float raiz;
    //Pedimos el ingreso de datos
    System.out.println("Ingrese un numero");
    num = teclado.nextInt();
    //Proceso para resolver la raiza cuadrada
    if (num<0) {
        System.out.println("El numero ingresado no se puede resolver");
    }
    else {
        raiz = (float)Math.sqrt(num);
        //Salida de datos
        System.out.println("La raiz de "+num+" es de: "+raiz);
    }
}
}
