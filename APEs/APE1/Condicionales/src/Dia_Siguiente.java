import java.util.Scanner;

public class Dia_Siguiente {
public static void main(String[] args) {
    //Importamos la biblioteca Scanner
    Scanner teclado = new Scanner(System.in);
    int dia,mes,año;
    System.out.println("Ingrese el dia");
    dia = teclado.nextInt();
    System.out.println("Ingrese el mes");
    mes = teclado.nextInt();
    System.out.println("Ingrese el año");
    año = teclado.nextInt();
    if (mes==4 | mes==6 | mes==9 | mes==11) {
        if (dia==30) {
            dia=1;
            mes+=1;
        }
        else {
            dia+=1;
        }
    }
    else {
        if (mes==1 | mes==3 | mes==5 | mes==7 | mes==8 | mes==10 | mes==12) {
            if (mes==12) {
                if (dia==31) {
                    dia=1;
                    mes=1;
                    año+=1;
                }
                else {
                    dia+=1;
                }
            }
            else {
                if (dia==31) {
                    dia=1;
                    mes+=1;
                }
                else {
                    dia+=1;
                }
            }
        }
        else {
            if (mes==2) {
                if (año%4==0) {
                    if (dia==29) {
                        dia=1;
                        mes+=1;
                    }
                    else {
                        dia+=1;
                    }
                }
                else {
                    if (dia==28) {
                        dia=1;
                        mes+=1;
                    }
                    else{
                        dia+=1;
                    }
                }
            }
        }
    }
    System.out.println("El dia siguiente tiene una fecha de: "+dia+"/"+mes+"/"+año);
}
}
