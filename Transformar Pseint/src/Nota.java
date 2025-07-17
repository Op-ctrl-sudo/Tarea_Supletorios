import java.util.Scanner;

public class Nota {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    float suficiente,insuficiente,satisfactorio,nota;
    System.out.println("Notificar si su nota es insuficiente,suficiente,satisfactorio");
    nota= teclado.nextFloat();
    if (nota>=9) {
        System.out.println("Su nota es Satisfactorio");
    }
    else {
        if (nota>=7 && nota<9) {
            System.out.println("Su nota es Suficiente");
        }
        else {
            System.out.println("Su nota es insuficiente");
        }
    }
}
}
