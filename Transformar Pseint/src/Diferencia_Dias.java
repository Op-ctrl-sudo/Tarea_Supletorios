import java.util.Scanner;

public class Diferencia_Dias {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int dia1,dia2,mes1,mes2,año1,año2,dias,meses,años,diferencia;
    System.out.println("Ingrese el dia de la primera fecha");
    dia1=teclado.nextInt();
    System.out.println("Ingrese el mes de la primera fecha");
    mes1=teclado.nextInt();
    System.out.println("Ingrese el año de la primera fecha");
    año1=teclado.nextInt();
    System.out.println("Ingrese el dia de la segunda fecha");
    dia2=teclado.nextInt();
    System.out.println("Ingrese el mes de la segunda fecha");
    mes2=teclado.nextInt();
    System.out.println("Ingrese el año de la segunda fecha");
    año2=teclado.nextInt();
    if (año1==año2) {
        años=0;
    }
    else {
        if (año1>año2) {
            años=(año1-año2)*12;
        }
        else {
            años=(año2-año1)*12;
        }
    }
    if (mes1==mes2) {
        meses=0;
    }
    else {
        if (mes1>mes2) {
            meses=(mes1-mes2)*30;
        }
        else {
            meses=(mes2-mes1)*30;
        }
    }
    if (dia1>dia2) {
        dias=dia1-dia2;
    }
    else {
        dias=dia2-dia1;
    }
    diferencia=años+meses+dias;
    System.out.println("La diferencia de dias es de "+diferencia+" dias");
}
}
