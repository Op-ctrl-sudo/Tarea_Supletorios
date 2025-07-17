import java.util.Scanner;
import java.util.Random;

public class Juego {
    public static void main(String[] args) {
        //Importar Scanner y Random
        Scanner teclado = new Scanner(System.in);
        Random rd = new Random();
        //Definir las variables
        String papel,piedra,tijera;
        int PuntoUsu,PuntoComp,computadora,jugada;
        PuntoComp=0;
        PuntoUsu=0;
        //Proceso para que el juego sea al mejor de 3
        while (PuntoUsu<2 && PuntoComp<2) {
            System.out.println("Ingrese su jugada entre --1:Piedra--2:Papel--3:Tijera--");
            jugada = teclado.nextInt();
            if (jugada>3 && jugada<1) {
                System.out.println("Entrada invalida");
            }
            computadora= rd.nextInt(4);
            if (computadora==1) {
                System.out.println("La computadora eligio Piedra");
            }
            else {
                if (computadora==2) {
                    System.out.println("La computadora eligio Papel");
                }
                else {
                        System.out.println("La computadora eligio Tijera");   
                }
            }
            if (jugada==computadora) {
                System.out.println("Empate");
            }
            else {
                if (jugada==2 && computadora==1) {
                    System.out.println("Ganaste esta ronda");
                    PuntoUsu++;
                }
                else {
                    if (jugada==1 && computadora==2) {
                        System.out.println("Perdiste esta ronda");
                        PuntoComp++;
                    }
                }
                if (jugada==3 && computadora==2) {
                    System.out.println("Ganaste esta ronda");
                    PuntoUsu++;
                }
                else {
                    if (jugada==2 && computadora>2) {
                        System.out.println("Perdiste esta ronda");
                        PuntoComp++;
                    }
                }
                if (jugada==1 && computadora>2) {
                    System.out.println("Ganaste esta ronda");
                    PuntoUsu++;
                }
                else {
                    if (jugada==3 && computadora==1) {
                        System.out.println("Perdiste esta ronda");
                        PuntoComp++;
                    }
                }
            }
            System.out.println("Marcador: Usuario = "+PuntoUsu+"   Computadora = "+PuntoComp);
        }
    }
}

