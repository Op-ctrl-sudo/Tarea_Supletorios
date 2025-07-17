import java.util.Scanner;

public class Meses_30 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int mes,dia,año;
    System.out.println("Indicar si la fecha es correcta");
    System.out.println("Ingrese el dia de la fecha");
    dia=teclado.nextInt();
    System.out.println("Ingrese el mes de la fecha");
    mes=teclado.nextInt();
    System.out.println("Ingrese el año de la fecha");
    año=teclado.nextInt();
    if (dia<=30) {
        if (mes<=12) {
            System.out.println("La fecha indicada es correcta");
        }
        else {
            System.out.println("La fecha indicada es incorrecta");
        }
    }
    else {
        System.out.println("La fecha indicada es incorrecta");
    }
}
}
