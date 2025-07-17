import java.util.Scanner;

public class Identificar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese los elementos del vector:" + i);
            vector1[i] = teclado.nextInt();
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese los elementos del segundo vector: " + i);
            vector2[i] = teclado.nextInt();
        }
        boolean iguales = true;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        System.out.println(iguales ? "Los vectores son iguales." : "Los vectores son diferentes.");
    }

}
