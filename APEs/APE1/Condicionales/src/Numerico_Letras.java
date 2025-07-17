import java.util.Scanner;

public class Numerico_Letras {
public static void main(String[] args) {
    //Importamos la biblioteca de Scanner
    Scanner teclado = new Scanner(System.in);
    //Definimos las variables
    float calificacion;
    String letra = null;
    //Pedimos el ingreso de datos
    System.out.println("Ingrese su calificacion del 0-100");
    calificacion = teclado.nextFloat();
    //Ponemos restrincciones 
    if (calificacion>100 | calificacion<0) {
        System.out.println("El numero ingresado no corresponde a un grado numérico");
    }
    //Proceso para identificar la letra
    else {
        if (calificacion < 69 ) {
            letra="F";
        }
        else {
            if (calificacion>=69 && calificacion<70) {
                letra="D"; 
            }
            else {
                if (calificacion>=70 && calificacion<80) {
                    letra="C"; 
                }
                else {
                    if (calificacion>=80 && calificacion<90) {
                        letra="B"; 
                    }
                    else {
                        if (calificacion>=90) {
                            letra="A"; 
                        }
                    }
                }
            }
        }
        //Salida de la letra en base a la calificacion
        System.out.println("-------------------------------------");
                System.out.println("--Grado Numérico-----Grado en letra--");
                System.out.println("-------------------------------------");
                System.out.println("--"+calificacion+"          -----             "+letra+"--");
    }
}
}
