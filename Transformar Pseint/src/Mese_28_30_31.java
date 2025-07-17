import java.util.Scanner;

public class Mese_28_30_31 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int mes,dia,año;
    System.out.println("Indicar si la fecha es correcta");
    System.out.println("Ingrese el dia de la fecha");
    dia= teclado.nextInt();
    System.out.println("Ingrese el mes de la fecha");
    mes= teclado.nextInt();
    System.out.println("Ingrese el año de la fecha");
    año= teclado.nextInt();
    if (mes>12) {
        System.out.println("La fecha indicada es incorrecta");
    }
    else {
        if (mes==1 | mes==3 | mes==5 | mes==7 | mes==8 | mes==10 | mes==12) {
            if (dia<0 | dia>31) {
                System.out.println("La fecha indicada es incorrecta");
            }
            else {
                System.out.println("La fecha indicada es correcta");
            }
        }
        else {
            if (mes==2) {
                if (dia>=28 | dia<0) {
                    System.out.println("La fecha indicada es incorrecta");
                }
                else {
                    System.out.println("La fecha indicada es correcta");
                }
            }
            else {
                if (dia>30 | dia<0) {
                    System.out.println("La fecha indicada es incorrecta");
                }
                else {
                    System.out.println("La fecha indicada es correcta");
                }
            }
        }
    }
}
}
