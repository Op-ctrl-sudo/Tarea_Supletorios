public class Cliente {

    //Aplicar el principio de encapsulamiento
    private String nombre;
    private String cedula;
    private int edad;
    private String CuentaBancaria;
    private double Saldo;

    public Cliente(String _nombre, String _cedula, int _edad){
        this.nombre = _nombre;
        this.cedula = _cedula;
        this.edad = _edad;
    }

    public Cliente(String nombre, String cedula, int edad, String cuentaBancaria, double saldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        CuentaBancaria = cuentaBancaria;
        Saldo = saldo;
    }

    //Generar un getter nombre
    public String getNombre(){
        return nombre;
    }

    //Generar un setter Nombre
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }

    //Generar un getter cedula
    public String getCedula(){
        return cedula;
    }

    //Generar setter cedula
    public void setCedula(String _cedula){
        if (_cedula.length()==4) {
            if (_cedula.substring(0, 2)=="18") {
                this.cedula = _cedula;   
            }
            else{
                System.out.println("La cedula no pertenece a Tungurahua");
            }   
        }
        else{
            System.out.println("La longitud de la cedula es incorrecta");
        }
    }

    //Generar un getter edad
    public int getEdad(){
        return edad;
    }

    //Generar un setter edad
    public void setEdad(int _edad){
        this.edad = _edad;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.CuentaBancaria = cuentaBancaria;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    public void imprimirDatosCliente(){
        System.out.println(
            "-----Datso Cliente-----"+"\n"+
            "Cliente: "+this.nombre+"\n"+
            "Cedula: "+this.cedula+"\n"+
            "Edad: "+this.edad+"\n"+
            "N° Cuenta: "+this.CuentaBancaria+"\n"+
            "Saldo: "+this.Saldo+"\n"+
            "------------------------"
        );
    }

}
