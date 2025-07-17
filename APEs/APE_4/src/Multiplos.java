import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[6];
        int n = 0, multiplo = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingrese el numero " + i);
            numero[i] = teclado.nextInt();
        }
        System.out.println("Ingrese el numero multiplo");
        n = teclado.nextInt();
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % n == 0) {
                multiplo++;
            } else {
                multiplo = multiplo;
            }
        }
        System.out.println("A ingresado " + multiplo + " numeros multipos del " + n);
    }
}
