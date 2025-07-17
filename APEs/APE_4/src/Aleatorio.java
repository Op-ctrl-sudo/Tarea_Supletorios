import java.util.Random;

public class Aleatorio {

    public static void main(String[] args) {
        int numero[]= new int[6];
        Random rd = new Random();
        int contador=0;
        for (int i = 0; i < numero.length; i++) {
            numero[i]=rd.nextInt(10);
        }
        for (int i = 0; i < numero.length - 1; i++) {
                    for (int j = 0; j < numero.length - 1 - i; j++) {
                        if (numero[j] < numero[j + 1]) {
                            contador = numero[j];
                            numero[j] = numero[j + 1];
                            numero[j + 1] = contador;
                        }
                    }
                }
                for (int i = 0; i < numero.length; i++) {
                    System.out.println(numero[i]);
                }
    }
}
