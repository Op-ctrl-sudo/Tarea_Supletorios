import java.util.Scanner;

public class Numero_Base {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num, base,digito;
    System.out.println("Ingrese un numero");
    num=teclado.nextInt();
    System.out.println("Ingrese la base");
    base=teclado.nextInt();
    boolean valido=true;
    do {
        digito=num%10;
        if (digito>=base) {
            valido=false;
            break;
        }
        num/=10;
    } while (num>0);
    if (valido) {
        System.out.println("El numero pertenece a la base");
    }
    else {
        System.out.println("El numero no pertenece a la base");
    }
}
}
