import java.util.Random;
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rd = new Random();
        int rangoinicial1 = 0, rangofinal1 = 0;
        int asistencia[][] = new int[4][5];
        int sumatoria = 0;
        int total [] = new int[5];
        System.out.println("Ingrese el rango inicial");
        rangoinicial1 = teclado.nextInt();
        System.out.println("Ingrese el rango fiinal");
        rangofinal1 = teclado.nextInt();
        for (int f = 0; f < asistencia.length; f++) {
            for (int c = 0; c < asistencia[0].length; c++) {
                asistencia[f][c] = rd.nextInt(rangoinicial1,rangofinal1+1);
            }
        }
        //Item 1 - Informar la asistencia total por materia
        System.out.println("ITEM N°1");
        System.out.println("Informar la asistencia total por materia");
        for (int c = 0; c < asistencia[0].length; c++) {
            sumatoria = 0;
            for (int f = 0; f < asistencia.length; f++) {
                sumatoria += asistencia[f][c];
            }
            System.out.println("La asistencia total de la materia_"+(c+1)+" = "+sumatoria);
            total[c] = sumatoria; 
        }

        //Item 2 - Mostrar la asistencia total en la facultad 3
        System.out.println("ITEM N°2");
        System.out.println("Mostrar la asistencia total en la facultad 3");
        sumatoria = 0;
        for (int c = 0; c < asistencia[0].length; c++) {
            sumatoria += asistencia[2][c];
        }
        System.out.println("La asistencia de la facultad 3 = "+sumatoria);

        //Item 3 - Mostrar la asistencia en la materia 2 de la facultad 1
        System.out.println("ITEM N°3");
        System.out.println("Mostrar la asistencia en la materia 2 de la facultad 1");
        System.out.println("La asistencia facultad 1 materia 2 = "+asistencia[0][1]);

        //Item 4 - Calcular el porcentaje de asistencia en cada facultad
        System.out.println("ITEM N°4");
        System.out.println("Calcular el porcentaje de asistencia en cada facultad");
        int totalFacultad[] = new int[asistencia.length];
        int totalGeneral = 0;
        for (int f = 0; f < asistencia.length; f++) {
            for (int c = 0; c < asistencia[0].length; c++) {
                totalFacultad[f] += asistencia[f][c];
            }
            totalGeneral += totalFacultad[f];
            System.out.println("El total de la facultad_"+(f+1)+" = "+totalGeneral);
        }

        //Item 5 - Determinar la facultad con la mayor asistencia
        System.out.println("ITEM N°5");
        System.out.println("Determinar la facultad con la mayor asistencia");
        int mayor = total[0], posicion = 0;
        for (int c = 1; c < total.length; c++) {
            if (mayor<total[c]) {
                mayor=total[c];
                posicion = c;
            }
        }
        System.out.println("La facultad "+ (posicion+1)+" = "+mayor);
    }

}
