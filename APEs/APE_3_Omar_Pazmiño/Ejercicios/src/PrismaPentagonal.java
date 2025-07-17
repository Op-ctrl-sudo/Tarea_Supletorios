import java.util.Scanner;

public class PrismaPentagonal {

    private Scanner teclado;
    private double perimetro, apotema, altura;

    public void proceso(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del perimetro de la base del pisma pentagonal");
        perimetro = teclado.nextDouble();
        System.out.println("Ingrese el valor de la apotema del pisma pentagonal");
        apotema = teclado.nextDouble();
        System.out.println("Ingrese el valor de la altura del pisma pentagonal");
        altura = teclado.nextDouble();
    }

    public double Areabase(){
        double base=0;
        base=(perimetro*apotema)/2;
        System.out.println("El area base del prisma pentagonal es: "+base);
        return base;
    }

    public double AreaLateral(){
        double lateral=0;
        lateral=perimetro*altura;
        System.out.println("El area lateral del prisma pentagonal es: "+lateral);
        return lateral;
    }

    public void AreaTotal(){
        double total=0;
        total= AreaLateral()*2*Areabase();
        System.out.println("El area total del prisma pentagonal es: "+total);
    }

    public static void main(String[] args) {
        PrismaPentagonal prisma = new PrismaPentagonal();
        prisma.proceso();
        prisma.AreaLateral();
        prisma.Areabase();
        prisma.AreaTotal();
    }

}
