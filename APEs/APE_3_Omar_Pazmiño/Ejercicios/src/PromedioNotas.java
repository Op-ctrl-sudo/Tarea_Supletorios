import java.util.Scanner;

public class PromedioNotas {

    private Scanner teclado;
    private double nota1,nota2,nota3;

    public void proceso(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la primera nota");
        nota1 = teclado.nextInt();
        System.out.println("Ingrese la segunda nota");
        nota2 = teclado.nextInt();
        System.out.println("Ingrese la tercera nota");
        nota3 = teclado.nextInt();
    }

    public void Promedio(){
        double promedio;
        if (nota1>nota2) {
            if (nota2>nota3) {
                promedio=(nota1+nota2)/2;
            }
            else {
                promedio=(nota1+nota3)/2;
            }
        }
        else {
            if (nota1>nota3) {
                promedio=(nota1+nota2)/2;
            }
            else {
                promedio=(nota2+nota3)/2;
            }
        }
        System.out.println("El promedio de las 2 notas mas altas es: "+promedio);
    }

    public static void main(String[] args) {
        PromedioNotas promedionotas = new PromedioNotas();
        promedionotas.proceso();
        promedionotas.Promedio();
    }

}
