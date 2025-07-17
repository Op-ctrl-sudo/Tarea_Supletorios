import java.util.Scanner;

public class Orden {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[5];
        int contador = 0;
        String orden = "", seleccion1 = "A", seleccion2 = "D";
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingrese el numero " + i);
            numero[i] = teclado.nextInt();
        }
        System.out.println("Ingrese el orden de los numeros");
        System.out.println("A=Asendente  D=Descendente");
        orden = teclado.next();
        if (!orden.equals(seleccion1) && !orden.equals(seleccion2)) {
            System.out.println("Ingrese una letra valida");
        } else {
            if (orden.equals(seleccion1)) {
                System.out.println("Escojio de orden ascendente");
                System.out.println("el orden es: ");
                for (int i = 0; i < numero.length - 1; i++) {
                    for (int j = 0; j < numero.length - 1 - i; j++) {
                        if (numero[j] > numero[j + 1]) {
                            contador = numero[j];
                            numero[j] = numero[j + 1];
                            numero[j + 1] = contador;
                        }
                    }
                }
                for (int i = 0; i < numero.length; i++) {
                    System.out.println(numero[i]);
                }

            } else {
                System.out.println("Escojio de orden descendente");
                System.out.println("el orden es: ");
                for (int i = 0; i < numero.length - 1; i++) {
                    for (int j = 0; j < numero.length - 1 - i; j++) {
                        if (numero[j] < numero[j + 1]) {
                            contador = numero[j];
                            numero[j] = numero[j + 1];
                            numero[j + 1] = contador;
                        }
                    }
                }
                for (int i = 0; i < numero.length; i++) {
                    System.out.println(numero[i]);
                }

            }
        }
    }
}
