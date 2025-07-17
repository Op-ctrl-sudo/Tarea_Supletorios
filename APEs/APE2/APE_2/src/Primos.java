import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rangoInicial, rangoFinal, contadorPrimos = 0;

        System.out.println("Ingrese el rango inicial: ");
        rangoInicial = teclado.nextInt();

        System.out.println("Ingrese el rango final: ");
        rangoFinal = teclado.nextInt();

        int numero = rangoInicial;

        do {
            if (numero >= 2) {
                int i = 2;
                boolean esPrimo = true;

                do {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                    i++;
                } while (i <= Math.sqrt(numero));

                if (esPrimo) {
                    contadorPrimos++;
                }
            }
            numero++;
        } while (numero <= rangoFinal);

        System.out.println("La cantidad de números primos en el rango es: " + contadorPrimos);
    }
}
