package src;

public class Pregunta3 {

    private String pais;
    private double monto;
    public Pregunta3(String pais, double monto) {
        this.pais = pais;
        this.monto = monto;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    @Override
    public String toString() {
        String respuesta3 = this.pais+"\n"+this.monto;
        return respuesta3;
    }

}
