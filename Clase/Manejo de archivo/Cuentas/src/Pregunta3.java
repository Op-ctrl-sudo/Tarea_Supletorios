public class Pregunta3 {
    private String ciudad;
    private double ingresos;
    private double egresos;
    public Pregunta3(String ciudad, double ingresos, double egresos) {
        this.ciudad = ciudad;
        this.ingresos = ingresos;
        this.egresos = egresos;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public double getIngresos() {
        return ingresos;
    }
    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    public double getEgresos() {
        return egresos;
    }
    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }
    @Override
    public String toString() {
        String respuesta = "Ciudad: "+this.ciudad+"\t"+
                           "Ingresos: "+this.ingresos+"\t"+
                           "Egresos: "+this.egresos;
        return respuesta;
    }
    
}
