import java.util.Scanner;

public class SumaPares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] nums = new int[5];
        int Pares = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Ingrese el valor del vector en la posicion: " + i);
            nums[i] = teclado.nextInt();
        }
        System.out.print("Ingrese el valor objetivo: ");
        Pares = teclado.nextInt();
        System.out.println("Pares que suman " + Pares + ":");
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == Pares) {
                    System.out.println("(" + nums[i] + ", " + nums[j] + ")");
                }
            }
        }
    }

}
