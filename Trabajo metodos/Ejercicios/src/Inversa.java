import java.util.Scanner;

public class Inversa {

    public Scanner teclado;
    public int numero=0;
    public void DatoEntrada(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
    }

    public void Inverso(){
        int digito=0, inversa=0;
         while (numero>0 | numero<0) {
        digito=numero%10;
        inversa=inversa*10+digito;
        numero/=10;
    }
    if (numero<0) {
        inversa*=-1;
    }
    System.out.println("El numero inverso es:"+inversa);
    }

    public static void main(String[] args) {
        Inversa obj = new Inversa();
        obj.DatoEntrada();
        obj.Inverso();
    }

}
