import java.util.Scanner;

public class SumaDigitos {

    public Scanner teclado;
    public int numero = 0;

    public void IngresoNumero() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
    }

    public void Digitos() {
        int digito = 0, SumaPares = 0, SumaImpares = 0;
        do {
            digito = numero % 10;
            if (digito % 2 == 0) {
                SumaPares += digito;
            } else {
                SumaImpares += digito;
            }
            numero /= 10;
        } while (numero > 0);
        System.out.println("La suma de los digitos pares es: " + SumaPares);
        System.out.println("La suma de los digitos impares es: " + SumaImpares);
    }

    public static void main(String[] args) {
        SumaDigitos obj = new SumaDigitos();
        obj.IngresoNumero();
        obj.Digitos();
    }

}
