import java.util.Scanner;

public class DuplicadosEliminar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] Repetidos = new int[5];
        for (int i = 0; i < Repetidos.length; i++) {
            System.out.println("Ingrese el valor del vector en la posicion: " + i);
            Repetidos[i] = teclado.nextInt();
        }
        int numero = Repetidos.length;
        int[] resultado = new int[numero];
        int contenedor = 0;
        for (int i = 0; i < numero; i++) {
            boolean duplicado = false;
            for (int j = 0; j < contenedor; j++) {
                if (Repetidos[i] == resultado[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado)
                resultado[contenedor++] = Repetidos[i];
        }
        System.out.println("Sin duplicados: ");
        for (int i = 0; i < contenedor; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
