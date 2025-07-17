public class CramerConMatrices {

    // Método para calcular determinante de una matriz 2x2
    public static int determinante2x2(int[][] matriz) {
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }

    public static void main(String[] args) {
        // MATRIZ DE COEFICIENTES
        // Representa el sistema:
        // a1*x + b1*y = c1
        // a2*x + b2*y = c2
        int[][] M = {
            {7, 4},
            {5, -2}
        };

        // VECTOR DE TÉRMINOS INDEPENDIENTES
        int[] C = {13, 19};

        // MATRIZ Mx: reemplaza la 1ª columna de M con el vector C
        int[][] Mx = {
            {C[0], M[0][1]},
            {C[1], M[1][1]}
        };

        // MATRIZ My: reemplaza la 2ª columna de M con el vector C
        int[][] My = {
            {M[0][0], C[0]},
            {M[1][0], C[1]}
        };

        // Cálculo de determinantes
        int detM  = determinante2x2(M);
        int detMx = determinante2x2(Mx);
        int detMy = determinante2x2(My);

        // Mostrar las matrices (opcional)
        System.out.println("Matriz M (coeficientes):");
        mostrarMatriz(M);
        System.out.println("Matriz Mx:");
        mostrarMatriz(Mx);
        System.out.println("Matriz My:");
        mostrarMatriz(My);

        // Verificar si el sistema tiene solución única
        if (detM != 0) {
            double x = (double) detMx / detM;
            double y = (double) detMy / detM;

            System.out.printf("Solución del sistema:\n");
            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
        } else {
            System.out.println("El sistema no tiene solución única (determinante = 0).");
        }
    }

    // Método para mostrar una matriz 2x2
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            System.out.printf("| %4d %4d |\n", matriz[i][0], matriz[i][1]);
        }
        System.out.println();
    }
}


