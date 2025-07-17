import java.util.Scanner;

public class Copiar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] original = new int[5];
        int[] copia = new int[5];
        for (int i = 0; i < original.length; i++) {
            System.out.println("Ingrese 5 números:");
            original[i] = teclado.nextInt();
        }
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        System.out.println("Vector copiado:");
        for (int num : copia) {
            System.out.print(num + " ");
        }
    }

}
