import java.util.Random;
import java.util.Scanner;

public class Ejercicio13V2 {

    public static double DefinirDosDecimales(double valor){
        return Math.round(valor*100)/100d;
    }

    private static void CargarAleatoramenteVector(double vector[], double minimo, double maximo){
        Random rd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = DefinirDosDecimales(rd.nextDouble(minimo,maximo+1));
        }
    }

    private static void CargarManualmenteElVector(double vector[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----Cargando Vector-----");
        for (int i = 0; i < vector.length; i++) {
        System.out.println("Ingrese el valor: ");
        vector[i] = teclado.nextDouble();    
        }
    }

    private static void DiaConMenorTemperatura(double[] temperaturaMedia) {
        int posicion;
        double minimaTemperatura = temperaturaMedia[0];
        posicion=0;
        for (int i = 1; i < temperaturaMedia.length; i++) {
            if (minimaTemperatura>temperaturaMedia[i]) {
                minimaTemperatura = temperaturaMedia[i];
                posicion=i;
            }
        }

        System.out.println("La menor temperatura es: "+minimaTemperatura);
        System.out.println("El dia de menor temperatura es el Dia "+(posicion+1));
    }

    private static void DiaConMayorTemperaturaMedia(double[] temperaturaMedia) {
        double mayorTemperatura=temperaturaMedia[0];
        int posicion = 0;
        for (int i = 1; i < temperaturaMedia.length; i++) {
            if (mayorTemperatura<temperaturaMedia[i]) {
                mayorTemperatura = temperaturaMedia[i];
                posicion=i;
            }
        }

        System.out.println("La mayor temepratura es: "+mayorTemperatura);
        System.out.println("El dia de mayor temperatura es el Dia "+(posicion+1));
    }

    private static void ImprimirTemperaturas(double[] maxTemperatura, double[] minTemperatura, double[] temperaturaMedia) {
        System.out.println("Temperatura maxima-----Temperatura minima-----Temperatura media");
        for (int i = 0; i < temperaturaMedia.length; i++) {
            System.out.println(maxTemperatura[i]+"\t"+"\t"+"\t"+minTemperatura[i]+"\t"+"\t"+"\t"+temperaturaMedia[i]);
        }
    }

    private static void CalcularTemperaturaMedia(double[] maxTemperatura, double[] minTemperatura, double[] temperaturaMedia) {
        for (int i = 0; i < temperaturaMedia.length; i++) {
            temperaturaMedia[i] = DefinirDosDecimales((maxTemperatura[i]+minTemperatura[i])/2);
        }
    }

    public static void main(String[] args) {
        double maxTemperatura[] = new double[5];
        double minTemperatura[] = new double[5];
        double temperaturaMedia[] = new double[maxTemperatura.length];

        CargarAleatoramenteVector(maxTemperatura, 15, 20);

        CargarAleatoramenteVector(minTemperatura, 5, 12);

        //CargarManualmenteElVector(maxTemperatura);
        
        //CargarManualmenteElVector(minTemperatura);
       
        //Pregunta 1: Temperaturas medias
        CalcularTemperaturaMedia(maxTemperatura, minTemperatura, temperaturaMedia);

        ImprimirTemperaturas(maxTemperatura, minTemperatura, temperaturaMedia);

        DiaConMayorTemperaturaMedia(temperaturaMedia);

        //Pregunta 3: Dia menor temperatura
        DiaConMenorTemperatura(temperaturaMedia);

    }
}
