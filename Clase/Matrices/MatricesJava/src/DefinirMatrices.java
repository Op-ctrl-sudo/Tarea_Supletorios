import java.util.Random;
import java.util.Scanner;
//Desplazamiento horizontal = primero filas luego columnas
//Desplazamiento vertical = primero columnas luego filas
public class DefinirMatrices { 

    public static void CargarMatricesEnteras(int [][]_matriz){
        Scanner teclado = new Scanner(System.in);
        //Carga manual
        System.out.println("Cargar matrices");
        for (int f = 0; f < _matriz.length; f++) {
            for (int c = 0; c < _matriz[0].length; c++) {
                System.out.print("Ingrese el valor : ");
                _matriz[f][c]= teclado.nextInt();
            }
        }
    }

    public static void ImprimirMatericesEnteras(int [][]_matriz){
        //Imprimir Matrices
        System.out.println("Imprimir matrices");
        for (int f = 0; f < _matriz.length; f++) {
            for (int c = 0; c < _matriz[0].length; c++) {
                System.out.print("V["+f+"]["+c+"]= ");
                System.out.print(_matriz[f][c]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    public static void CargaAleatoriaMatrizEntera(int [][]_matriz, int _rangoinicial, 
                                                    int _rangofinal){
        Random rd = new Random();
        //Carga aleatoria
        System.out.println("Carga de matriz de manera aleatoria");
        for (int f = 0; f < _matriz.length; f++) {
            for (int c = 0; c < _matriz[0].length; c++) {
                _matriz[f][c]= rd.nextInt( _rangoinicial, _rangofinal+1);
            }
        }
    }

    public static int Dado(int[][] _matriz){
        int victoria=0;
        for (int f = 0; f < _matriz.length; f++) {
            if(_matriz[f][0] == _matriz[f][1]){
                victoria++;
            }
        }
        return victoria;
    }

    public static void main(String[] args) throws Exception {
        //1)Longitud fija
        //Fila,Columna
        int matriz5 [][] = new int[20][2];
        int matriz1 [][] = new int[3][4];
        int matriz4 [][] = new int[2][2];
        //2) Matrices con valores definidos
        int [][]matriz2 = new int[][]{
                                        {1,2,3,4,},
                                        {5,6,7,8},
                                        {9,10,11,12}
                                     };
        //3) Matrices con valores por demanda
        int [][]matriz3;
        int filas=3;
        int columnas=4;
        matriz3= new int[filas][columnas];

        //Conocer el numero de filas y columnas de una matriz
        System.out.println("Numero de filas = " + matriz2.length);
        System.out.println("Numero de columnas = "+matriz2[0].length);

        //Carga manual
        //CargarMatricesEnteras(matriz1);
        //argarMatricesEnteras(matriz3);
        //CargarMatricesEnteras(matriz4);
        //ImprimirMatericesEnteras(matriz2);
        //CargaAleatoriaMatrizEntera(matriz1,10,30);
        //CargaAleatoriaMatrizEntera(matriz3,1,10);
        //ImprimirMatericesEnteras(matriz1);
        //ImprimirMatericesEnteras(matriz3);

        //Carga aleatoria
        CargaAleatoriaMatrizEntera(matriz5, 1, 6);
        ImprimirMatericesEnteras(matriz5);
        System.out.println("El numero de victorias es: "+Dado(matriz5));
        
    }
}
