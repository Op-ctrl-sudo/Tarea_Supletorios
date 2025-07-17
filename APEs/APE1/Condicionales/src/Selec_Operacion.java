import java.util.Scanner;

public class Selec_Operacion {
public static void main(String[] args) {
    //Importar la biblioteca de Scanner
    Scanner teclado = new Scanner(System.in);
    //Definimos los datos
    float num1,num2,suma,resta,multi,divi;
    int seleccionOp;
    //Pedimos el ingreso de datos y seleccion de operacion
    System.out.println("Ingrese el valor 1");
    num1 = teclado.nextFloat();
    System.out.println("Ingrese el valor 2");
    num2 = teclado.nextFloat();
    System.out.println("---------------------------------------------");
    System.out.println("      Escoja que oprecaion quiere realizar");
    System.out.println("---------------------------------------------");
    System.out.println("1:Suma--2:Resta--3:Multiplicacion--4:Division");
    System.out.println("---------------------------------------------");
    seleccionOp = teclado.nextInt();
    //Proceso dependiendo que selecciono y salida de resultado
    if (seleccionOp==1) {
        suma=(float)(num1+num2);
        System.out.println("Selecciono suma");
        System.out.println("---------------");
        System.out.println("La suma es: "+suma);
    }
    else {
        if (seleccionOp==2) {
            resta=(float)(num1-num2);
            System.out.println("Selecciono resta");
            System.out.println("----------------");
            System.out.println("La resta es: "+resta);
        }
        else {
            if (seleccionOp==3) {
                multi=(float)(num1*num2);
                System.out.println("Selecciono multiplicacion");
                System.out.println("-------------------------");
                System.out.println("La multiplicacion es: "+multi);
            }
            else {
                if (seleccionOp==4) {
                    divi=(float)(num1/num2);
                    System.out.println("Selecciono division");
                    System.out.println("-------------------");
                    System.out.println("La division es: "+Math.round(divi*100)/100d);
                }
            }
        }
    }
}
}
