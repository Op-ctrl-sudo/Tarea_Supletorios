import java.util.Scanner;

public class PrimosSubsecuentes {

    public static boolean esPrimo(int numero) {
        if (numero < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Ingrese un número: ");
        n = teclado.nextInt();

        int[] primos = new int[10];
        int contador = 0;
        int numero = 0;
        int suma = 0;

        while (contador < 10) {
            numero= n+1;
            if (esPrimo(numero)) {
                primos[contador] = numero;
                suma += numero;
                contador++;
            }
            numero++;
        }

        System.out.println("Los primeros 10 primos subsecuentes a " + n + " son:");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }

        double promedio = 0;
        promedio = (double) suma / primos.length;
        System.out.println("Suma de los primos: " + suma);
        System.out.println("Promedio de los primos: " + promedio);

    }
}
