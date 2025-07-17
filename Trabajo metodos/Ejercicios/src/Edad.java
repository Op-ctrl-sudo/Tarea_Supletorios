import java.util.Scanner;

public class Edad {

    public Scanner teclado;
    public int edad = 0;

    public void IngresoEdad() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();
    }

    public void Etapa() {
        String etapa = "";
        if (edad < 0) {
            System.out.println("Ingrese una edad valida");
        } else {
            if (edad >= 0 && edad < 3) {
                etapa = "Bebé";
            } else {
                if (edad < 5) {
                    etapa = "Niño";
                } else {
                    if (edad < 13) {
                        etapa = "Pubertad";
                    } else {
                        if (edad < 18) {
                            etapa = "Adolescencia";
                        } else {
                            if (edad < 25) {
                                etapa = "Joven";
                            } else {
                                if (edad < 60) {
                                    etapa = "Adulto";
                                } else {
                                    etapa = "Anciano";
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Usted se encuentra en la etapa: " + etapa);
        }
    }

    public static void main(String[] args) {
        Edad obj = new Edad();
        obj.IngresoEdad();
        obj.Etapa();
    }

}
