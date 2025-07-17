import java.util.Scanner;

public class Vectores {
    public double [] Temperatura;

    public static void ImprimirLongitudVectorEntero(Object[] vector){
        //Conversion Object al tipo de dato del vector
        System.out.println(vector.length);
    }

    public static void ImprimirVectoresEnteros(int[] vector){
        System.out.println("Imprimir vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void ImprimirVectoresDoubles(double[] vector){
        System.out.println("Imprimir vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static double PromedioDeCurso(double[] vector){
        double sumatoria=0,promedio=0;
        for (int i = 0; i < vector.length; i++) {
            sumatoria+=vector[i];
        }
        promedio=sumatoria/vector.length;
        return promedio;
    }

    public static void CargarValoresVectorDouble(double[] vector){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor de la temperatura: ");
            vector[i] = teclado.nextDouble();
        }
    }

    public static void main(String[] args) throws Exception {
        // Metodo 1 - Longitud definida
        int[] edades = new int[6];
        edades[0] = 5;
        edades[1] = 6;
        edades[2] = 2;
        edades[3] = 8;
        edades[4] = 7;
        edades[5] = 9;

        String[] profesores = new String[2];
        profesores[0] = "Hernan";
        profesores[1] = "Ruben";

        // Metodo 2 - Valores preestablecidos
        double[] calificaciones = new double[] { 5.4, 7.8, 6.7, 9.2, 8.1, 2.4, 8.1 };
        int[] estaturas = { 165, 172, 152, 160, 187, 184, 142, 180, 300 };

        // Metodo 3 - Bajo Demanda
        // Declarar El vector
        int[] delito;
        int LongitudVector = 4;
        // Instanciar
        delito = new int[LongitudVector];
        delito[0] = 1500;
        delito[1] = 1000;
        delito[2] = 1200;
        delito[3] = 1600;

        //Longitud Vectores
        //System.out.println("Vector edades = "+ edades.length);
        //System.out.println("Vector profesores = "+ profesores.length);
        //System.out.println("Vector calificaciones = "+ calificaciones.length);
        //System.out.println("Vector estaturas = "+ estaturas.length);
        //System.out.println("Vector delito = "+ delito.length);

        //Imprimir el vector edades
        //ImprimirVectoresEnteros(edades);
        //ImprimirVectoresEnteros(delito);
        //ImprimirVectoresEnteros(estaturas);
        //ImprimirVectoresDoubles(calificaciones);
        //double promediocurso =PromedioDeCurso(calificaciones);
        //System.out.println("El promedio del curso es:"+promediocurso);
        
        double [] Temperatura = new double[5];
        ImprimirVectoresDoubles(Temperatura);
        CargarValoresVectorDouble(Temperatura);
        ImprimirVectoresDoubles(Temperatura);
        System.out.println("Promedio temperatura: "+PromedioDeCurso(Temperatura));
    }
}
