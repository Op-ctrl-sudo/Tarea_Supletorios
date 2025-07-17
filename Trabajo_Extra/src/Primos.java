import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] Primos = new int[6];
        for (int i = 0; i < Primos.length; i++) {
            System.out.println("Ingrese el valor del vector en la posicion: " + i);
            Primos[i] = teclado.nextInt();
        }
        System.out.println("Números primos en el vector:");
        for (int i = 0; i < Primos.length; i++) {
            int n = Primos[i];
            boolean primo = true;
            if (n <= 1) {
                primo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.print(n + " ");
            }
        }
    }

}
