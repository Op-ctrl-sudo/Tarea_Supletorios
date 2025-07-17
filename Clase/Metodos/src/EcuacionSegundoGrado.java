import java.util.Scanner;

public class EcuacionSegundoGrado {

    public int a;
    public int b;
    public int c;

    public void Proceso(){
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Ingrese el valor de a: ");
            a = teclado.nextInt();
            if (a==0) {
             System.out.println("Valor no valido ingrese un valor valido");   
            }
        } while (a==0);
        System.out.print("Ingrese el valor de b: ");
        b = teclado.nextInt();
        System.out.print("Ingrese el valor de c: ");
        c = teclado.nextInt();
    }

    public void FormulaGeneral(){
        double resultado1 = 0, resultado2 = 0;
        if (Math.pow(b, 2)-4*a*c<0) {
            System.out.println("La ecuacion no tiene solucion");
        }
        else {
            resultado1= (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            resultado2= (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
            if (resultado1 != resultado2) {
            System.out.println("El resultado de la Ecuacion es x1:"+resultado1+" x2: "+resultado2);   
        }
        else {
            System.out.println("La Ecuacion tiene una solucion x:"+resultado1);
        }
        if (a>0) {
            System.out.println("La curva es haci abajo");
        }
        else {
            System.out.println("la curva es hacia arriba");
        }
        }
    }

    public static void main(String[] args) {
        EcuacionSegundoGrado ecuacionsegundogrado = new EcuacionSegundoGrado();
        ecuacionsegundogrado.Proceso();
        ecuacionsegundogrado.FormulaGeneral();
    }

}
