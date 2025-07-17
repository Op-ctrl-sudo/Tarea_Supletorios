import java.util.Scanner;

public class Interseccion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] Interseccion1 = new int[5], Interseccion2 = new int[5];
        System.out.println("Ingrese los elementos de los vectores:");
        for (int i = 0; i < 5; i++) {
            Interseccion1[i] = teclado.nextInt();
        }
        System.out.println("Ingrese elementos del segundo vector:");
        for (int i = 0; i < 5; i++) {
            Interseccion2[i] = teclado.nextInt();
        }
        System.out.println("Elementos en común:");
        for (int i = 0; i < Interseccion1.length; i++) {
            for (int j = 0; j < Interseccion2.length; j++) {
                if (Interseccion1[i] == Interseccion2[j]) {
                    System.out.print(Interseccion1[i] + " ");
                    break;
                }
            }
        }
    }

}
