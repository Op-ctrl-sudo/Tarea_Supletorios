import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] datos = new int[5];
        int suma = 0, min, max;
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingrese los valores del vector en la posicion: " + i);
            datos[i] = teclado.nextInt();
            suma += datos[i];
        }
        min = max = datos[0];
        for (int num : datos) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        System.out.println("Promedio: " + (suma / 5.0));
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
    }

}
