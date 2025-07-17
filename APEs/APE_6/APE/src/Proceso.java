package src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Scanner;

import javax.sound.sampled.LineListener;

public class Proceso {
    private static LinkedList<Producto> CargarDatosDesdetxt(String _ruta) {
        LinkedList<Producto> lista = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(_ruta))) {
            String linea;
            boolean primeraLinea = true;

            while ((linea=reader.readLine())!=null) {
                if (primeraLinea==true) {
                    primeraLinea=false;
                    continue;
                }

                String partes[] = linea.split(",");
                if (partes.length==7) {
                 int id = Integer.parseInt(partes[0]);
                 String mes = partes[1];
                 String anio = partes[2];
                 String pais = partes[3];
                 String tipoProducto = partes[4];
                 int pesoToneladas = Integer.parseInt(partes[5]);
                 Double monto = Double.parseDouble(partes[6]); 
                
                 Producto _producto = new Producto(id, mes, anio, pais, tipoProducto, pesoToneladas, monto);
                 lista.add(_producto);
                }

            }
        } catch (IOException ex) {
            System.out.println("Hubo un error al cargar el archivo: "+"\n"+ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Hubo un eror en el proceso: "+"\n"+ex.getMessage());
        }
        return lista;
    }

    public static void ImprimirDatos(LinkedList<Producto> lista){
        System.out.println("-----Imprimiendo datos-----");
        for (Producto producto : lista) {
                    System.out.println(producto.toString());
        }
    }

    public static void EscribirDatosEnArchivo(String _ruta){
        System.out.println("-----Escribir datos en el archivo-----");
        Scanner teclado = new Scanner(System.in);
        int nuevoId;
        String nuevoMes;
        String nuevoAnio;
        String nuevoPais;
        String nuevoTipoProducto;
        int nuevoPesoToneladas;
        Double nuevoMonto;

        System.out.println("Ingrese el nuevo id");
        nuevoId = teclado.nextInt();
        System.out.println("Ingrese el nuevo mes");
        nuevoMes = teclado.next();
        System.out.println("Ingrese el nuevo anio");
        nuevoAnio = teclado.next();
        System.out.println("Ingrese el nuevo pais");
        nuevoPais = teclado.next();
        System.out.println("Ingrese el nuevo tipo de producto");
        nuevoTipoProducto = teclado.next();
        System.out.println("Ingrese el nuevo peso en toneladas");
        nuevoPesoToneladas = teclado.nextInt();
        System.out.println("Ingrese el nuevo monto");
        nuevoMonto = teclado.nextDouble();

        Producto nuevoProducto = new Producto(nuevoId, nuevoMes, nuevoAnio, nuevoPais, nuevoTipoProducto, nuevoPesoToneladas, nuevoMonto);
        try (FileWriter fw = new FileWriter(_ruta,true)) {
            fw.write("\n"+nuevoProducto.ConvertirFormatoCsv());
        } catch (IOException ex) {
            System.out.println("Hubo un error al momento de escribir el archivo: "+"\n"+ex.getMessage());
        } catch (Exception ex){
            System.out.println("Hubo un error en el proceso:"+"\n"+ex.getMessage());
        }

    }

    public static void ResolverPregunta3(LinkedList<Producto> lista){
        System.out.println("-----Resolviendo Pregunta 3-----");
        double sumatoriaMontoCentroAmerica = 0;
        for (Producto producto : lista) {
            //Nicaragua, Costa Rica, Guatemala, El Salvador, Honduras
            if (producto.getPais().equals("Nicaragua") || producto.getPais().equals("Costa Rica") || producto.getPais().equals("Panama") || producto.getPais().equals("Guatemala") || producto.getPais().equals("El Salvador") || producto.getPais().equals("Honduras")) {
             sumatoriaMontoCentroAmerica += producto.getMonto();   
            }
        }
        sumatoriaMontoCentroAmerica = Math.round(sumatoriaMontoCentroAmerica*10000)/10000d;
        LinkedList<Pregunta3> listaP3 = new LinkedList<>();
        listaP3.add(new Pregunta3("Centroamerica", sumatoriaMontoCentroAmerica));
        for (Pregunta3 pregunta3 : listaP3) {
            System.out.println(pregunta3.toString());
        }
    }

    public static void ResolverPregunta4(LinkedList<Producto> lista){
        int sumatoriaTrimestre1 = 0,sumatoriaTrimestre2 = 0,sumatoriaTrimestre3 = 0,sumatoriaTrimestre4 = 0;
        for (Producto producto : lista) {
            if (producto.getAnio().equals("2022") || producto.getAnio().equals("2023") || producto.getAnio().equals("2024")) {
                if (producto.getMes().equals("Enero") || producto.getMes().equals("Febrero") || producto.getMes().equals("Marzo")) {
                    sumatoriaTrimestre1+=producto.getPesoToneladas();
                }
                if (producto.getMes().equals("Abril") || producto.getMes().equals("Mayo") || producto.getMes().equals("Junio")) {
                    sumatoriaTrimestre2+=producto.getPesoToneladas();
                }
                if (producto.getMes().equals("Julio") || producto.getMes().equals("Agosto") || producto.getMes().equals("Septiembre")) {
                    sumatoriaTrimestre3+=producto.getPesoToneladas();
                }
                if (producto.getMes().equals("Octubre") || producto.getMes().equals("Noviembre") || producto.getMes().equals("Diciembre")) {
                    sumatoriaTrimestre4+=producto.getPesoToneladas();
                }
            }
        }
        LinkedList<Pregunta4> listaPregunta4 = new LinkedList<>();
        listaPregunta4.add(new Pregunta4(sumatoriaTrimestre1, "Primer Trimestre"));
        listaPregunta4.add(new Pregunta4(sumatoriaTrimestre2, "Segundo Trimestre"));
        listaPregunta4.add(new Pregunta4(sumatoriaTrimestre3, "Tercer Trimestre"));
        listaPregunta4.add(new Pregunta4(sumatoriaTrimestre4, "Cuarto Trimestre"));
        System.out.println("La sumatoria de los trimestre de los años 2022,2023,2024");
        for (Pregunta4 pregunta4 : listaPregunta4) {
            System.out.println(pregunta4.toString());
        }
    }

    public static void ResolverPregunta5(LinkedList<Producto> lista){
        System.out.println("-----Resolviendo Pregunta 5-----");
        Scanner teclado = new Scanner(System.in);
        double montoProducto=0;
        int cantidad=0;
        String Tipoproducto;
        System.out.println("Ingrese el tipo de producto que quiere visualizar");
        Tipoproducto = teclado.nextLine();
        for (Producto producto : lista) {
            if (Tipoproducto.equals(producto.getTipoProducto())) {
             montoProducto += producto.getMonto();
             cantidad += producto.getPesoToneladas();                
            }
        }
        montoProducto = Math.round(montoProducto*10000)/10000d;
        LinkedList<Pregunta5> listaP5 = new LinkedList<>();
        listaP5.add(new Pregunta5(montoProducto, Tipoproducto, cantidad));
        for (Pregunta5 pregunta5 : listaP5) {
            System.out.println(pregunta5.toString());
        }

    }

    public static void ResolverPregunta6(LinkedList<Producto> lista){
        System.out.println("-----Resolviendo la pregunta 6-----");
        Scanner teclado = new Scanner(System.in);
        Double sumatoriaMonto = 0.0, porcetanjeMontos = 0.0;
        String anio;
        System.out.println("Ingrese el año que quiera visualizar");
        anio = teclado.nextLine();
        for (Producto producto : lista) {
            sumatoriaMonto+=producto.getMonto();
        }

        for (Producto producto : lista) {
            if (anio.equals(producto.getAnio())) {
             porcetanjeMontos+=(producto.getMonto()*100)/sumatoriaMonto;   
            }
        }
        porcetanjeMontos = Math.round(porcetanjeMontos*1)/1d;
        LinkedList<Pregunta6> listaPregunta6 = new LinkedList<>();
        listaPregunta6.add(new Pregunta6(porcetanjeMontos, anio));
        for (Pregunta6 pregunta6 : listaPregunta6) {
            System.out.println(pregunta6.toString()+"%");
        }
    }

    public static void main(String[] args) {
        String ruta = "APE_6/APE/src/ProductosExportacion (3).csv";
        LinkedList<Producto> lista;
        lista = CargarDatosDesdetxt(ruta);
        EscribirDatosEnArchivo(ruta);
        ImprimirDatos(lista);
        ResolverPregunta3(lista);
        ResolverPregunta4(lista);
        ResolverPregunta5(lista);
        ResolverPregunta6(lista);
    }
}