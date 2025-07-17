import java.util.Random;
import java.util.Scanner;

public class posiciones {

    // Método para generar valores aleatorios dentro del rango especificado
    public static void GenerarValoresAleatorios(int[] vector, int ValorInicial, int ValorFinal) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            // Corregido el rango para generar valores entre ValorInicial y ValorFinal
            vector[i] = random.nextInt(ValorFinal - ValorInicial + 1) + ValorInicial;
        }
    }

    // Método para imprimir los valores del vector
    public static void ImprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector;
        int longitud = 0;
        int ValorInicial, ValorFinal;

        // Solicitar al usuario la longitud del vector y los valores para el rango
        System.out.println("Ingrese la longitud del vector:");
        longitud = teclado.nextInt();

        // Validación de la longitud para evitar un vector con tamaño 0 o negativo
        if (longitud <= 0) {
            System.out.println("La longitud del vector debe ser un número positivo.");
            return;
        }

        System.out.println("Ingrese el valor inicial del rango:");
        ValorInicial = teclado.nextInt();
        System.out.println("Ingrese el valor final del rango:");
        ValorFinal = teclado.nextInt();

        // Validación para asegurarse de que el valor final es mayor que el valor inicial
        if (ValorFinal < ValorInicial) {
            System.out.println("El valor final debe ser mayor o igual al valor inicial.");
            return;
        }

        vector = new int[longitud];

        // Llamada al método para generar valores aleatorios dentro del rango especificado
        GenerarValoresAleatorios(vector, ValorInicial, ValorFinal);

        // Imprimir los valores generados en el vector
        ImprimirVector(vector);

        // Cerrar el scanner para evitar fugas de recursos
        teclado.close();
    }
}


