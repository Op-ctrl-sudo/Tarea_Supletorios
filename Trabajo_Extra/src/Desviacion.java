import java.util.Scanner;

public class Desviacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] datos = new double[5];
        double suma = 0;
        double media = suma / datos.length;
        double sumaCuadrados = 0;
        double desviacion = 0;
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingrese los valores del vector: " + i);
            datos[i] = teclado.nextDouble();
            suma += datos[i];
        }
        for (double d : datos) {
            sumaCuadrados += Math.pow(d - media, 2);
        }
        desviacion = Math.sqrt(sumaCuadrados / datos.length);
        System.out.println("Desviación estándar: " + desviacion);
    }

}
