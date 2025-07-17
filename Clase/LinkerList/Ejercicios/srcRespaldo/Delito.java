public class Delito {
 private String provincia;
 private String delito;
 private boolean judicializado;
 private String victima;

    public Delito(String provincia, String delito, boolean judicializado, String victima) {
        this.delito = delito;
        this.judicializado = judicializado;
        this.provincia = provincia;
        this.victima = victima;
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

    public boolean isjudicializado() {
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

    @Override
    public String toString() {
        String resultado = this.provincia+"\t"+
                           this.delito+"\t"+
                           this.judicializado+"\t"+
                           this.victima;
        return resultado;
    }

    public String ConvertirFormatoCsv(){
        String cadena= provincia+";"+delito+";"+judicializado+";"+victima;
        return  cadena;
    }

}
