import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notas[] = new double[5];
        double notamedia = 0, mayor = 0, menor = 0, acumulador = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + i);
            notas[i] = teclado.nextInt();
        }
        for (int i = 0; i < notas.length; i++) {
            acumulador += notas[i];
            if (mayor > notas[i]) {
                mayor = mayor;
            } else {
                mayor = notas[i];
            }

            if (menor < notas[i]) {
                menor = mayor;
            } else {
                menor = notas[i];
            }
        }
        notamedia = acumulador / 5;
        System.out.println("--Notas--");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("--Nota Media--");
        System.out.println(notamedia);
        System.out.println("--Nota Mas Alta--");
        System.out.println(mayor);
        System.out.println("--Nota Mas Baja--");
        System.out.println(menor);
    }
}
