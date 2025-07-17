import java.util.Scanner;

public class Suma_Acumulativa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] Acumulativo = new int[3];
        int[] resultado = new int[3];
        int suma = 0;
        for (int i = 0; i < Acumulativo.length; i++) {
            System.out.println("Ingrese el valor del vector en la posicion: " + i);
            Acumulativo[i] = teclado.nextInt();
            suma += Acumulativo[i];
            resultado[i] = suma;
        }
        System.out.println("El vector suma acumulativa es: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            System.out.print("\t");
        }
    }
}
