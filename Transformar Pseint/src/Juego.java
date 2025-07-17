import java.util.Scanner;

public class Juego {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
 int N,num;
 System.out.println("Creamos un juego de adivinar el numero");
 System.out.println("Ingrese el numero a adivinar");
 N=teclado.nextInt();
 System.out.println("Ingrese un numero");
 num=teclado.nextInt();
 do {
    if (num>N) {
        System.out.println("Ingrese un numero menor");
        num=teclado.nextInt();
    }
    else {
        if (num<N) {
            System.out.println("Ingrese un numero mayor");
            num=teclado.nextInt();
        }
    }
} while(N!=num);
System.out.println("Adivino el numero ");
}
}
