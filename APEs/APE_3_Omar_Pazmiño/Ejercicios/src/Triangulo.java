import java.util.Scanner;

public class Triangulo {

    private Scanner teclado;
    private int punto1x, punto1y, punto2x, punto2y, punto3x, punto3y;

    public void Proceso(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del punto 1");
        punto1x=teclado.nextInt();
        System.out.println("Ingrese la coordenada y del punto 1");
        punto1y=teclado.nextInt();
        System.out.println("Ingrese la coordenada x del punto 2");
        punto2x=teclado.nextInt();
        System.out.println("Ingrese la coordenada y del punto 2");
        punto2y=teclado.nextInt();
        System.out.println("Ingrese la coordenada x del punto 3");
        punto3x=teclado.nextInt();
        System.out.println("Ingrese la coordenada y del punto 3");
        punto3y=teclado.nextInt();
    }

    public void SuperficieTriangulo(){
        double superficie=0;
        superficie=(1/2)*(punto1x*(punto2y-punto3y)+punto2x*(punto3y-punto1y)+punto3x*(punto1y-punto2y));
        System.out.println("La superficie del triangulo es: "+superficie);
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.Proceso();
        triangulo.SuperficieTriangulo();
    }

}
