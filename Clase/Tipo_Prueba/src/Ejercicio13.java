import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double maxTemperatura[] = new double[5];
        maxTemperatura[0] = 20;
        maxTemperatura[1] = 18;
        maxTemperatura[2] = 22;
        maxTemperatura[3] = 24;
        maxTemperatura[4] = 16;
        double minTemperatura[] = new double[5];
        minTemperatura[0] = 8;
        minTemperatura[1] = 5;
        minTemperatura[2] = 6;
        minTemperatura[3] = 7;
        minTemperatura[4] = 5;
        double temperaturaMedia[] = new double[maxTemperatura.length];
        for (int i = 0; i < temperaturaMedia.length; i++) {
            temperaturaMedia[i] = (maxTemperatura[i]+minTemperatura[i])/2;
        }

        System.out.println("Temperatura maxima-----Temperatura minima-----Temperatura media");
        for (int i = 0; i < temperaturaMedia.length; i++) {
            System.out.println(maxTemperatura[i]+"\t"+minTemperatura[i]+"\t"+temperaturaMedia[i]);
        }

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

        double minimaTemperatura = temperaturaMedia[0];
        posicion=0;
        for (int i = 1; i < temperaturaMedia.length; i++) {
            if (minimaTemperatura>temperaturaMedia[i]) {
                minimaTemperatura = temperaturaMedia[i];
                posicion=i;
            }
        }

        System.out.println("La menor temepratura es: "+minimaTemperatura);
        System.out.println("El dia de menor temperatura es el Dia "+(posicion+1));

    }
}
