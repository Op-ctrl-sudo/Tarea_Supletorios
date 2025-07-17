import java.util.Scanner;

public class DescuentosRecargos {

    public static double obtenerDescuento(char tipoCliente, char formaPago) {
        if (formaPago == 'C') {
            if (tipoCliente == 'G') return 0.15;
            else if (tipoCliente == 'A') return 0.20;
        }
        return 0.0;
    }

    public static double obtenerRecargo(char tipoCliente, char formaPago) {
        if (formaPago == 'P') { 
            if (tipoCliente == 'G') return 0.10;
            else if (tipoCliente == 'A') return 0.05;
        }
        return 0.0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto de la compra: ");
        double monto = sc.nextDouble();
        System.out.print("Tipo de cliente (G = General, A = Afiliado): ");
        char tipo = sc.next().toUpperCase().charAt(0);
        System.out.print("Forma de pago (C = Contado, P = Plazos): ");
        char pago = sc.next().toUpperCase().charAt(0);

        double descuento = obtenerDescuento(tipo, pago) * monto;
        double recargo = obtenerRecargo(tipo, pago) * monto;
        double total = monto - descuento + recargo;

        System.out.println("Monto original: " + monto);
        System.out.println("Descuento: " + descuento);
        System.out.println("Recargo: " + recargo);
        System.out.println("Total a pagar: " + total);
    }
}
