public class EstudianteConstructor {

    public String nombre;
    public String cedula;
    public String facultad;
    public String carrera;
    public int creditos;

    //Costructor tien el mismo nombre de la clase y no devuelve tipo de datos, puede tener o no parametros
    //Me sirve para definir la forma en la que voy a inicializar un obj.
    public EstudianteConstructor(){

    }
    
    public EstudianteConstructor(String _nombre, String _cedula, 
                                            String _facultad, String _carrera, int _creditos){
        nombre = _nombre;
        cedula = _cedula;
        facultad = _facultad;
        carrera = _carrera;
        creditos = _creditos;
    }

    public EstudianteConstructor(String _nombre, String _cedula, int _creditos){
        nombre = _nombre;
        cedula = _cedula;
        creditos = _creditos;
    }

    public void ImprimirDatosEstudiantes() {
        System.out.println("-----Datos Estudiantes-----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);
        System.out.println("Facultad: "+facultad);
        System.out.println("Carrera: "+carrera);
        System.out.println("Creditos: "+creditos);
    }

    public static void main(String[] args) {
        EstudianteConstructor estudianteconstructor_1 = new EstudianteConstructor();
        estudianteconstructor_1.nombre = "Juan Jose";
        estudianteconstructor_1.cedula = "1801" ;
        estudianteconstructor_1.facultad = "FISEI";
        estudianteconstructor_1.carrera = "TI";
        estudianteconstructor_1.creditos = 30;
        //Imprimir los datos del Estudiante

        EstudianteConstructor estudianteConstructor_2 = new EstudianteConstructor("Luis Perez", "1801",
                                                                             "FISEI", "SW" , 100);
        EstudianteConstructor estudianteConstructor_3 = new EstudianteConstructor("Maria Cancon", "1801",
                                                                             "FISEI", "SW" , 20);
        EstudianteConstructor estudianteConstructor_4 = new EstudianteConstructor("Grabriela Soto", "1805", 120);
        EstudianteConstructor estudianteConstructor_5 = new EstudianteConstructor("Andres Cepeda", "1860", 50);
    }

}
