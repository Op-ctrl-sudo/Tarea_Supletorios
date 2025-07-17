package src;

public class Producto {
    private int id;
    private String mes;
    private String anio;
    private String pais;
    private String tipoProducto;
    private int pesoToneladas;
    private double monto;
    public Producto(int id, String mes, String anio, String pais, String tipoProducto, int pesoToneladas, double monto) {
        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.pais = pais;
        this.tipoProducto = tipoProducto;
        this.pesoToneladas = pesoToneladas;
        this.monto = monto;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getTipoProducto() {
        return tipoProducto;
    }
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    public int getPesoToneladas() {
        return pesoToneladas;
    }
    public void setPesoToneladas(int pesoToneladas) {
        this.pesoToneladas = pesoToneladas;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    @Override
    public String toString() {
        String resultado = this.id+"\t"+
                           this.mes+"\t"+
                           this.anio+"\t"+
                           this.pais+"\t"+
                           this.tipoProducto+"\t"+
                           this.pesoToneladas+"\t"+
                           this.monto;
        return resultado;
    }
    public String ConvertirFormatoCsv() {
        String cadena = id+","+mes+","+anio+","+pais+","+tipoProducto+","+pesoToneladas+","+monto;
        return cadena;
    }

    

}
