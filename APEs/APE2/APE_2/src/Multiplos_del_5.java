import java.util.Scanner;

public class Multiplos_del_5 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int i=1,N,multiplo=0;
    System.out.println("Ingrese la cantidad de multplis que quiere saber");
    N=teclado.nextInt();
    do {
        multiplo+=5;
        System.out.println("5*"+i+"="+multiplo);
        i++;
    } while (i<=N);
}
}
