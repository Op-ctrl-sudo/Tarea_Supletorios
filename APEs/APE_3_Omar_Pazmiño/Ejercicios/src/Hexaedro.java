import java.util.Scanner;

public class Hexaedro {

    private Scanner teclado;
    private double lado;

    public void Proceso(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado del hexaedro");
        lado=teclado.nextDouble();
    }

    public void AreaBase(){
        double base=0;
        base= 2*Math.pow(lado, 2);
        System.out.println("El area de la base del hexaedro es: "+base);
    }
    
    public void AreaLateral(){
        double lateral=0;
        lateral= 4*Math.pow(lado, 2);
        System.out.println("El area lateral del hexaedro es: "+lateral);
    }

    public void AreaTotal(){
        double total=0;
        total=6*Math.pow(lado, 2);
        System.out.println("El lado total del hexaedro es: "+total);
    }

    public void Volumne(){
        double volumen=0;
        volumen=Math.pow(lado, 3);
        System.out.println("El voluemen del hexaedro es: "+volumen);
    }

    public static void main(String[] args) {
        Hexaedro hexaedro = new Hexaedro();
        hexaedro.Proceso();
        hexaedro.AreaBase();
        hexaedro.AreaLateral();
        hexaedro.AreaTotal();
        hexaedro.Volumne();
    }

}
