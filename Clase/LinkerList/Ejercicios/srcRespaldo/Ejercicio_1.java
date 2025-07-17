import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

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
                if (partes.length==4) {
                    String provincia = partes[0];
                    String delito = partes[1];
                    boolean judicializado = Boolean.parseBoolean(partes[2]);
                    String victima = partes[3];
    
                    Delito _delito = new Delito(provincia, delito, judicializado, victima);
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

    private static void AgregarDelitoEnArchivoTexto(String ruta) {
        //Agregar Delito al archivo
        Delito nuevoDelito = new Delito("Loja", "Peculado", true, "EEL");
        try (FileWriter fw = new FileWriter(ruta,true)){
            fw.write("\n"+nuevoDelito.ConvertirFormatoCsv());
        } catch (IOException ex) {
            System.out.print("Hubo un error al momento de escribir el archivo:"+"\n"+ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("Hubo un eror en el proceso: "+"\n"+ex.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        LinkedList<Delito> lista;
        System.out.println("-----Manejo de datos-----");
        String ruta = "LinkerList/Ejercicios/srcRespaldo/DelitosProvincia.csv";
        //Cargar Datos
        lista=CargarListaDelitoDesdeArchivoTexto(ruta);
        ImprimirListaDelito(lista);

        AgregarDelitoEnArchivoTexto(ruta);
        ImprimirListaDelito(lista);
    }
}
