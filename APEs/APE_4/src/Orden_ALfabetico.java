import java.util.Scanner;

public class Orden_ALfabetico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Coches[] = {"Alfa Romero","Fiat","Ford","Lancia","Renault","Seat","",""};
        String contenedor="";
        for (int i = 6; i < Coches.length; i++) {
            System.out.println("Ingrese la marca de los carros");
            Coches[i]=teclado.nextLine();
        }
        for (int i = 0; i < Coches.length - 1; i++) {
                    for (int j = 0; j < Coches.length - 1 - i; j++) {
                        if (Coches[j].compareTo(Coches[j+1])>0) {
                            contenedor = Coches[j];
                            Coches[j] = Coches[j + 1];
                            Coches[j + 1] = contenedor;
                        }
                    }
                }
                for (int i = 0; i < Coches.length; i++) {
                    System.out.println(Coches[i]);
                }
    }
}
