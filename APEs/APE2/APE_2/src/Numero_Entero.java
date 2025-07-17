import java.util.Scanner;
public class Numero_Entero {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int RangoMaximo,RangoMinimo,Enteros=1;
        System.out.println("Ingrese el rango maximo");
        RangoMaximo=teclado.nextInt();
        System.out.println("Ingrese el rango minimo");
        RangoMinimo=teclado.nextInt();
        if (RangoMinimo>RangoMaximo) {
            System.out.println("Los numero de rango estan ingresados mal");
        }
        else{
        while (RangoMinimo<RangoMaximo) {
            Enteros++;
            RangoMinimo++;
        }
        System.out.println("El numero de enteros que ahi en rango es de: "+Enteros);
        }
    }
}
