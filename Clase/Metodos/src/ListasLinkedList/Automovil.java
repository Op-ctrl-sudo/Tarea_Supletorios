public class Automovil {

    private String marca="";
    private String modelo="";
    private int año=0;
    private double valor=0;

    

    public Automovil(String marca, String modelo, int año, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String resultado = "Marca: "+this.marca + "\t"+ 
                           "Modelo: "+this.modelo + "\t"+
                           "Año: "+this.año + "\t"+
                           "Valor: "+this.valor;
        return resultado;
    }

}
