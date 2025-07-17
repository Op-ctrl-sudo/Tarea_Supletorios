import java.util.Scanner;

public class Curso {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Maximo = 1000,cantidad=0,menor=0;
        double promedio=0;
        int Edad[] = new int[Maximo];
        String Nombre[] = new String[Maximo];
        for (int i = 0; i < Nombre.length; i++) {
            System.out.println("Ingrese el nombre del estudiantes " + i);
            Nombre[i] = teclado.next();
            if (Nombre[i].equals("*")) {
                break;
            }
            else {
            System.out.println("Ingrese la edad del estudiante " + i);
            Edad[i] = teclado.nextInt();
            }
            cantidad++;
        }
        for (int i = 0; i <= cantidad; i++) {
            if (Edad[i]>=18) {
                System.out.println(Nombre[i]+" tiene "+Edad[i]);
            }
            else{
                menor++;
            }
        }
        promedio=cantidad/menor;
        System.out.println("El promedio de los estudiantes de menor de edad es: "+promedio);
    }
}
