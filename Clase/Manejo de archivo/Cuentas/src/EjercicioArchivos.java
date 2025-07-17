import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;
import java.util.LinkedList;

public class EjercicioArchivos {

    private static LinkedList<App> CargarArchivo(String ruta){
        LinkedList<App> _lista = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))){
            String linea;
            boolean primeraLinea = true;
            while ((linea = reader.readLine())!=null) {
                if (primeraLinea == true) {
                    primeraLinea = false;
                    continue;
                }
                String partes[] = linea.split(";");
                if (partes.length == 7) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    String apellido = partes[2];
                    String ciudad = partes[3];
                    String genero = partes[4];
                    double ingresos = Double.parseDouble(partes[5]);
                    double egresos = Double.parseDouble(partes[6]);
                    App cuenta = new App(id, nombre, apellido, ciudad, genero, ingresos, egresos);
                    _lista.add(cuenta);
                }
            }
        } catch (IOException ex) {
            System.out.println("Hubo un error al cargar el archivo: "+ex.getMessage());
        }
        return _lista;
    }

    private static void ImprimirLista(LinkedList<App> lista){
        for (App Cuentas : lista) {
            System.out.println(Cuentas.toString());
        }
    }

    private static void PreguntaIngresoEgreso(LinkedList<App> lista){
        double sumatoriaIngreso = 0, sumatoriaEgresos = 0;
        for (App cuenta : lista) {
            sumatoriaIngreso += cuenta.getIngresos();
            sumatoriaEgresos += cuenta.getEgresos();
        }
        System.out.println("El total de ingresos es: "+sumatoriaIngreso);
        System.out.println("El total de egresos es: "+sumatoriaEgresos);
    }

    private static void PreguntaIngresoEgresoCosta(LinkedList<App> lista){
        double sumatoriaIngresoCosta = 0, sumatoriaEgresosCosta = 0;
        for (App cuenta : lista) {
            if ((cuenta.getCiudad().equals("Guayaquil")) ||
               (cuenta.getCiudad().equals("Portoviejo"))) {
                sumatoriaIngresoCosta += cuenta.getIngresos();
                sumatoriaEgresosCosta += cuenta.getEgresos();
            }
        }
        System.out.println("El total de ingresos en la costa es: "+sumatoriaIngresoCosta);
        System.out.println("El total de egresos en la costa es: "+sumatoriaEgresosCosta);
    }

    private static void DevolverIngresosEgresosPorCiudad(LinkedList<App> lista){
        double IngresoGuayaquil = 0, EgresosGuayaquil = 0,
               IngresoPortoviejo = 0, EgresoPortoviejo = 0;
        for (App cuenta : lista) {
            if (cuenta.getCiudad().equals("Guayaquil")) {
                IngresoGuayaquil += cuenta.getIngresos();
                EgresosGuayaquil += cuenta.getEgresos();
            }
            if (cuenta.getCiudad().equals("Portoviejo")) {
                IngresoPortoviejo += cuenta.getIngresos();
                EgresoPortoviejo += cuenta.getEgresos();
            }
        }
        LinkedList<Pregunta3> listaPregunta3 = new LinkedList<>();
        listaPregunta3.add(new Pregunta3("Guayaquil", IngresoGuayaquil, EgresosGuayaquil));
        listaPregunta3.add(new Pregunta3("Portoviejo", IngresoPortoviejo, EgresoPortoviejo));
        for (Pregunta3 pregunta : listaPregunta3) {
            System.out.println(pregunta.toString());
        }
    }

    public static void main(String[] args) {
        LinkedList<App> lista = new LinkedList<>();
        String ruta = "Cuentas/src/IngresosEgresos.csv";
        lista = CargarArchivo(ruta);
        //ImprimirLista(lista);
        
        //Pregunta 1 total ingreso y egresos
        //PreguntaIngresoEgreso(lista);

        //Pregunta 2 total ingresos y egresos de la costa
        //PreguntaIngresoEgresoCosta(lista);

        //Pregunta 3 total ingresos y egresos de la costa por ciudad
        DevolverIngresosEgresosPorCiudad(lista);
    }
}
