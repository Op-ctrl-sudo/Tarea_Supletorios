public class ConvertidorStringArrays {

    public static void main(String[] args) {
        String cedula = "1803218914";
        String frutas = "manzana,uva,limon";
        //System.out.println(cedula.substring(0,2));
        //System.out.println(cedula.charAt(0)+""+cedula.charAt(1));
        String delimitador = "";
        String delimitador2 = ",";
        //
        String vectorCedula[] = cedula.split(delimitador);
        for (int i = 0; i < vectorCedula.length; i++) {
            System.out.println(vectorCedula[i]);
        }
        String vectorFrutas[] = frutas.split(delimitador2);
        for (int i = 0; i < vectorFrutas.length; i++) {
            System.out.println(vectorFrutas[i]);
        }

        //Converitr un vector a una variable String
        String numero = String.join(delimitador,vectorCedula);
        System.out.println(numero);

        String ensalada = String.join(",", vectorFrutas);
        System.out.println(ensalada);

    }

}
