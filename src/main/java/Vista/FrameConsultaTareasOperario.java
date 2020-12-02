package Vista;

import Controlador.ControladorConsultaTareasOperario;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FrameConsultaTareasOperario extends JFrame{

    private ControladorConsultaTareasOperario controladorConsultaTareasOperario;

    private JFrame ventana = new JFrame("Tareas asignadas");
    private JPanel panelConsulta = new JPanel(new FlowLayout());
    private JPanel panelTotales = new JPanel(new FlowLayout());
    private JPanel panelCentral = new JPanel();

    private JLabel labelDocumentoOperador = new JLabel("Documento");
    private JTextField textDocumentoOperador  = new JTextField(20);
    private JButton buttonBuscar = new JButton("Buscar");
    private String[] columnas = {"Codigo Tarea", "Tarea Realizada", "Fecha Fin Tarea", "Hora Fin Tarea", "Operario Asignado"};
    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable tabla = new JTable(tableModel) {
        public boolean isCellEditable(int row,int column)
        {return row >= 0 && column >= 1 && row >= 0 && column <= 3;
        }
    };
    private JScrollPane scrollPane = new JScrollPane(tabla);

    public FrameConsultaTareasOperario(ControladorConsultaTareasOperario controladorConsultaTareasOperario) {
        this.controladorConsultaTareasOperario = controladorConsultaTareasOperario;
        controladorConsultaTareasOperario.setVista(this);

        ventana.setSize(750, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        buttonBuscar.addActionListener(controladorConsultaTareasOperario);

        panelConsulta.add(labelDocumentoOperador);
        panelConsulta.add(textDocumentoOperador);

        for (int i = 0; i < columnas.length; i++) {
            tableModel.addColumn(columnas[i]);
        }

        panelCentral.add(scrollPane, BorderLayout.CENTER);
        panelCentral.add(panelTotales, BorderLayout.SOUTH);

        ventana.add(panelConsulta, BorderLayout.NORTH);
        ventana.add(buttonBuscar, BorderLayout.SOUTH);
        ventana.add(panelCentral, BorderLayout.CENTER);

        tabla.getModel().addTableModelListener(controladorConsultaTareasOperario);

    }

    public ControladorConsultaTareasOperario getControladorConsultaOTOperario() {
        return controladorConsultaTareasOperario;
    }

    public void setControladorConsultaOTOperario(ControladorConsultaTareasOperario controladorConsultaTareasOperario) {
        this.controladorConsultaTareasOperario = controladorConsultaTareasOperario;
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JPanel getPanelConsulta() {
        return panelConsulta;
    }

    public void setPanelConsulta(JPanel panelConsulta) {
        this.panelConsulta = panelConsulta;
    }

    public JPanel getPanelTotales() {
        return panelTotales;
    }

    public void setPanelTotales(JPanel panelTotales) {
        this.panelTotales = panelTotales;
    }

    public JPanel getPanelCentral() {
        return panelCentral;
    }

    public void setPanelCentral(JPanel panelCentral) {
        this.panelCentral = panelCentral;
    }

    public JLabel getLabelDocumentoOperador() {
        return labelDocumentoOperador;
    }

    public void setLabelDocumentoOperador(JLabel labelDocumentoOperador) {
        this.labelDocumentoOperador = labelDocumentoOperador;
    }

    public JTextField getTextDocumentoOperador() {
        return textDocumentoOperador;
    }

    public void setTextDocumentoOperador(JTextField textDocumentoOperador) {
        this.textDocumentoOperador = textDocumentoOperador;
    }

    public JButton getButtonBuscar() {
        return buttonBuscar;
    }

    public void setButtonBuscar(JButton buttonBuscar) {
        this.buttonBuscar = buttonBuscar;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }
}
