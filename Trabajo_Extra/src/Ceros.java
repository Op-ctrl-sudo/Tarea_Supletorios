import java.util.Scanner;

public class Ceros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese los valores del vector: " + i);
            numeros[i] = teclado.nextInt();
        }
        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                numeros[indice++] = numeros[i];
            }
        }
        while (indice < numeros.length) {
            numeros[indice++] = 0;
        }
        System.out.println("Vector con ceros al final:");
        for (int x : numeros) {
            System.out.print(x + " ");
        }
    }

}
