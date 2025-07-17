import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double TemperaturaMaxima[] = new double[5];
        double TemperaturaMinima[] = new double[5];
        double TemperaturaMedia[] = new double[5];
        int max=0,minimo=0;
        for (int i = 0; i < TemperaturaMaxima.length; i++) {
            System.out.println("Ingrese la temperatura maxima del dia "+i);
            TemperaturaMaxima[i]=teclado.nextDouble();
            System.out.println("Ingrese la temperatura minima del dia "+i);
            TemperaturaMinima[i]=teclado.nextDouble();
            TemperaturaMedia[i]=(TemperaturaMaxima[i]+TemperaturaMinima[i])/2;
        }
        for (int i = 1; i < TemperaturaMedia.length; i++) {
            if (TemperaturaMedia[i]<TemperaturaMedia[minimo]) {
                minimo=i;
            }
            if (TemperaturaMedia[i]>TemperaturaMedia[max]) {
                max=i;
            }
        }
        for (int i = 0; i < TemperaturaMedia.length; i++) {
            System.out.println("La temperatura media del dia "+i+" es: "+TemperaturaMedia[i]);
        }
        System.out.println("El dia con mas temperatura es: " +max+" con "+TemperaturaMedia[max]);
        System.out.println("El dia con menos temperatura es: " +minimo+" con "+TemperaturaMedia[minimo]);
    }
}
