import java.util.Scanner;

public class suma {

    private double num1,num2,num3,num4,num5,resultado;

    public void resolucion(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1=teclado.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2=teclado.nextDouble();
        System.out.println("Ingrese el tercer numero");
        num3=teclado.nextDouble();
        System.out.println("Ingrese el cuarto numero");
        num4=teclado.nextDouble();
        System.out.println("Ingrese el quinto numero");
        num5=teclado.nextDouble();
    }

    public void SumaDeLosNumeros(){
        resultado=num1+num2+num3+num4+num5;
        System.out.println("El resultado de la suma es: "+resultado);
    }

    public static void main(String[] args) {
        suma Suma = new suma();
        Suma.resolucion();
        Suma.SumaDeLosNumeros();
    }

}
