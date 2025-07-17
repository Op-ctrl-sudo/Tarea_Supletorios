import java.util.Scanner;

public class Matrices {

    public Scanner teclado;
    public int [][] A = new int[2][2];
    public int [][] B = new int[2][2];
    public void CargarValoresMatrizA(){
        teclado = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.println("Ingrese el valor de la matriz A[ "+ i + "][" + j + "]: ");
                A[i][j] = teclado.nextInt();
            }
        }
    }

    public void CargarValoresMatrizB(){
        teclado = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.println("Ingrese el valor de la matriz B[ "+ i + "][" + j + "]: ");
                B[i][j] = teclado.nextInt();
            }
        }
    }

    public void MultiplicacionMatrices(){
        int [][]C = new int [2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.print("El valor de C= ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j]+"\t");
            }
        }
    }

    public static void main(String[] args) {
        Matrices obj = new Matrices();
        obj.CargarValoresMatrizA();
        obj.CargarValoresMatrizB();
        obj.MultiplicacionMatrices();
    }

}
