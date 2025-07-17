import java.util.Scanner;

public class Identificar_Cantidad {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num;
    System.out.println("Determinar la cantidad de digitos que tiene el numero");
    System.out.println("Escoja un numero del 0 al 9.999");
    num=teclado.nextInt();
    if (num>=10000 | num<0) {
        System.out.println("Numero invalido");
    }
    else{
        if (num<10) {
            System.out.println("El numero tien: 1 cifra");
        }
        else {
            if (num<100) {
                System.out.println("El numero tien: 2 cifras");
            }
            else{
                if (num<1000) {
                    System.out.println("El numero tien: 3 cifras");
                }
                else {
                    if (num<10000) {
                        System.out.println("El numero tien: 4 cifras");
                    }
                }
            }
        }
    }
}
}
