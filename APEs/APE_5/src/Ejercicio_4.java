import java.util.Random;
import java.util.Scanner;

public class Ejercicio_4 {
    //Articulos al nivel de filas y las sucursales al nivel de columnas
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double PreciosArticulo[] = new double[] { 10, 20, 30, 40, 50 };
        int CantidadVentas[][] = new int[5][4];
        Random rd = new Random();
        int rangoinicial = 0, rangofinal = 0; 
        System.out.println("Ingrese el rango inicial");
        rangoinicial = teclado.nextInt();
        System.out.println("Ingrese el rango final");
        rangofinal = teclado.nextInt();
        for (int f = 0; f < CantidadVentas.length; f++) {
            for (int c = 0; c < CantidadVentas[0].length; c++) {
                CantidadVentas[f][c]=rd.nextInt(rangoinicial,rangofinal+1);
            }
        }
        // Item 1 - Cantidades totales de cada articulo
        System.out.println("ITEM N°1");
        System.out.println("Las cantidades totales de cada articulo");
        int sumatoria = 0;
        for (int f = 0; f < CantidadVentas.length; f++) {
            sumatoria = 0;
            for (int c = 0; c < CantidadVentas[0].length; c++) {
                sumatoria += CantidadVentas[f][c];
            }
            System.out.println("Cantidad Articulo_ " + (f + 1) + " = " + sumatoria);
        }

        // Item 2 - La cantidad de artículos en la sucursal 2
        System.out.println("ITEM N°2");
        System.out.println("La cantidad de artículos en la sucursal 2");
        sumatoria = 0;
        for (int f = 0; f < CantidadVentas.length; f++) {
            sumatoria += CantidadVentas[f][1];
        }
        System.out.println("La cantidad de articulos en la sucursal 2 = " + sumatoria);

        // Item 3 - La cantidad del articulo 3 en la sucursal 1
        System.out.println("ITEM N°3");
        System.out.println("La cantidad del articulo 3 en la sucursal 1");
        System.out.println("La cantidad del articulo 3 en la sucursal 1 = " + CantidadVentas[2][0]);

        // Item 4 - La recaudación total de cada sucursal
        System.out.println("ITEM N°4");
        System.out.println("La recaudación total de cada sucursal");
        double acumulador[][] = new double[CantidadVentas.length][CantidadVentas[0].length];
        for (int c = 0; c < CantidadVentas[0].length; c++) {
            for (int f = 0; f < CantidadVentas.length; f++) {
                acumulador[f][c] = CantidadVentas[f][c] * PreciosArticulo[f];
            }
        }
        // Visualizar la matriz de monto recaudado
        for (int f = 0; f < acumulador.length; f++) {
            for (int c = 0; c < acumulador[0].length; c++) {
                System.out.print(acumulador[f][c] + "\t");
            }
            System.out.print("\n");
        }
        //Imprimir valores por sucursal
        double VectorMontosSucursales[] = new double[acumulador.length];
        for (int c = 0; c < acumulador[0].length; c++) {
            sumatoria = 0;
            for (int f = 0; f < acumulador.length; f++) {
                sumatoria += acumulador[f][c];
            }
            System.out.println("La recaudacion de monto recaudado de la sucursal_" + (c + 1) + " = " + sumatoria);
            VectorMontosSucursales[c]=sumatoria;
        }

        // Item 5 - La recaudación total de la empresa
        System.out.println("ITEM N°5");
        System.out.println("La recaudación total de la empresa");
        sumatoria=0;
        for (int c = 0; c < acumulador[0].length; c++) {
            for (int f = 0; f < acumulador.length; f++) {
                sumatoria+=acumulador[f][c];
            }
        }
        System.out.println("Recaudacion total = "+sumatoria);

        // Item 6 - La sucursal de mayor recaudación
        System.out.println("ITEM N°6");
        System.out.println("La sucursal de mayor recaudación");
        double Mayor=0;
        int posicion=0;
        Mayor = VectorMontosSucursales[0];
        for (int c = 1; c < VectorMontosSucursales.length; c++) {
            if (Mayor<VectorMontosSucursales[c]) {
                Mayor=VectorMontosSucursales[c];
                posicion = c;
            }
        }
        System.out.println("La sucursal_"+(posicion+1)+" con un monto = "+Mayor);

    }

}
