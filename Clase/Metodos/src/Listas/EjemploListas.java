import java.util.ArrayList;
import java.util.List;

public class EjemploListas {

    public static void main(String[] args) {
        //Crear
        List<String> listaNombres = new ArrayList<>();
        List<Integer> listaNumeros = new ArrayList<>();

        //Agregamos elementos Lista
        listaNombres.add("Juan");
        listaNombres.add("Ana");
        listaNombres.add("Andrea");

        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(1,30);
        listaNumeros.add(0,40);
        listaNumeros.add(50);
        listaNumeros.add(2,60);

        //Imprimir
        System.out.println(listaNombres);
        System.out.println(listaNumeros);

        //ForEach
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }

        System.out.println("-----Multiplo de 8-----");
        int contador = 0;
        for (Integer numero : listaNumeros) {
            if (numero%8==0) {
                System.out.println("Multiplo = "+numero);
                contador++;   
            }
        }
        System.out.println("Se encontraron = "+contador+" numero divisibles para 8");

        System.out.println("-----Buscando a Ana-----");
        int posicion = 0;
        for (String nombre : listaNombres) {
            if (nombre=="Ana") {
                System.out.println("Ana si existe");
            }
            else{
                posicion++;
            }
        }
        System.out.println("En la posicion_"+posicion);


        //--------------------------------------------------------------------------
        //2 Grupos
        //Promedio todo curso
        //Promedio de los alumnos menos de 7 y cuantos son

        List<Double> NotasGrupo1 = new ArrayList<>();
        List<Double> NotasGrupo2 = new ArrayList<>();
        List<Double> NotasTotales = new ArrayList<>();

        NotasGrupo1.add(10.0);
        NotasGrupo1.add(9.0);
        NotasGrupo1.add(4.0);
        NotasGrupo1.add(3.0);

        NotasGrupo2.add(8.5);
        NotasGrupo2.add(7.4);
        NotasGrupo2.add(2.3);
        NotasGrupo2.add(5.5);

        NotasTotales.addAll(NotasGrupo1);
        NotasTotales.addAll(NotasGrupo2);

        double sumatoria = 0;
        double promedio = 0;
        for (Double nota : NotasTotales) {
            sumatoria+=nota;
        }
        promedio=sumatoria/NotasTotales.size();
        System.out.println("El promedio total del curso = "+Math.round(promedio*100)/100d);

        sumatoria=0;
        promedio=0;
        int contado=0;
        for (Double nota : NotasTotales) {
            if (nota<7) {
                sumatoria+=nota;
                contado++;
            }
        }
        promedio=sumatoria/contado;
        System.out.println("Promedio = "+promedio+" Numero de estudiantes = "+contado);

    }

}
