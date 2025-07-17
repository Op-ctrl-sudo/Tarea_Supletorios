import java.util.Scanner;

public class NumerosRepetidos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[6];
        int repetidos = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingrese el numero " + i);
            numero[i] = teclado.nextInt();
        }
        for (int i = 0; i < numero.length - 1; i++) {
            for (int j = i + 1; j < numero.length; j++) {
                if (numero[j] == numero[i]) {
                    repetidos++;
                    break;
                }
            }
        }
        System.out.println("Existen " + repetidos + " repetidos");
    }
}
