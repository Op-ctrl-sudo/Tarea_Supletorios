import java.util.Random;
import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0, rangoinicial = 0, rangofinal = 0;
        int matrices1[][];
        int matrices2[][];
        Random rd = new Random();
        System.out.println("Ingrese el valor de n");
        n = teclado.nextInt();
        System.out.println("Ingrese el rango inicial");
        rangoinicial = teclado.nextInt();
        System.out.println("Ingrese el rango final");
        rangofinal = teclado.nextInt();
        matrices1 = new int[n][n];
        matrices2 = new int[n][n];
        int suma [][] = new int[n][n];
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                matrices1[f][c] = rd.nextInt(rangoinicial,rangofinal+1);
                matrices2[f][c] = rd.nextInt(rangoinicial,rangofinal+1);
            }
        }
        //Item 1 - Calcular la suma de las dos matrices
        System.out.println("ITEM N°1");
        System.out.println("Calcular la suma de las dos matrices");
        for (int f = 0; f < suma.length; f++) {
            for (int c = 0; c < suma[0].length; c++) {
                suma[f][c] = matrices1[f][c] + matrices2[f][c]; 
            }
        }
        for (int f = 0; f < suma.length; f++) {
            for (int c = 0; c < suma[0].length; c++) {
                System.out.print(suma[f][c]+"\t");
            }
            System.out.print("\n");
        }

        //Item 2 - Calcular el promedio de todos los elementos de ambas matrices
        System.out.println("ITEM N°2");
        System.out.println("Calcular el promedio de todos los elementos de ambas matrices");
        int promedio1 = 0, promedio2 = 0, sumas1 = 0, sumas2 = 0;
        for (int f = 0; f < suma.length; f++) {
            for (int c = 0; c < suma[0].length; c++) {
                sumas1 +=matrices1[f][c]; 
                sumas2 +=matrices2[f][c];
            }
        }
        promedio1=sumas1/(matrices1.length*matrices1[0].length);
        promedio2=sumas2/(matrices2.length*matrices2[0].length);
        System.out.println("El promedio de la primera matriz es = "+promedio1);
        System.out.println("El promedio de la segunda matriz es = "+promedio2);

        //Item 3 - Calcular el producto de las dos matrices (multiplicación de matrices)
        System.out.println("ITEM N°3");
        System.out.println("Calcular el producto de las dos matrices (multiplicación de matrices)");
        int[][] resultado = new int[matrices1.length][matrices1[0].length];
        for (int f = 0; f < matrices1.length; f++) {
            for (int c = 0; c < matrices1[0].length; c++) {
                for (int k = 0; k < matrices1.length; k++) {
                    resultado[f][c] += matrices1[f][k] * matrices2[k][c];
                }
            }
        }
        System.out.println("El producto de la matriz = ");
        for (int f = 0; f < matrices1.length; f++) {
            for (int c = 0; c < matrices1[0].length; c++) {
                System.out.print(resultado[f][c]+"\t");
            }
            System.out.print("\n");
        }

        //Item 4 - Determinar el elemento mayor de la matriz resultante de la suma
        System.out.println("ITEM N°4");
        System.out.println("Determinar el elemento mayor de la matriz resultante de la suma");
        int mayor = suma[0][0];
        int posicion = 0;
        for (int f = 0; f < resultado.length; f++) {
            for (int c = 1; c < resultado[0].length; c++) {
                if (mayor<suma[f][c]) {
                    mayor=suma[f][c];
                    posicion = f;
                }
            }
        }
        System.out.println("El elemento "+(posicion+1)+" con = "+mayor);
    }

}
