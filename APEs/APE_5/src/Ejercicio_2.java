import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diagonal[][];
        int n=0;
        //Item 1 - Crea una tabla bidimensional de longitud 5x5 y nombre diagonal
        System.out.println("ITEM N°1");
        System.out.println("Crea una tabla bidimensional de longitud 5x5 y nombre diagonal");
        System.out.println("Ingrese el valor de n");
        n = teclado.nextInt();
        diagonal = new int[n][n];
        //Item 2 - Carga la tabla de forma que los componentes pertenecientes a la diagonal de la matriz tomen el valor 1 y el resto el valor 0
        System.out.println("ITEM N°2");
        System.out.println("Carga la tabla de forma que los componentes pertenecientes a la diagonal de la matriz tomen el valor 1 y el resto el valor 0");
        for (int f = 0; f < diagonal.length; f++) {
            for (int c = 0; c < diagonal[0].length; c++) {
                if (f==c) {
                    diagonal[f][c]=1;
                }
            }
        }
        //Item 3 - Muestra el contenido de la tabla en pantalla
        System.out.println("ITEM N°3");
        System.out.println("Muestra el contenido de la tabla en pantalla");
        System.out.println("La diagonal principal es:");
        for (int f = 0; f < diagonal.length; f++) {
            for (int c = 0; c < diagonal[0].length; c++) {
                System.out.print(diagonal[f][c]+"\t");
            }
            System.out.print("\n");
        }
    }

}
