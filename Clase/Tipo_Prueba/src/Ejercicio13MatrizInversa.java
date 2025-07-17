import java.util.Random;
import java.util.Scanner;

public class Ejercicio13MatrizInversa {
    //Resolver ecuacion 3x3
    public static void CargarManual(double matriz[][], int fila){
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----Cargando Vector-----");
        for (int c = 0; c < matriz[0].length; c++) {
            System.out.println("Ingrese el valor: ");
            matriz[fila][c] = teclado.nextDouble();
        }
    }

    public static void CargaAleatoria(double matriz[][], int fila, int maximo, int minimo){
        Random rd = new Random();
        System.out.println("-----Cargando Datos Aleatorios-----");
        for (int c = 0; c < matriz[0].length; c++) {
            matriz[fila][c] = DosDecimales(rd.nextDouble(minimo,maximo+1));
        }
    }

    public static void TemperaturaMedia(double matriz[][]){
        for (int c = 0; c < matriz[0].length; c++) {
            matriz[2][c] = DosDecimales((matriz[0][c]+matriz[1][c])/2);
        }
    }

    public static void ImprimirTemperaturas(double matriz[][]){
        System.out.print("Temperatura maxima: ");
        for (int c = 0; c < matriz[0].length; c++) {
            System.out.print(matriz[0][c]+"\t");
        }
        System.out.print("\n");
        System.out.print("Temperatura minima: ");
        for (int c = 0; c < matriz[0].length; c++) {
            System.out.print(matriz[1][c]+"\t");
        }
        System.out.print("\n");
        System.out.print("Temperatura media: ");
        for (int c = 0; c < matriz[0].length; c++) {
            System.out.print(matriz[2][c]+"\t");
        }
        System.out.print("\n");
    }

    public static void mayorTemperatura(double matriz[][]){
        double mayor = matriz[2][0];
        int dia = 0;
        for (int c = 1; c < matriz[0].length; c++) {
            if (mayor<matriz[2][c]) {
                mayor = matriz[2][c];
                dia=c;
            }
        }
        System.out.println("La mayor temperatura es: "+mayor);
        System.out.println("El dia que tiene mayor temperatura es: "+(dia+1));
    }

    public static void menorTemperatura(double matriz[][]){
        double menor = matriz[2][0];
        int dia = 0;
        for (int c = 1; c < matriz[0].length; c++) {
            if (menor>matriz[2][c]) {
                menor = matriz[2][c];
                dia=c;
            }
        }
        System.out.println("La menor temperatura es: "+menor);
        System.out.println("El dia que tiene menor temperatura es: "+(dia+1));
    }

    public static double DosDecimales(double valor){
        return Math.round(valor*100)/100d;
    }

    public static void main(String[] args) {
        double temperatura[][] = new double[3][5];
        //CargarManual(temperatura, 0);
        //CargarManual(temperatura, 1);
        CargaAleatoria(temperatura, 0, 25, 15);
        CargaAleatoria(temperatura, 1, 13, 5);
        TemperaturaMedia(temperatura);
        ImprimirTemperaturas(temperatura);
        mayorTemperatura(temperatura);
        menorTemperatura(temperatura);

    }

}
