
/*
 * for (_Producto producto : listaProducto) {
        String nombre = producto.getProducto();
        double precio = producto.getPrecio();
        int cantidad = producto.getStock(); // Asumimos que esto es la cantidad
        double subtotal = precio * cantidad;
        modelo.addRow(new Object[]{nombre, precio, cantidad, subtotal});
    }
 */
package Proyecto;

public class _Producto {

    private String producto;
    private double precio;
    private int stock;
    public _Producto(String producto, double precio, int stock) {
        this.producto = producto;
        this.precio = precio;
        this.stock = stock;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        String respuesta = this.producto+"\n"+
                           this.precio+"\n"+
                           this.stock;
        return respuesta;
    }
    public String ConvertirFormatoCsv() {
        String cadena = producto+";"+precio+";"+stock;
        return cadena;
    }

}
