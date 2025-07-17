import java.util.Scanner;

public class triangulo {
public static void main(String[] args) {
    //Importamos la biblioteca Scanner
    Scanner teclado = new Scanner(System.in);
    //Definimos las variables
    int l1,l2,l3;
    //Pedimos el ingreso de datos
    System.out.println("Ingrese el primer lado del triangulo");
    l1 = teclado.nextInt();
    System.out.println("Ingrese el segundo lado del triangulo");
    l2 = teclado.nextInt();
    System.out.println("Ingrese el tercer lado del triangulo");
    l3 = teclado.nextInt();
    //Proceso para identificar el tipo de triangulo y si cumple la desisgualdad triangular
    if (l1+l2>l3 && l1+l3>l2 && l3+l2>l1) {
        if (l1==l2) {
            if (l1==l3) {
                System.out.println("La clase del triangulo es: Equilátero");
            }
            else {
                if (l1!=l3) {
                    System.out.println("La clase del triangulo es: Isósceles");
                }
            }
        }
        else {
            if (l1!=l2) {
                if (l2==l3) {
                    System.out.println("La clase del triangulo es : Isóceles");
                }
                else {
                    if (l2!=l3) {
                        System.out.println("La clase del triangulo es : Escaleno");
                    }
                }
            }
        }
    }
    else {
        System.out.println("El triangulo el invalido ya que no cumple la sedigualdad triangular");
    }
}
}
