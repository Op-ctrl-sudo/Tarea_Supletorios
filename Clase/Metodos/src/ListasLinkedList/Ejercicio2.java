import java.util.LinkedList;

public class Ejercicio2 {

    private static void Imprimir(LinkedList<Automovil> ListaAutomoviles) {
        System.out.println("Imprimiendo automoviles");
        for (Automovil auto : ListaAutomoviles) {
            System.out.println(auto.getMarca()+"\t"+
                            auto.getModelo()+"\t"+
                            auto.getAño()+"\t"+
                            auto.getValor()
            );
        }
    }

    public static void main(String[] args) {
        LinkedList<Automovil> ListaAutomoviles = new LinkedList<>();
        Automovil auto1 = new Automovil("VW", "Gol", 2011, 8000);
        Automovil auto2 = new Automovil("Toyota", "Corola", 2020, 19000);


        ListaAutomoviles.add(auto1);
        ListaAutomoviles.add(auto2);

        //Agregar Objetos directamente
        ListaAutomoviles.add(new Automovil("Kia", "Cerato", 2015, 12500));
        ListaAutomoviles.add(new Automovil("Honda", "Civic", 2017, 21500));
        ListaAutomoviles.add(new Automovil("Honda", "Focus", 2025, 34000));
        ListaAutomoviles.add(new Automovil("Chevrolet", "Cruze", 2014, 16000));

        //Imprimiendo vehiculos
        Imprimir(ListaAutomoviles);
        /* 
        for (Automovil automovil : ListaAutomoviles) {
            System.out.println(automovil);
        }*/

        //Agregar un elemento al inicio
        ListaAutomoviles.addFirst(new Automovil("BMW", "M1", 2024, 45000));
        System.out.println("Agregado al inicio: "+ListaAutomoviles.getFirst().toString());

        //Agregar un elemento al final
        ListaAutomoviles.addLast(new Automovil("Mercedes", "M2", 2024, 57000));
        System.out.println("Agregado al final: "+ListaAutomoviles.getLast());

        //Imprimir(ListaAutomoviles);

        //Buscar autos de una marca especifica
        System.out.println("Buscar autos de una marca especifica");
        String _marcaBuscada="Toyota";
        for (Automovil automovil : ListaAutomoviles) {
            if (_marcaBuscada.toUpperCase().equals(automovil.getMarca().toUpperCase())) {
                System.out.println(automovil.getModelo()+"\t - $"+ automovil.getValor());
            }
        }
        double sumatoria = 0, promedio = 0; 
        int contador = 0;
        for (Automovil automovil : ListaAutomoviles) {
            if (automovil.getAño() > 2016) {
                sumatoria +=automovil.getValor();
                contador++;
            }
        }
        promedio = sumatoria/contador;
        System.out.println("El promedio = "+promedio);

        sumatoria = 0; 
        promedio = 0; 
        contador = 0;
        String _mar = "Honda";
        for (Automovil automovil : ListaAutomoviles) {
            if ((automovil.getAño() > 2016) && (_mar.toUpperCase().equals(automovil.getMarca().toUpperCase()))) {
                sumatoria +=automovil.getValor();
                contador++;
            }
        }
        promedio = sumatoria/contador;
        System.out.println("El promedio = "+promedio);
     
    }
}
