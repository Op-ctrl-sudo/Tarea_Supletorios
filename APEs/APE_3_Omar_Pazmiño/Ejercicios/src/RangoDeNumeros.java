import java.util.Scanner;

public class RangoDeNumeros {

    private int RangoInicial, RangoFinal;
    private Scanner teclado;

    private void inicio() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el rango inicial");
        RangoInicial = teclado.nextInt();
        System.out.println("Ingrese el rango final");
        RangoFinal = teclado.nextInt();
    }

    private void PromedioNumerosTotales() {
        int i = RangoInicial, total = 0;
        double promediototales = 0;
        while (i <= RangoFinal) {
            promediototales += i;
            i++;
            ;
            total++;
        }
        promediototales = promediototales / total;
        System.out.println("El promedio de todos los numeros es: " + promediototales);
    }

    private void PromedioNumerosPares() {
        int pares = 0, i = RangoInicial, PromedioPares = 0;
        while (i <= RangoFinal) {
            if (i % 2 == 0) {
                PromedioPares += i;
                pares++;
            }
            i++;
        }
        PromedioPares = PromedioPares / pares;
        System.out.println("El promedio de los numero pares es: " + PromedioPares);
    }

    private void PromedioNumerosImpares() {
        int impares = 0, i = RangoInicial, PromedioImpares = 0;
        while (i <= RangoFinal) {
            if (i % 2 != 0) {
                PromedioImpares += i;
                impares++;
            }
            i++;
        }
        PromedioImpares = PromedioImpares / impares;
        System.out.println("El promedio de los numero impares es: " + PromedioImpares);
    }

    public void PromedioNumerosPrimos() {
        int sumaPrimos = 0, contadorPrimos = 0;
        double promedio = 0;
        for (int i = RangoInicial; i <= RangoFinal; i++) {
            if (i >= 2) {
                boolean esPrimo = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    sumaPrimos += i;
                    contadorPrimos++;
                }
            }
        }

        if (contadorPrimos > 0) {
            promedio = sumaPrimos / (double) contadorPrimos;
            System.out.println("El promedio de los números primos es: " + promedio);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int r;
        RangoDeNumeros rango = new RangoDeNumeros();
        do {
        rango.inicio();
        rango.PromedioNumerosTotales();
        rango.PromedioNumerosPares();
        rango.PromedioNumerosImpares();
        rango.PromedioNumerosPrimos();
        System.out.println("");
        System.out.println("Ingrese 1 si quiere volver a hacer el proceso");
        r=teclado.nextInt();
        } while (r==1);
    }

}
