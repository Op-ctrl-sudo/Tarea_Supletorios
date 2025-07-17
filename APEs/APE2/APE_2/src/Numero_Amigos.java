import java.util.Scanner;

public class Numero_Amigos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese el valor 1: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el valor 2: ");
        num2 = teclado.nextInt();

        int i = 1;
        int suma1 = 0;
        do {
            if (num1 % i == 0) {
                suma1 += i;
            }
            i++;
        } while (i < num1);

        i = 1;
        int suma2 = 0;
        do {
            if (num2 % i == 0) {
                suma2 += i;
            }
            i++;
        } while (i < num2);

        if (suma1 == num2 && suma2 == num1) {
            System.out.println("Los números son amigos.");
        } else {
            System.out.println("Los números no son amigos.");
        }
    }
}
