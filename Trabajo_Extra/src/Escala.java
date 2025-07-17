import java.util.Scanner;

public class Escala {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[5];
        int escalar = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese los valores del vector: " + i);
            vector[i] = teclado.nextInt();
        }
        System.out.print("Ingrese un número escalar para multiplicar: ");
        escalar = teclado.nextInt();
        System.out.println("Vector resultante:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= escalar;
            System.out.print(vector[i] + " ");
        }
    }
}
