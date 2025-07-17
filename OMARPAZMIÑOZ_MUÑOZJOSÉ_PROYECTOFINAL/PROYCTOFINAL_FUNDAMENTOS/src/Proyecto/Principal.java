package Proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JTextArea;

public class Principal {

    public static LinkedList<Persona> CargarDatosPersonaDesdeArchivoTexto(String _ruta) {
        LinkedList<Persona> lista = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(_ruta))) {
            String linea;
            boolean primeralinea = true;
            
            while ((linea = reader.readLine())!=null) {
                if (primeralinea == true) {
                    primeralinea = false;
                    continue;
                }

                String partes[] = linea.split(";");
                if (partes.length==7) {
                    String documento = partes[0];
                    String nombre = partes[1];
                    String apellido = partes[2];
                    String areaTrabajo = partes[3];
                    String telefono = partes[4];
                    String correo = partes[5];
                    String cargo = partes[6];

                    Persona _persona = new Persona(documento, nombre, apellido, areaTrabajo, telefono, correo, cargo);
                    lista.add(_persona);
                }
            }          
        } 
        catch (IOException ex) {
            System.out.println("Hubo un error al momento de cargar el archivo: "+"\n"+ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Hubo un error en el proceso: "+"\n"+ex.getMessage());
        }
        return lista;
    }

    public static void ImprimirListaPersona(LinkedList<Persona> lista){
        System.out.println("-----Imprimiendo Lista Persona-----");
        for (Persona persona : lista) {
            System.out.println(persona.toString());
        }
    }

    public static void AgregarPersonaEnArchivoTexto(String _ruta){
        Scanner teclado = new Scanner(System.in);
        String nuevoDocumento,nuevoApellido,nuevoNombre,nuevoArea,nuevoTelefono,nuevoCorreo,nuevoCargo;
        nuevoDocumento = teclado.next();
        nuevoNombre = teclado.next();
        nuevoApellido = teclado.next();
        nuevoArea = teclado.next();
        nuevoTelefono = teclado.next();
        nuevoCorreo = teclado.next();
        nuevoCargo = teclado.next();
        Persona nuevaPersona = new Persona(nuevoDocumento, nuevoNombre, nuevoApellido, nuevoArea, nuevoTelefono, nuevoCorreo, nuevoCargo);
        try (FileWriter fw = new FileWriter(_ruta,true)){
            fw.write("\n"+nuevaPersona.ConvertirFormatoCsv());
        } catch (IOException ex) {
            System.out.println("Hubo un error al momento de escribir el archivo:"+"\n"+ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("Hubo un erro en el proceso: "+"\n"+ex.getMessage());
        }
    } 

    public static LinkedList<_Producto> CargarDatos_ProductoDesdeArchivoTexto(String _ruta) {
        LinkedList<_Producto> listaProducto = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(_ruta))) {
            String lineaProducto;
            boolean primeralineaProducto = true;
            
            while ((lineaProducto = reader.readLine())!=null) {
                if (primeralineaProducto == true) {
                    primeralineaProducto = false;
                    continue;
                }

                String partesProducto[] = lineaProducto.split(";");
                if (partesProducto.length==3) {
                    String producto = partesProducto[0]; 
                    double precio = Double.parseDouble(partesProducto[1]);
                    int stock = Integer.parseInt(partesProducto[2]);
                    _Producto _producto = new _Producto(producto, precio, stock);
                    listaProducto.add(_producto);
                }
            }          
        } 
        catch (IOException ex) {
            System.out.println("Hubo un error al momento de cargar el archivo: "+"\n"+ex.getMessage());
        }
        catch (Exception ex){
            System.out.println("Hubo un error en el proceso: "+"\n"+ex.getMessage());
        }
        return listaProducto;
    }

    private static void ImprimirLista_Productp(LinkedList<_Producto> listaProductos){
        System.out.println("-----Imprimiendo Lista Persona-----");
        for (_Producto _producto : listaProductos) {
            System.out.println(_producto.toString());
        }
    }

    public static void Agregar_ProductoEnArchivoTexto(String _ruta){
        Scanner teclado = new Scanner(System.in);
        String nuevoProducto;
        double nuevoPrecio;
        int nuevoStock;
        nuevoProducto = teclado.next();
        nuevoPrecio = teclado.nextDouble();
        nuevoStock = teclado.nextInt();
        _Producto nueva_Producto = new _Producto(nuevoProducto, nuevoPrecio, nuevoStock);
        try (FileWriter fw = new FileWriter(_ruta,true)){
            fw.write("\n"+nueva_Producto.ConvertirFormatoCsv());
        } catch (IOException ex) {
            System.out.println("Hubo un error al momento de escribir el archivo:"+"\n"+ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("Hubo un erro en el proceso: "+"\n"+ex.getMessage());
        }
    } 

    public static void main(String[] args) {
    }
}
