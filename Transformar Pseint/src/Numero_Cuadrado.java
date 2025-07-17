import java.util.Scanner;

public class Numero_Cuadrado {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    float num;
System.out.println("Mostrar el cuadrado del numero hasta que salga negativo");
do {
    System.out.println("Ingrese un numero");
    num= teclado.nextFloat();
    if (num>=0) {
        num=(float)(Math.pow(num, 2));
        System.out.println("El cuadrado del numero es: "+num);
    }
} while (num>=0);
}
}
