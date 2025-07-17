import java.util.Scanner;

public class SumaVectores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vector1[] = new int[5];
        int vector2[] = new int[5];
        int vector3[] = new int[5];
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese los datos del vector 1: "+i);
            vector1[i]=teclado.nextInt();
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese los datos del vector 2: "+i);
            vector2[i]=teclado.nextInt();
        }
        System.out.println("Los valores del vector 3 son: ");
        for (int i = 0; i < vector3.length; i++) {
            vector3[i]=vector1[i]+vector2[i];
            System.out.println(vector3[i]);
        }
    }
}
