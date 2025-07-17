import java.util.Scanner;

public class DosNumeros_Operacion {
public static void main(String[] args) {
    //Importar libreria Scanner
    Scanner teclado = new Scanner(System.in);
    //Definimos las variables
    float num1,num2,resta,suma,multi,divi;
    int op;
    //Pedimos el ingreso de los datos y la operacion
    System.out.println("Ingrese el valor 1");
    num1 = teclado.nextFloat();
    System.out.println("Ingrese el valor 2");
    num2 = teclado.nextFloat();
    System.out.println("-------------------------------------------------");
    System.out.println("         Escojer una operacion");
    System.out.println("-------------------------------------------------");
    System.out.println("--1:Suma--2:Resta--3:Multiplicacion--4:Division--");
    System.out.println("-------------------------------------------------");
    op = teclado.nextInt();
    //Proceso dependiendo que selecciono y salida de resultado
    if (op==1) {
        suma=(float)(num1+num2);
        System.out.println("Selecciono suma");
        System.out.println("---------------");
        System.out.println("La suma es: "+suma);
    }
    else {
        if (op==2) {
            resta=(float)(num1-num2);
            System.out.println("Selecciono resta");
            System.out.println("----------------");
            System.out.println("La resta es: "+resta);
        }
        else {
            if (op==3) {
                multi=(float)(num1*num2);
                System.out.println("Selecciono multiplicacion");
                System.out.println("-------------------------");
                System.out.println("La multiplicacion es: "+multi);
            }
            else {
                if (op==4) {
                    if (num2>0) {
                        divi=(float)(num1/num2);
                        System.out.println("Selecciono division");
                        System.out.println("-------------------");
                        System.out.println("La division es: "+Math.round(divi*100)/100d);   
                    }
                    else {
                        System.out.println("Error al dividir por 0");
                    }
                }
            }
        }
    }
}
}
