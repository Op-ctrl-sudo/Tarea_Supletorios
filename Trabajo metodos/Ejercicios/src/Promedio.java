import java.util.Scanner;

public class Promedio {

    public Scanner teclado;
    public double nota1 = 0, nota2 = 0, nota3 = 0;

    public void IngresoDatos() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la primera nota");
        nota1 = teclado.nextDouble();
        System.out.println("Ingrese la segunda nota");
        nota2 = teclado.nextDouble();
        System.out.println("Ingrese la tercera nota");
        nota3 = teclado.nextDouble();
    }

    public void Promedio() {
        double promedio = 0, sumatoria = 0;
        sumatoria = nota1 + nota2 + nota3;
        promedio = sumatoria / 3;
        System.out.println("El promedio de sus notas es: " + promedio);
    }

    public static void main(String[] args) {
        Promedio obj = new Promedio();
        obj.IngresoDatos();
        obj.Promedio();
    }

}
