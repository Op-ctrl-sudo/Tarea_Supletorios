public class Principal {

    public static void main(String[] args) {
        Cliente cliente_1 = new Cliente("Juan","1801",19);
        Cliente cliente_2 = new Cliente("Ana","1802",18);
        Cliente cliente_3 = new Cliente("Pablo","1803",20);
        
        //cliente_1.imprimirDatosCliente();
        cliente_1.setCedula("1710");
        cliente_1.imprimirDatosCliente();

    }

}
