import java.util.Scanner;

public class EliminarElemento {

     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] eliminar = new int[6];
        for (int i = 0; i < eliminar.length; i++){
        System.out.println("Ingrese los elementos del vector: "+i);
        eliminar[i] = teclado.nextInt();
        } 
        System.out.print("Ingrese la posición a eliminar (0 a 5): ");
        int pos = teclado.nextInt();
        for (int i = pos; i < eliminar.length - 1; i++) {
            eliminar[i] = eliminar[i + 1];
        }
        System.out.println("Vector después de eliminar el elemento:");
        for (int i = 0; i < eliminar.length - 1; i++){
            System.out.print(eliminar[i] + " ");
        }
    }

}
