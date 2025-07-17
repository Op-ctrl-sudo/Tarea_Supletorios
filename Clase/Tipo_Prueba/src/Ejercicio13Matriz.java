import java.util.Random;
import java.util.Scanner;

public class Ejercicio13Matriz {

    private static void CargarAleatoramenteMatriz(double matriz[][],int columna, double minimo, double maximo){
        Random rd = new Random();
        for (int f = 0; f < matriz.length; f++) {
            matriz[f][columna] = DefinirDosDecimales(rd.nextDouble(minimo,maximo+1));
        }
    }

    private static void CargarManualmenteLaMatriz(double matriz[][], int columna){
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----Cargando Matriz-----");
        for (int f = 0; f < matriz.length; f++) {
         System.out.println("Ingrese el valor: ");
         matriz[f][columna] = teclado.nextDouble();    
        }
    }

    private static void CalcularTemperaturaMedia(double [][] matriz){
        for (int f = 0; f < matriz.length; f++) {
            matriz[f][2]= DefinirDosDecimales((matriz[f][0]+matriz[f][1])/2);
        }
    }

    private static double DefinirDosDecimales(double valor){
        return Math.round(valor*100)/100d;
    }

    private static void ImprimirTemperaturas(double [][] matriz){
        System.out.println("Temperatura maxima-----Temperatura minima-----Temperatura media");
        for (int f = 0; f < matriz.length; f++) {
            System.out.println(matriz[f][0]+"\t"+"\t"+"\t"+matriz[f][1]+"\t"+"\t"+"\t"+matriz[f][2]);
        }
    }

    private static void DiaConMayorTemperaturaMedia(double[][] matriz) {
        double mayorTemperatura=matriz[0][2];
        int posicion = 0;
        for (int f = 1; f < matriz.length; f++) {
            if (mayorTemperatura<matriz[f][2]) {
                mayorTemperatura = matriz[f][2];
                posicion=f;
            }
        }

        System.out.println("La mayor temepratura es: "+mayorTemperatura);
        System.out.println("El dia de mayor temperatura es el Dia "+(posicion+1));
    }

    private static void DiaConMenorTemperatura(double[][] matriz) {
        int posicion;
        double minimaTemperatura = matriz[0][2];
        posicion=0;
        for (int f = 1; f < matriz.length; f++) {
            if (minimaTemperatura>matriz[f][2]) {
                minimaTemperatura = matriz[f][2];
                posicion=f;
            }
        }

        System.out.println("La menor temperatura es: "+minimaTemperatura);
        System.out.println("El dia de menor temperatura es el Dia "+(posicion+1));
    }
    
    public static void main(String[] args) {
        double [][] temperatura = new double[5][3];
        //CargarManualmenteLaMatriz(temperatura, 0);
        //CargarManualmenteLaMatriz(temperatura,1);
        CargarAleatoramenteMatriz(temperatura, 0, 15, 25);
        CargarAleatoramenteMatriz(temperatura, 1, 5, 13);
        CalcularTemperaturaMedia(temperatura);
        ImprimirTemperaturas(temperatura);
        DiaConMayorTemperaturaMedia(temperatura);
        DiaConMenorTemperatura(temperatura);

    }
}
