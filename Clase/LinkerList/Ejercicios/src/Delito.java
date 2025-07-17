public class Delito {
 private String provincia;
 private String delito;
 private boolean judicializado;
 private String victima;
 private double monto;
 private int anio;

    public Delito(String provincia, String delito, boolean judicializado, String victima, double monto, int anio) {
        this.delito = delito;
        this.judicializado = judicializado;
        this.provincia = provincia;
        this.victima = victima;
        this.monto = monto;
        this.anio = anio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public boolean getjudicializado() {
        return judicializado;
    }

    public void setjudicializado(boolean judicializado) {
        this.judicializado = judicializado;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        String resultado = this.provincia+"\t"+
                           this.delito+"\t"+
                           this.judicializado+"\t"+
                           this.victima+"\t"+
                           this.monto+"\t"+
                           this.anio;
        return resultado;
    }

    public String ConvertirFormatoCsv(){
        String cadena= provincia+";"+delito+";"+judicializado+
                       ";"+victima+";"+monto+";"+anio;
        return  cadena;
    }

}
