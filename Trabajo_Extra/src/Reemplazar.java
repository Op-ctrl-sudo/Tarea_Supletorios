import java.util.Scanner;

public class Reemplazar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] valores = new int[5];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Ingrese los valores del vector en la posicion :" + i);
            valores[i] = teclado.nextInt();
            if (valores[i] < 0) {
                valores[i] = 0;
            }
        }
        System.out.println("Vector con negativos reemplazados por cero:");
        for (int n : valores) {
            System.out.print(n + " ");
        }
    }

}
