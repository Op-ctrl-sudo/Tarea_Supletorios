public class Pregunta1 {
    private String provincia;
    private double total;
    
    public Pregunta1(String provincia, double total) {
        this.provincia = provincia;
        this.total = total;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        String resultado = "Provincia = "+provincia+"\t"+"Total = "+total;
        return resultado;
    }
    
}
