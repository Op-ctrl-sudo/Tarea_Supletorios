package src;

public class Pregunta5 {

    private Double monto;
    private String TipoProducto;
    private int cantidad;
    public Pregunta5(Double monto, String tipoProducto, int cantidad) {
        this.monto = monto;
        TipoProducto = tipoProducto;
        this.cantidad = cantidad;
    }
    public Double getMonto() {
        return monto;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    public String getTipoProducto() {
        return TipoProducto;
    }
    public void setTipoProducto(String tipoProducto) {
        TipoProducto = tipoProducto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        String respuesta5 = this.TipoProducto+"\n"+
                            this.cantidad+"\n"+
                            this.monto;
        return respuesta5;
    }

}
