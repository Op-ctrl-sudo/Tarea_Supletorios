import java.util.Scanner;

public class FormaAscendente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] Ascendente = new int[5];
        for (int i = 0; i < Ascendente.length; i++) {
            System.out.println("Ingrese los valores del vector:");
            Ascendente[i] = teclado.nextInt();
        }
        boolean ordenado = true;
        for (int i = 0; i < Ascendente.length - 1; i++) {
            if (Ascendente[i] > Ascendente[i + 1]) {
                ordenado = false;
                break;
            }
        }
        System.out.println(ordenado ? "Está ordenado." : "No está ordenado.");
    }

}
