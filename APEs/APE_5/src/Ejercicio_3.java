import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Item 1 - Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’
        System.out.println("ITEM N°1");
        System.out.println("Crea una tabla bidimensional de longitud 5x15 y nombre marco");
        int marco[][] = new int[5][15];
        int fila=0,columna=0;
        fila=marco.length;
        columna=marco[0].length;
        // Item 2 - Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones o elementos que delimitan la tabla, es decir, las más externas,mientras que el resto de los elementos contendrán el valor 0
        System.out.println("ITEM N°2");
        System.out.println("Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones o elementos que delimitan la tabla, es decir, las más externas,mientras que el resto de los elementos contendrán el valor 0");
        for (int f = 0; f < marco.length; f++) {
            for (int c = 0; c < marco[0].length; c++) {
                if (f==0 || c==0 || f==fila-1 || c==columna-1) {
                    marco[f][c]=1;
                }
            }
        }
        // Item 3 - Visualiza el contenido de la matriz en pantalla
        System.out.println("ITEM N°3");
        System.out.println("Visualiza el contenido de la matriz en pantalla");
        System.out.println("El marco es: ");
        for (int f = 0; f < marco.length; f++) {
            for (int c = 0; c < marco[0].length; c++) {
                System.out.print(marco[f][c]+"\t");
            }
            System.out.print("\n");
        }
    }

}
