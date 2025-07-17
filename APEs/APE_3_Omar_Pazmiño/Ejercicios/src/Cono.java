import java.util.Scanner;

public class Cono {

    private Scanner teclado;
    private double radio, generatriz, altura;

    public void Proceso(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio del cono");
        radio = teclado.nextDouble();
        System.out.println("Ingrese la generatriz del cono");
        generatriz = teclado.nextDouble();
        System.out.println("Ingrese la altura del cono");
        altura = teclado.nextDouble();
    }

    public double AreaBase(){
        double base=0;
        base=Math.PI*Math.pow(radio, 2);
        System.out.println("El area de la base del cono es: "+base);
        return base;
    }

    public double AreaLateral(){
        double lateral=0;
        lateral=Math.PI*radio*generatriz;
        System.out.println("El area del lateral del cono es: "+lateral);
        return lateral;
    }

    public void AreaTotal(){
        double total=0;
        total=AreaBase()*AreaLateral();
        System.out.println("El area total del cono es: "+total);
    }

    public void Volumen(){
        double vol=0;
        vol=(Math.PI*Math.pow(radio,2 )*altura)*1/3;
        System.out.println("El volumen del cono es: "+vol);
    }

    public static void main(String[] args) {
        Cono cono = new Cono();
        cono.Proceso();
        cono.AreaBase();
        cono.AreaLateral();
        cono.AreaTotal();
        cono.Volumen();
    }

}
