package Vista;

import Controlador.ControladorConsultaOTOperario;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FrameConsultaOTOperario extends JFrame{

    private ControladorConsultaOTOperario controladorConsultaOTOperario;

    private JFrame ventana = new JFrame("Consulta OT asignadas");
    private JPanel panelConsulta = new JPanel(new FlowLayout());
    private JPanel panelTotales = new JPanel(new FlowLayout());
    private JPanel panelCentral = new JPanel();
    private JLabel labelDocumentoOperador = new JLabel("Documento");
    private JTextField textDocumentoOperador  = new JTextField(8);
    private JButton buttonBuscar = new JButton("Buscar");
    private String[] columnas = {"Codigo OT", "Fecha Registración", "Producto", "Cantidad requerida", "Fecha finalización", "Descripcion", "Urgente", "Responsables", "Supervisor"};
    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable tabla = new JTable(tableModel) {};
    private JScrollPane scrollPane = new JScrollPane(tabla);

    public FrameConsultaOTOperario(ControladorConsultaOTOperario controladorConsultaOTOperario) {
        this.controladorConsultaOTOperario = controladorConsultaOTOperario;
        controladorConsultaOTOperario.setVista(this);

        ventana.setSize(750, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        buttonBuscar.addActionListener(controladorConsultaOTOperario);

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

    }

    public ControladorConsultaOTOperario getControladorConsultaOTOperario() {
        return controladorConsultaOTOperario;
    }

    public void setControladorConsultaOTOperario(ControladorConsultaOTOperario controladorConsultaOTOperario) {
        this.controladorConsultaOTOperario = controladorConsultaOTOperario;
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
