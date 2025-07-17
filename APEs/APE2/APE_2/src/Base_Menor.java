import java.util.Scanner;

public class Base_Menor {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num,base,restante;
    String resultado;
    System.out.println("Ingrese un numero en base 10");
    num=teclado.nextInt();
    System.out.println("Ingrese una base menor a 10 e igual o mayor a 2");
    base=teclado.nextInt();
    if (base<2 | base>10) {
        System.out.println("La base debe ser menor a 10 y mayo o igual a 2");
    } 
    else {
        if (num==0) {
            System.out.println("El numero en base "+base+" es 0");
        }
        else {
            resultado ="";
            while (num>0 | num<0) {
                restante=num%base;
                resultado=restante+resultado;
                num/=base;
            }
            if (num<0) {
                resultado="-"+resultado;
            }
            System.out.println("El numero en base "+base+" es: "+resultado);  
    }
}
}
}