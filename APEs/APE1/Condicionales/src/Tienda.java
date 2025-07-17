import java.util.Scanner;

public class Tienda {
public static void main(String[] args) {
    //Importar biblioteca Scanner
    Scanner teclado = new Scanner(System.in);
    //Ingreso de los datos 
    float monto,descuento,total;
    //Damos a conocer el descuento de la tienda
    System.out.println("La tienda cuenta con un descuento por la compra mayor o igual a $100 por el 10% y por uan compra mayor o igual a $500 del 20%");
    //Pedimos el ingreso de datos
    System.out.println("Ingrese el monto a pagar");
    monto = teclado.nextFloat();
    if (monto>=100 && monto<500) {
        descuento = (float)(monto*0.10);
        total = monto-descuento;
    }
    else {
        if (monto>=500) {
            descuento = (float)(monto*0.20);
        total = monto-descuento;
        }
        else {
            descuento = 0;
            total=monto;
        }
    }
    System.out.println("Su monto es de: "+monto+" con un descuento de: "+descuento+" es un total de: "+total);
}
}
