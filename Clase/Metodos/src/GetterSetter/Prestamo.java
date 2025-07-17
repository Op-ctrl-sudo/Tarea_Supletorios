public class Prestamo {

    private int monto;
    private int plazo;
    private String banco;
    private String cedula;

    public Prestamo(int _monto, int _plazo, String _banco, String _cedula){
        this.monto = _monto;
        this.plazo = _plazo;
        this.banco = _banco;
        this.cedula = _cedula;
    }

    public int getMonto(){
        return monto;
    }

    public void setMonto(int _monto){
        this.monto = _monto;
    }

    public int getPlazo(){
        return plazo;
    }

    public void setPlazo(int _plazo){
        this.plazo = _plazo;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String _cedula){
        this.cedula = _cedula;
    }

    public String getBanco(){
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

}
