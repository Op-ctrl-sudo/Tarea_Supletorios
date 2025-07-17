import java.util.Scanner;

public class Buscar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese los valores del vector: " + i);
            vector[i] = teclado.nextInt();
        }
        System.out.print("Ingrese número a buscar: ");
        int buscar = teclado.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                System.out.println("Encontrado en la posición " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el número.");
        }
    }

}
