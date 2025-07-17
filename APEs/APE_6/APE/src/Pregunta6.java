package src;

public class Pregunta6 {

    private double montos;
    private String anio;
    public Pregunta6(double montos, String anio) {
        this.montos = montos;
        this.anio = anio;
    }
    public double getMontos() {
        return montos;
    }
    public void setMontos(double montos) {
        this.montos = montos;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    @Override
    public String toString() {
        String respuesta = this.anio+"\n"+this.montos; 
        return respuesta;
    }

}
