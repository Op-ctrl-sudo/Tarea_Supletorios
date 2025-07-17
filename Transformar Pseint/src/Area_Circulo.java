import java.util.Scanner;

public class Area_Circulo {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float radio, area;
        System.out.println("Calcular el area del circulo");
        System.out.println("Ingrese el radio del circulo");
        radio= teclado.nextFloat();
        area= (float)(Math.PI*Math.pow(radio, 2));
        System.out.println("El area del circulo es de: "+Math.round(area*100)/100d);
    }
}
