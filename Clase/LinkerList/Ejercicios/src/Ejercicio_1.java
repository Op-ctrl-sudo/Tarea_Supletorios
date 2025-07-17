import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

//Cual es el perjuicio economico que hemos tenido por provincia solo de la costa

public class Ejercicio_1 {

    public static  LinkedList<Delito> CargarListaDelitoDesdeArchivoTexto(String _ruta){
        //Declaro la lista
        LinkedList<Delito> lista = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(_ruta))){
            String linea;
            boolean primeralinea=true;
    
            while ((linea = reader.readLine())!=null) {
                if (primeralinea==true) {
                    primeralinea=false;
                    continue;
                }
                String []partes = linea.split(";");
                if (partes.length==6) {
                    String provincia = partes[0];
                    String delito = partes[1];
                    boolean judicializado = Boolean.parseBoolean(partes[2]);
                    String victima = partes[3];
                    double monto = Double.parseDouble(partes[4]);
                    int año = Integer.parseInt(partes[5]);
                    
                    Delito _delito = new Delito(provincia, delito, judicializado, victima, monto, año);
                    lista.add(_delito);
                }
            }
        }
        catch(IOException ex) {
                System.out.println("Hubo un error al momento de cargar el archivo:"+"\n"+ex.getMessage());
        }
        catch(Exception ex){
                System.out.println("Hubo un eror en el proceso: "+"\n"+ex.getMessage());
        }

        return lista;
    }

    private static void ImprimirListaDelito(LinkedList<Delito> lista) {
        System.out.println("-----Imprimiendo Lista Delitos-----");
        for (Delito delito : lista) {
            System.out.println(delito.toString());
        }
    }

    private static void AgregarDelitoEnArchivoTexto(String ruta, Delito nuevoDelito) {
        //Agregar Delito al archivo
        try (FileWriter fw = new FileWriter(ruta,true)){
            fw.write("\n"+nuevoDelito.ConvertirFormatoCsv());
        } catch (IOException ex) {
            System.out.print("Hubo un error al momento de escribir el archivo:"+"\n"+ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("Hubo un eror en el proceso: "+"\n"+ex.getMessage());
        }
    }

    private static void ResolverPregunta1(LinkedList<Delito> _lista){
        double sumatoriaEsmeraldas = 0, sumatoriaGuayas=0;
        for (Delito delito : _lista) {
            //Guayas
            if (delito.getProvincia().equals("Guayas")) {
                sumatoriaGuayas += delito.getMonto();
            }
            //Esmeraldas
            if (delito.getProvincia().equals("Esmeraldas")) {
                sumatoriaEsmeraldas += delito.getMonto();
            }
        }

        LinkedList<Pregunta1> listaP1 = new LinkedList<>();
        listaP1.add(new Pregunta1("Guayas", sumatoriaGuayas));
        listaP1.add(new Pregunta1("Esmeraldas", sumatoriaEsmeraldas));

        for (Pregunta1 pregunta1 : listaP1) {
            System.out.println(pregunta1.toString());
        }

    }

    public static void main(String[] args) throws Exception {
        LinkedList<Delito> lista;
        System.out.println("-----Manejo de datos-----");
        String ruta = "LinkerList/Ejercicios/src/DelitosProvincia.csv";
        //Cargar Datos
        lista=CargarListaDelitoDesdeArchivoTexto(ruta);
        //ImprimirListaDelito(lista);
        //Agregar Delito al archivo
        //Delito nuevoDelito = new Delito("Esmeraldas", "Robo", true, "UTA", 3000, 2024);
        //AgregarDelitoEnArchivoTexto(ruta,nuevoDelito);
        //ImprimirListaDelito(lista);

        //Pregunta1
        ResolverPregunta1(lista);
    }
}
