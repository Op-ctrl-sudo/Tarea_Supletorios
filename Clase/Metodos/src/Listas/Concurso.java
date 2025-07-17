import java.util.ArrayList;
import java.util.List;

public class Concurso {

    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();

        Persona persona_1 = new Persona("Ana","F",20);
        Persona persona_2 = new Persona("Andrea","F",22);
        Persona persona_3 = new Persona("Luisa","F",23);
         
        listaPersonas.add(persona_1);
        listaPersonas.add(persona_2);
        listaPersonas.add(persona_3);

        /*
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre());
        }
        */

        for (Persona persona : listaPersonas) {
            if (persona.getEdad()>21) {
                System.out.println(persona.getNombre());   
            }
        }
         
    }

}
