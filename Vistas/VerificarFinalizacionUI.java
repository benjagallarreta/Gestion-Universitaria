// File: VerificarFinalizacionUI.java

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VerificarFinalizacionUI extends JFrame {

    private Alumno alumno;
    private JTable tablaMaterias;
    private JLabel resultadoLabel;

    public VerificarFinalizacionUI(Alumno alumno) {
        this.alumno = alumno;

        setTitle("Verificación de Finalización");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        tablaMaterias = new JTable();
        actualizarTabla();
        add(new JScrollPane(tablaMaterias), BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        JButton botonVerificar = new JButton("Verificar Finalización");
        resultadoLabel = new JLabel("Resultado: Pendiente");

        botonVerificar.addActionListener(e -> {
            boolean finalizado = GestionUniversitaria.verficarFinalizacion(alumno);
            resultadoLabel.setText("Resultado: " + (finalizado ? "Finalizado" : "Pendiente"));
            JOptionPane.showMessageDialog(VerificarFinalizacionUI.this,
                    finalizado ? "Alumno ha finalizado todas las materias." : "Alumno aún tiene materias pendientes.",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        panelInferior.add(botonVerificar);
        panelInferior.add(resultadoLabel);

        add(panelInferior, BorderLayout.SOUTH);
    }

    private void actualizarTabla() {
        String[] columnas = {"Materia", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
            modelo.addRow(new Object[]{cursada.getNombre(), cursada.getEstado().toString()});
        }

        tablaMaterias.setModel(modelo);
    }

}
