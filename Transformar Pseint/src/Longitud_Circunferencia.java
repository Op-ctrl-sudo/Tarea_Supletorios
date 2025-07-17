import java.util.Scanner;

public class Longitud_Circunferencia {
public static void main(String[] args) {
    Scanner teclado =new Scanner(System.in);
    float radio,lon;
System.out.println("Calcular la longitud de la circunferencia");
System.out.println("Ingrese el radio de la circunferencia");
radio = teclado.nextFloat();
lon=(float)(2*Math.PI*radio);
System.out.println("La longitud de la circunferencia es de: "+Math.round(lon*100)/100d);
}
}
