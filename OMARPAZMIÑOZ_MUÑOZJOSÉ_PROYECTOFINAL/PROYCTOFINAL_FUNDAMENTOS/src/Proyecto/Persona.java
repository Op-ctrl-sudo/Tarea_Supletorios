package Proyecto;

public class Persona {

    private String documentos;
    private String nombre;
    private String apellido;
    private String areaTrabajo;
    private String telefono;
    private String correo;
    private String cargo;
    private javax.swing.JTable tablaPersonas;
private javax.swing.JScrollPane scrollPersonas;
    public Persona(String documentos, String nombre, String apellido, String areaTrabajo, String telefono,
            String correo, String cargo) {
        this.documentos = documentos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.areaTrabajo = areaTrabajo;
        this.telefono = telefono;
        this.correo = correo;
        this.cargo = cargo;
    }
    public String getDocumentos() {
        return documentos;
    }
    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getAreaTrabajo() {
        return areaTrabajo;
    }
    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String toString() {
        String resultado = this.documentos+"\t"+
                           this.nombre+"\t"+
                           this.apellido+"\t"+
                           this.areaTrabajo+"\t"+
                           this.telefono+"\t"+
                           this.correo+"\t"+
                           this.cargo;
        return resultado;
    }
    public String ConvertirFormatoCsv() {
        String cadena = documentos+";"+nombre+";"+apellido+";"+areaTrabajo+";"+telefono+";"+correo+";"+cargo;
        return cadena;
    }
}
