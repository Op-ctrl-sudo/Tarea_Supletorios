import java.util.Scanner;

public class SumaDigitos {

    private Scanner teclado;
    private int numero;

    public void proceso(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
    }
    public void SumaDigitosPares(){
        int pares=0,digito,i=numero;
        do {
            digito=i%10;
            if (digito%2==0) {
                pares+=digito;
            }
            i/=10;
        } while (i>0);
        System.out.println("La suma de los digitos pares es: "+pares);
    }

    public void SumaDigitosImpares(){
        int impares=0,digito;
        do {
            digito=numero%10;
            if (digito%2!=0) {
                impares+=digito;
            }
            numero/=10;
        } while (numero>0);
        System.out.println("La suma de los digitos impares es: "+impares);
    }

    public static void main(String[] args) {
        SumaDigitos digitos = new SumaDigitos();
        digitos.proceso();
        digitos.SumaDigitosPares();
        digitos.SumaDigitosImpares();
    }

}
