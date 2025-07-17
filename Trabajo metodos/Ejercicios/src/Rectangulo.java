import java.util.Scanner;

public class Rectangulo {

    public Scanner teclado;
    public double base=0,altura=0;

    public void Entrada(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        base = teclado.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        altura = teclado.nextDouble();
    }

    public void AreaRectangulo(){
        double area=0;
        area = base*altura;
        System.out.println("La area del rectangulo es: "+area);
    }

    public static void main(String[] args) {
        Rectangulo obj = new Rectangulo();
        obj.Entrada();
        obj.AreaRectangulo();
    }

}
