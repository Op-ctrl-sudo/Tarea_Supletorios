import java.util.Scanner;

public class esfera {

    private Scanner teclado;
    private double radio;

    public void Proceso(){
        teclado = new Scanner(System.in);
        System.out.println( "Ingrese el radio de la esfera");
        radio = teclado.nextDouble();
    }

    public void Area(){
        double area=0;
        area=4*Math.PI*radio;
        System.out.println("El area de la esfera es: "+area);
    }

    public void Volumen(){
        double volumen=0;
        volumen= (Math.PI*Math.pow(radio, 3))*4/3; 
        System.out.println("El volumen de la esfera es: "+volumen);
    }

    public static void main(String[] args) {
        esfera Esfera = new esfera();
        Esfera.Proceso();
        Esfera.Area();
        Esfera.Volumen();
    }

}
