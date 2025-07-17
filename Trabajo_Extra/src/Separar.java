import java.util.Scanner;

public class Separar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] original = new int[6];
        int[] pares = new int[6];
        int[] impares = new int[6];
        int par = 0, impar = 0;
        for (int i = 0; i < original.length; i++) {
            System.out.println("Ingrese los valores del vector en la posicion: " + i);
            original[i] = teclado.nextInt();
            if (original[i] % 2 == 0) {
                pares[par++] = original[i];
            } else {
                impares[impar++] = original[i];
            }
        }
        System.out.print("Pares: ");
        for (int i = 0; i < par; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.print("\nImpares: ");
        for (int i = 0; i < impar; i++) {
            System.out.print(impares[i] + " ");
        }
    }

}
