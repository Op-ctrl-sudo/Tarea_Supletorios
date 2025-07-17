import java.util.Scanner;

public class Moda {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Moda[] = new int[3];
        int contenedor = 0, ValorMaximo = 0;
        ;
        for (int i = 0; i < Moda.length; i++) {
            System.out.println("Ingrese el valor del vector en la posicion: " + i);
            Moda[i] = teclado.nextInt();
        }
        for (int i = 0; i < Moda.length; i++) {
            int contador = 0;
            for (int j = 0; j < Moda.length; j++) {
                if (Moda[i] == Moda[j]) {
                    contador++;
                }
                if (contador > contenedor) {
                    contenedor = contador;
                    ValorMaximo = Moda[i];
                }
            }
        }
        System.out.println("La moda del vector es: " + ValorMaximo);
    }

}
