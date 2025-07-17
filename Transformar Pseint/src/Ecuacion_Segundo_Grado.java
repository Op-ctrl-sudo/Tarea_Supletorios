import java.util.Scanner;

public class Ecuacion_Segundo_Grado {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a,b,c,x1,x2;
    System.out.println("Resolucion de ecuacion de segunod grado");
    System.out.println("Ingrese el valor de a");
    a=teclado.nextInt();
    System.out.println("Ingrese el valor de b");
    b=teclado.nextInt();
    System.out.println("Ingrese el valor de c");
    c=teclado.nextInt();
    if (Math.pow(b, 2)-4*a*c<0) {
        System.out.println("No existe respuesta");
    }
    else {
        x1=(int)(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        x2=(int)(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        System.out.println("La primera respuesta de le ecuacion es: "+x1);
        System.out.println("La segunda respuesta de le ecuacion es: "+x2);
    }
}
}
