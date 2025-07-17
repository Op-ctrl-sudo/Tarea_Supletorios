import java.util.Scanner;

public class Suma_Producto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[4];
        int suma = 0, producto = 1;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingrese el valor del numero " + i);
            numero[i] = teclado.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }
        for (int i = 0; i < numero.length; i++) {
            producto *= numero[i];
        }
        System.out.println("La suma de los numero es: " + suma);
        System.out.println("El producto de los numero es: " + producto);
    }
}