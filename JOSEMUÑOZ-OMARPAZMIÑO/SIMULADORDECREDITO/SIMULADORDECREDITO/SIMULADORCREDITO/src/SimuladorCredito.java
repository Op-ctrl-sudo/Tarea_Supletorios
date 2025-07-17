import java.util.Scanner;
public class SimuladorCredito {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0, plazo = 0;
        double monto = 0, tasaAnual = 0, tasaMensual = 0, cuota = 0;
        double saldo, totalIntereses = 0;
        double seguroDesgravamen = 0;
        String sistema = "";

        // Mostrar menú principal
        System.out.println("Seleccione el tipo de crédito:");
        System.out.println("1. Hipotecario (7.5% - TEA: 7.76%)");
        System.out.println("2. Hipotecario Público (5.5% - TEA: 5.64%)");
        System.out.println("3. Consumo (14.0% - TEA: 14.93%)");
        System.out.println("4. Trabajo (10.0% - TEA: 10.47%)");
        System.out.println("5. Educativo (9.0% - TEA: 9.38%)");
        System.out.println("6. Línea Abierta (12.5% - TEA: 13.20%)");

        // Validar opción del usuario
        do {
            System.out.print("Ingrese una opción (1-6): ");
            opcion = leer.nextInt();
        } while (opcion < 1 || opcion > 6);

        // Asignar tasa y nombre del producto según opción
        String producto = "";
        switch (opcion) {
            case 1:
                tasaAnual = 7.5;
                producto = "Hipotecario";
                break;
            case 2:
                tasaAnual = 5.5;
                producto = "Hipotecario Público";
                break;
            case 3:
                tasaAnual = 14;
                producto = "Consumo";
                break;
            case 4:
                tasaAnual = 10;
                producto = "Trabajo";
                break;
            case 5:
                tasaAnual = 9;
                producto = "Educativo";
                break;
            case 6:
                tasaAnual = 12.5;
                producto = "Línea Abierta";
                break;
        }

        // Asignar TEA según opción
        double tea = 0;
        switch (opcion) {
            case 1: 
            tea = 7.76; 
            break;
            case 2: 
            tea = 5.64; 
            break;
            case 3: 
            tea = 14.93; 
            break;
            case 4: 
            tea = 10.47; 
            break;
            case 5: 
            tea = 9.38; 
            break;
            case 6: 
            tea = 13.20; 
            break;
        }

        // Redondeo de tasas
        tasaAnual = Math.round(tasaAnual * 1000.0) / 1000.0;
        tea = Math.round(tea * 1000.0) / 1000.0;

        System.out.println("Tasa anual asignada: " + tasaAnual + "%");
        System.out.println("Tasa de interés efectiva anual (TEA): " + tea + "%");

        // Establecer monto mínimo según tipo de crédito
        double montoMinimo;
        switch (opcion) {
            case 1: 
            montoMinimo = 20000; 
            break;
            case 2: 
            montoMinimo = 15000; 
            break;
            case 3: 
            montoMinimo = 1500; 
            break;
            case 4: 
            montoMinimo = 2000; 
            break;
            case 5: 
            montoMinimo = 1000; 
            break;
            case 6: 
            montoMinimo = 500; 
            break;
            default: 
            montoMinimo = 2000;
        }

        // Solicitar monto al usuario
        do {
            System.out.print("Ingrese el monto del crédito (mínimo " + montoMinimo + "): ");
            monto = leer.nextDouble();
        } while (monto < montoMinimo);

        // Establecer límites de plazo según opción
        int minPlazo = 0, maxPlazo = 0;
        switch (opcion) {
            case 1: 
            minPlazo = 36; 
            maxPlazo = 240; 
            break;
            case 2: 
            minPlazo = 236; 
            maxPlazo = 310; 
            break;
            case 3: 
            minPlazo = 9; 
            maxPlazo = 55; 
            break;
            case 4: 
            minPlazo = 10; 
            maxPlazo = 60; 
            break;
            case 5: 
            minPlazo = 6; 
            maxPlazo = 120; 
            break;
            case 6: 
            minPlazo = 3; 
            maxPlazo = 84; 
            break;
        }

        // Solicitar plazo al usuario
        do {
            System.out.print("Ingrese el plazo en meses (entre " + minPlazo + " y " + maxPlazo + "): ");
            plazo = leer.nextInt();
        } while (plazo < minPlazo || plazo > maxPlazo);

        // Validar sistema de amortización 
        while (!(sistema.equals("F") || sistema.equals("f") || sistema.equals("A") || sistema.equals("a"))) {
            System.out.print("Seleccione el sistema (F = Francés, A = Alemán): ");
            sistema = leer.next();
            if (!(sistema.equals("F") || sistema.equals("f") || sistema.equals("A") || sistema.equals("a"))) {
                System.out.println("Entrada no válida. Solo se permite 'F' o 'A'. Intente nuevamente.");
            }
        }

        tasaMensual = tasaAnual / 100 / 12;
        saldo = monto;

        // Calcular seguro de desgravamen según tipo
        switch (opcion) {
            case 1: 
            seguroDesgravamen = monto * 0.005; 
            break;
            case 2: 
            seguroDesgravamen = monto * 0.0045; 
            break;
            case 3: 
            seguroDesgravamen = monto * 0.006; 
            break;
            case 4: 
            seguroDesgravamen = monto * 0.0055; 
            break;
            case 5: 
            seguroDesgravamen = monto * 0.004; 
            break;
            case 6: 
            seguroDesgravamen = monto * 0.0065; 
            break;
        }

        double totalPagado = 0;

        // Procesar sistema Francés
        if (sistema.equals("F") || sistema.equals("f")) {
            cuota = (monto * tasaMensual) / (1 - Math.pow((1 + tasaMensual), -plazo));
            cuota = Math.round(cuota * 1000.0) / 1000.0;
            System.out.println("\nSistema Francés - Cuota fija mensual: " + cuota);
            System.out.println("Mes | Cuota | Interés | Capital | Saldo");

            for (int mes = 1; mes <= plazo; mes++) {
                double interes = saldo * tasaMensual;
                double capital = cuota - interes;
                saldo -= capital;
                totalIntereses += interes;

                interes = Math.round(interes * 1000.0) / 1000.0;
                capital = Math.round(capital * 1000.0) / 1000.0;
                saldo = Math.round(saldo * 1000.0) / 1000.0;

                System.out.println(mes + " | " + cuota + " | " + interes + " | " + capital + " | " + saldo);
            }
            totalPagado = cuota * plazo;

        // Procesar sistema Alemán
        } else if (sistema.equals("A") || sistema.equals("a")) {
            double abonoCapital = monto / plazo;
            abonoCapital = Math.round(abonoCapital * 1000.0) / 1000.0;
            System.out.println("\nSistema Alemán - Abono fijo mensual al capital: " + abonoCapital);
            System.out.println("Mes | Cuota | Interés | Capital | Saldo");

            for (int mes = 1; mes <= plazo; mes++) {
                double interes = saldo * tasaMensual;
                cuota = abonoCapital + interes;
                saldo -= abonoCapital;
                totalIntereses += interes;

                interes = Math.round(interes * 1000.0) / 1000.0;
                cuota = Math.round(cuota * 1000.0) / 1000.0;
                saldo = Math.round(saldo * 1000.0) / 1000.0;

                System.out.println(mes + " | " + cuota + " | " + interes + " | " + abonoCapital + " | " + saldo);
            }
            totalPagado = monto + totalIntereses;
        }

        // Mostrar resumen final
        totalIntereses = Math.round(totalIntereses * 1000.0) / 1000.0;
        totalPagado = Math.round(totalPagado * 1000.0) / 1000.0;
        double totalGeneral = totalPagado + seguroDesgravamen;
        totalGeneral = Math.round(totalGeneral * 1000.0) / 1000.0;

        System.out.println("\nProducto: " + producto);
        System.out.println("Plazo (meses): " + plazo);
        System.out.println("Tasa de interés nominal: " + tasaAnual + "%");
        System.out.println("Tasa de interés efectiva anual: " + tea + "%");
        System.out.println("Capital: $" + monto);
        System.out.println("Total de interés: $" + totalIntereses);
        System.out.println("Total seguro de desgravamen: $" + Math.round(seguroDesgravamen * 1000.0) / 1000.0);
        System.out.println("Total a pagar: $" + totalGeneral);

        leer.close();
    }
}

//             Trabajo realizado por José Muñoz y Omar Pazmiño - Primer Semestre de TI - Paralelo "A" 