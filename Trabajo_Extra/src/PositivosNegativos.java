import java.util.Scanner;

public class PositivosNegativos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int positivos = 0, negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese los valores del vector en la posicion:" + i);
            numeros[i] = teclado.nextInt();
            if (numeros[i] > 0) {
                positivos++;
            } else {
                if (numeros[i] < 0) {
                    negativos++;
                }
            }
        }
        System.out.println("Cantidad de positivos: " + positivos);
        System.out.println("Cantidad de negativos: " + negativos);
    }

}
