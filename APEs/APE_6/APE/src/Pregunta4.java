package src;

public class Pregunta4 {

    private int peso;
    private String trimestre;
    public Pregunta4(int peso, String trimestre) {
        this.peso = peso;
        this.trimestre = trimestre;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String getTrimestre() {
        return trimestre;
    }
    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }
    @Override
    public String toString() {
        String respuesta = this.trimestre+"\n"+
                           this.peso;
        return respuesta;
    }

}
