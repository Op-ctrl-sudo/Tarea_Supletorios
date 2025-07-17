import java.util.Scanner;

public class Cuadrado {

    public Scanner teclado;
    public double lado = 0;

    public void IngresoDatos() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado = teclado.nextDouble();
    }

    public void Area() {
        double area = 0;
        area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

    public void Perimetro() {
        double perimetro = 0;
        perimetro = lado + lado + lado + lado + lado;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }

    public static void main(String[] args) {
        Cuadrado obj = new Cuadrado();
        obj.IngresoDatos();
        obj.Area();
        obj.Perimetro();
    }

}
