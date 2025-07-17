import java.util.Arrays;
import java.util.Scanner;

public class Indice {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] Indice = new int[6];
        for (int i = 0; i < Indice.length; i++) {
            System.out.println("Ingrese el valor del vector en la posicion:" + i);
            Indice[i] = teclado.nextInt();
        }
        int total = Arrays.stream(Indice).sum();
        int izquierda = 0;
        boolean encontrado = false;
        for (int i = 0; i < Indice.length; i++) {
            if (izquierda == total - izquierda - Indice[i]) {
                System.out.println("Índice de equilibrio: " + i);
                encontrado = true;
                break;
            }
            izquierda += Indice[i];
        }
        if (!encontrado) {
            System.out.println("No existe índice de equilibrio.");
        }
    }

}
