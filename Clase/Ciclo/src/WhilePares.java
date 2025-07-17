import java.util.Scanner;

public class WhilePares {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int lims,limi,pares=0,multiplos=0;
        System.out.println("Ingrese el limite inferior");
        limi = teclado.nextInt();
        System.out.println("Ingrese el limite superior");
        lims = teclado.nextInt();
        if (limi>0 && lims>0 ) {
            if (limi!=lims) {
                if (limi<lims) {
                    System.out.println("Secuencia");
                    while (limi<=lims) {
                        System.out.println(limi);
                        if (limi%2==0) {
                            pares=pares+1;
                        }
                        if (limi%3==0) {
                            multiplos=multiplos+1;
                        }
                        limi++;
                    }
                    System.out.println("Los numero pares de los limites es: "+pares);
                    System.out.println("Los numero multiplos del 3 de los limites es: "+multiplos);
                }
                else {
                    System.out.println("El limite inferior debe ser menor a el limite superior");
                }
            }
            else {
                System.out.println("Los limites deben ser diferentes");
            }
        }
        else {
            System.out.println("Los limites no pueden ser negativos");
        }
}
}
