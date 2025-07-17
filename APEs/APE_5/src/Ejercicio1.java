import java.util.Random;
import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        //Item 1 - Crea una tabla bidimensional de longitud 5x5 y nombre ‘matriz’
        System.out.println("ITEM N°1");
        System.out.println("Crea una tabla bidimensional de longitud 5x5 y nombre matriz");
        int matriz[][] = new int[5][5];
        int resultado[] = new int[5];
        int rangofinal = 0, rangoinicial = 0;
        System.out.println("Ingrese el rango Inicial");
        rangoinicial = teclado.nextInt();
        System.out.println("Ingrese el rango final");
        rangofinal = teclado.nextInt();
        Random rd = new Random();
        //Item 2 - Carga la tabla con valores numéricos enteros
        System.out.println("ITEM N°2");
        System.out.println("Carga la tabla con valores numéricos enteros");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[f][c]= rd.nextInt( rangoinicial, rangofinal+1);
            }
        }
        //Item 3 - Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla
        System.out.println("ITEM N°3");
        System.out.println("Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla");
        int sumatoria=0;
        for (int f = 0; f < matriz.length; f++) {
            sumatoria=0;
            for (int c = 0; c < matriz[0].length; c++) {
                sumatoria+=matriz[f][c];
            }
            System.out.println("La suma de todos los elementos de la fila_"+(f+1)+" = "+sumatoria);
        }

        for (int c = 0; c < matriz.length; c++) {
            sumatoria=0;
            for (int f = 0; f < matriz[0].length; f++) {
                sumatoria+=matriz[f][c];
            }
            System.out.println("La suam de todos los elementos de la columna_"+(c+1)+" = "+sumatoria);
        }
    }
}
