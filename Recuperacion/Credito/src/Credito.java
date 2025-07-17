import java.awt.*;
import javax.swing.*;

public class Credito extends JFrame {

    private JComboBox<String> tipoCreditoBox;
    private JTextField montoField, plazoField;
    private JComboBox<String> sistemaBox;
    private JTextArea resultadoArea;
    private JButton calcularButton;

    // Constructor
    public Credito() {
        setTitle("Simulador de Crédito");
        setSize(750, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Fondo de la ventana
        getContentPane().setBackground(new Color(245, 245, 245)); // Gris suave

        // Panel de entrada con diseño
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2, 15, 15));
        inputPanel.setBackground(new Color(255, 255, 255));  // Fondo blanco
        inputPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        // Crear elementos de la interfaz
        tipoCreditoBox = new JComboBox<>(new String[]{
            "1. Hipotecario (7.5% - TEA: 7.76%)",
            "2. Hipotecario Público (5.5% - TEA: 5.64%)",
            "3. Consumo (14.0% - TEA: 14.93%)",
            "4. Trabajo (10.0% - TEA: 10.47%)",
            "5. Educativo (9.0% - TEA: 9.38%)",
            "6. Línea Abierta (12.5% - TEA: 13.20%)"
        });

        montoField = new JTextField();
        plazoField = new JTextField();
        sistemaBox = new JComboBox<>(new String[]{"Francés", "Alemán"});
        calcularButton = new JButton("Calcular");

        // Estilo de los campos
        tipoCreditoBox.setBackground(new Color(248, 249, 250)); // Gris suave
        montoField.setBackground(new Color(248, 249, 250)); 
        plazoField.setBackground(new Color(248, 249, 250)); 
        sistemaBox.setBackground(new Color(248, 249, 250)); 
        calcularButton.setBackground(new Color(0, 123, 255)); // Azul brillante
        calcularButton.setForeground(Color.WHITE);
        calcularButton.setFocusPainted(false); // Remover el borde de foco

        // Estilo del botón con hover
        calcularButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcularButton.setBackground(new Color(0, 102, 204)); // Cambiar a un azul más oscuro
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcularButton.setBackground(new Color(0, 123, 255)); // Vuelve al azul original
            }
        });

        // Fuente personalizada
        Font fuente = new Font("Segoe UI", Font.PLAIN, 14);
        tipoCreditoBox.setFont(fuente);
        montoField.setFont(fuente);
        plazoField.setFont(fuente);
        sistemaBox.setFont(fuente);
        calcularButton.setFont(fuente);

        // Añadir los componentes al panel de entrada
        inputPanel.add(new JLabel("Tipo de Crédito:"));
        inputPanel.add(tipoCreditoBox);
        inputPanel.add(new JLabel("Monto del Crédito ($):"));
        inputPanel.add(montoField);
        inputPanel.add(new JLabel("Plazo (meses):"));
        inputPanel.add(plazoField);
        inputPanel.add(new JLabel("Sistema de Amortización:"));
        inputPanel.add(sistemaBox);
        inputPanel.add(calcularButton);

        // Panel para mostrar los resultados
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.setBackground(new Color(255, 255, 255)); // Fondo blanco

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        resultadoArea.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Tipo de letra actualizado
        resultadoArea.setBackground(new Color(248, 249, 250)); // Gris suave
        resultadoArea.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220), 1));
        resultadoArea.setLineWrap(true);
        resultadoArea.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(resultadoArea);
        resultPanel.add(scroll, BorderLayout.CENTER);

        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(resultPanel, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);

        // Evento del botón Calcular
        calcularButton.addActionListener(e -> calcularCredito());

        setVisible(true);
    }

    private void calcularCredito() {
        try {
            int opcion = tipoCreditoBox.getSelectedIndex() + 1;
            double monto = Double.parseDouble(montoField.getText());
            int plazo = Integer.parseInt(plazoField.getText());
            String sistema = sistemaBox.getSelectedItem().toString().substring(0, 1).toUpperCase();

            // Variables de tasas
            double[] tasas = {7.5, 5.5, 14.0, 10.0, 9.0, 12.5};
            double[] teas = {7.76, 5.64, 14.93, 10.47, 9.38, 13.20};
            double[] seguros = {0.005, 0.0045, 0.006, 0.0055, 0.004, 0.0065};
            double tasaAnual = tasas[opcion - 1];
            double tea = teas[opcion - 1];
            double tasaMensual = tasaAnual / 100 / 12;
            double seguro = monto * seguros[opcion - 1];

            // Plazos
            int[][] plazos = {
                {36, 240}, {236, 310}, {9, 55}, {10, 60}, {6, 120}, {3, 84}
            };
            int minPlazo = plazos[opcion - 1][0];
            int maxPlazo = plazos[opcion - 1][1];

            if (plazo < minPlazo || plazo > maxPlazo) {
                resultadoArea.setText("El plazo debe estar entre " + minPlazo + " y " + maxPlazo + " meses.");
                return;
            }

            double saldo = monto;
            double cuota = 0;
            double totalIntereses = 0;
            StringBuilder resultado = new StringBuilder();

            resultado.append("Mes | Cuota | Interés | Capital | Saldo\n");

            if (sistema.equals("F")) {
                cuota = (monto * tasaMensual) / (1 - Math.pow((1 + tasaMensual), -plazo));
                cuota = Math.round(cuota * 1000.0) / 1000.0;

                for (int mes = 1; mes <= plazo; mes++) {
                    double interes = saldo * tasaMensual;
                    double capital = cuota - interes;
                    saldo -= capital;
                    totalIntereses += interes;

                    resultado.append(String.format("%d | %.2f | %.2f | %.2f | %.2f%n", mes, cuota, interes, capital, saldo));
                }
            } else {
                double abonoCapital = monto / plazo;
                abonoCapital = Math.round(abonoCapital * 1000.0) / 1000.0;

                for (int mes = 1; mes <= plazo; mes++) {
                    double interes = saldo * tasaMensual;
                    cuota = abonoCapital + interes;
                    saldo -= abonoCapital;
                    totalIntereses += interes;

                    resultado.append(String.format("%d | %.2f | %.2f | %.2f | %.2f%n", mes, cuota, interes, abonoCapital, saldo));
                }
            }

            double totalPagado = (sistema.equals("F")) ? cuota * plazo : monto + totalIntereses;
            double totalGeneral = totalPagado + seguro;

            resultado.append("\nResumen:\n");
            resultado.append("Tasa anual: " + tasaAnual + "%\n");
            resultado.append("TEA: " + tea + "%\n");
            resultado.append("Total intereses: $" + Math.round(totalIntereses * 100) / 100.0 + "\n");
            resultado.append("Seguro desgravamen: $" + Math.round(seguro * 100) / 100.0 + "\n");
            resultado.append("Total a pagar: $" + Math.round(totalGeneral * 100) / 100.0 + "\n");

            resultadoArea.setText(resultado.toString());

        } catch (NumberFormatException ex) {
            resultadoArea.setText("Error: Asegúrese de que monto y plazo sean valores numéricos válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Credito::new);
    }
}




//             Trabajo realizado por José Muñoz y Omar Pazmiño - Primer Semestre de TI - Paralelo "A"