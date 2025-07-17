import java.util.Scanner;

public class Edad {
public static void main(String[] args) {
    //Importar la biblioteca de Scanner
    Scanner teclado = new Scanner(System.in);
    //Definimos las variables
    int dia1,dia2,mes1,mes2,año1,año2,edad,edadm,edadd;
    //pedimos el ingreso de datos
    System.out.println("Ingrese el dia de su fecha de nacimiento meses tienen 31 dias");
    dia1 = teclado.nextInt();
    System.out.println("Ingrese el mes de su fecha de nacimiento");
    mes1 = teclado.nextInt();
    System.out.println("Ingrese el año de su fecha de nacimiento");
    año1 = teclado.nextInt();
    System.out.println("Ingrese el dia de la fecha actual");
    dia2 = teclado.nextInt();
    System.out.println("Ingrese el mes de la fecha actual");
    mes2 = teclado.nextInt();
    System.out.println("Ingrese el año de la fecha actual");
    año2 = teclado.nextInt();
    //Proceso para saber la edad y salida en años o meses y dias
    if (año2-año1>=1) {
        if (mes1>mes2) {
            edad=año2-año1-1;   
            System.out.println("La edad es de: "+edad+" años");
        }
        else {
            if (mes1==mes2) {
                if (dia1<=dia2) {
                    edad=(año2-año1)+1;
                    System.out.println("La edad es de: "+edad+" años");
                }
            }
            else {
                if (mes1<mes2) {
                    edad=año2-año1;
                    System.out.println("La edad es de: "+edad+" años");
                }
            }
        }
    }
    else {
        if (mes1==mes2) {
            edadd=dia2-dia1;
            System.out.println("La edad es de: "+edadd);
        }
        else {
            if (mes1<mes2) {
                edadm=mes2-mes1;
                if (dia1<dia2) {
                    edadd=dia2-dia1;
                    System.out.println("La edad es de: "+edadm+" meses con "+edadd+" dias");
                }
                else {
                    System.out.println("La edad es de: "+edadm+" meses");
                }
            }
        }
    }
}
}
