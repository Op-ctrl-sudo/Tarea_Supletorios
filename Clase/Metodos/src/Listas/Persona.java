import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String Nombre;
    private String Genero;
    private int Edad;
    public Persona(String _nombre, String _genero, int _edad) {
        this.Nombre = _nombre;
        this.Genero = _genero;
        this.Edad = _edad;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getGenero() {
        return Genero;
    }
    public int getEdad() {
        return Edad;
    }
    
    

}
