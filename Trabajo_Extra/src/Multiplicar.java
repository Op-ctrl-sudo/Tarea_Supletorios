import java.util.Scanner;

public class Multiplicar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] multiplicar = new int[4];
        int producto = 1;
        for (int i = 0; i < multiplicar.length; i++) {
            System.out.println("Ingrese los elementos del vector: " + i);
            multiplicar[i] = teclado.nextInt();
            producto *= multiplicar[i];
        }
        System.out.println("Producto total: " + producto);
    }

}
