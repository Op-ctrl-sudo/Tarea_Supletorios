import java.util.Scanner;

public class Estudiante {
    
    public String nombre;
    public String cedula;
    public String facultad;
    public String carrera;
    public int creditos;

    public void ImprimirDatosEstudiantes() {
        System.out.println("-----Datos Estudiantes-----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);
        System.out.println("Facultad: "+facultad);
        System.out.println("Carrera: "+carrera);
        System.out.println("Creditos: "+creditos);
    }  
    
    public static void Saludo(){
        System.out.println("Hola Mundo");
    }

    public void CargarDatosEstudiante(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----Datos Estudiantes-----");
        System.out.println("-----Ingrese los datos-----");
        System.out.println("Nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Cedula: ");
        cedula = teclado.next();
        System.out.println("Facultad: ");
        facultad = teclado.next();
        System.out.println("Carrera: ");
        carrera = teclado.next();
        System.out.println("Creditos: ");
        creditos = teclado.nextInt();
    }

    public void CrearEstudiantePorParametros(String _nombre, String _cedula, 
                                            String _facultad, String _carrera, int _creditos){
        nombre = _nombre;
        cedula = _cedula;
        facultad = _facultad;
        carrera = _carrera;
        creditos = _creditos;
    }

    public static void main(String[] args) {
        //Instanciar
        /* 
        Estudiante estudiante_1 = new Estudiante();
        estudiante_1.nombre = "Juan Lopez";
        estudiante_1.cedula = "1801";
        estudiante_1.facultad = "FISEI";
        estudiante_1.carrera = "TI";
        estudiante_1.creditos = 30;
        
        //Imprimir los datos del estudiante 1
        estudiante_1.ImprimirDatosEstudiantes();

        //Saludo();

        Estudiante estudiante_2 = new Estudiante();
        Imprimir los datos del estudiante 2
        estudiante_2.CargarDatosEstudiante();
        estudiante_2.ImprimirDatosEstudiantes();
        */

        Estudiante estudiante_3 = new Estudiante();
        estudiante_3.CrearEstudiantePorParametros("Jose Soria", "1701", 
                                                "FICM", "Mecanica", 150);
            estudiante_3.ImprimirDatosEstudiantes();
        }

}
