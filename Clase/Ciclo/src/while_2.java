import java.util.Scanner;

public class while_2 {
    public static void main(String [] args) {
        int lims,limm,sumatoria;
        sumatoria=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el limite superior");
        lims = teclado.nextInt();
        System.out.println("Ingrese el limite inferios");
        limm = teclado.nextInt();
        System.out.println("Secuencia");
        if (limm<0 && lims<0) {
            System.out.println("Los limites deben ser mayor a 0");
        }
        else {
            if (lims!=limm) {
                while (lims>=limm) {
                    System.out.println(limm);
                    sumatoria=sumatoria+limm;
                    limm++;
                }   
                System.out.println("La sumatoria de los numero es: "+sumatoria);
            }
            else {
                System.out.println("Los numeros deben ser diferentes");
            }
        }
        if (limm>lims) {
            System.out.println("El limite inferior no puede ser mayor al superios");
        }
    }
}
