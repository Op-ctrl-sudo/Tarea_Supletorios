import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int stock[][] = new int[3][8];
        int precio [] = new int[]{100,200,50,40,80,100,60,50};
        int total[][] = new int[stock.length][stock[0].length];
        double contenedor[] = new double[stock[0].length];
        int rangoinicial = 0, rangofinal = 0;
        Random rd = new Random();
        System.out.println("Ingrese el rango inicial");
        rangoinicial = teclado.nextInt();
        System.out.println("Ingrese el rango final");
        rangofinal = teclado.nextInt();
        for (int f = 0; f < stock.length; f++) {
            for (int c = 0; c < stock[0].length; c++) {
                stock[f][c] = rd.nextInt(rangoinicial,rangofinal+1);
            }
        }
        //Item 1 - Mostrar el inventario total de cada producto
        System.out.println("ITEM N°1");
        System.out.println("Mostrar el inventario total de cada producto");
        int sumatoria = 0;
        for (int c = 0; c < stock[0].length; c++) {
            sumatoria = 0;
            for (int f = 0; f < stock.length; f++) {
                sumatoria += stock[f][c];
            }
            System.out.println("El total del producto "+(c+1)+" = "+sumatoria); 
        }

        //Item 2 - Calcular el inventario total en el almacén 1
        System.out.println("ITEM N°2");
        System.out.println("Calcular el inventario total en el almacén 1");
        sumatoria = 0;
        for (int c = 0; c < stock[0].length; c++) {
            sumatoria += stock[0][c];
        }
        System.out.println("El total del inventario del almacen 1 = "+sumatoria);

        //Item 3 - Mostrar el stock del producto 4 en el almacén 2
        System.out.println("ITEM N°3");
        System.out.println("Mostrar el stock del producto 4 en el almacén 2");
        System.out.println("En el almacen 2 el stock del producot 4 = "+stock[1][3]);

        //Item 4 - Calcular el valor total del inventario de la cadena, asumiendo que el precio de cada producto es: p1= $ 100, p2= $ 200, p3= $ 50, p4= $ 40, p5= $ 80, p6= $ 100, p7= $ 60, p8= $ 50
        System.out.println("ITEM N°4");
        System.out.println("Calcular el valor total del inventario de la cadena, asumiendo que el precio de cada producto es: p1= $ 100, p2= $ 200, p3= $ 50, p4= $ 40, p5= $ 80, p6= $ 100, p7= $ 60, p8= $ 50");
        for (int f = 0; f < total.length; f++) {
            for (int c = 0; c < total[0].length; c++) {
                total[f][c] = stock[f][c]* precio[c];
            }
        }
        sumatoria = 0;
        for (int f = 0; f < total.length; f++) {
            for (int c = 0; c < total[0].length; c++) {
                sumatoria+=total[f][c];
            }
        }
        System.out.println("La suma total del inventario = "+sumatoria);

        //Item 5 - Determinar el almacén con mayor cantidad de productos
        System.out.println("ITEM N°5");
        System.out.println("Determinar el almacén con mayor cantidad de productos");
        double mayor =  0;
        int posicion = 0;
        for (int f = 0; f < stock.length; f++) {
            sumatoria = 0;
            for (int c = 0; c < stock[0].length; c++) {
                sumatoria+=stock[f][c];
            }
            contenedor[f]= sumatoria;
        }
        mayor = contenedor[0];
        for (int c = 1; c < contenedor.length; c++) {
            if (mayor< contenedor[c]) {
                mayor = contenedor[c];
                posicion = c;
            }
        }
        System.out.println("El almacen_"+(posicion+1)+" = "+mayor);
    }

}
