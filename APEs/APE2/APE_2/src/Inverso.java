import java.util.Scanner;

public class Inverso {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num,digito,inverso=0;
    System.out.println("Ingrese un numero");
    num=teclado.nextInt();
    while (num>0 | num<0) {
        digito=num%10;
        inverso=inverso*10+digito;
        num/=10;
    }
    if (num<0) {
        inverso*=-1;
    }
    System.out.println("El numero inverso es:"+inverso);
}
}
