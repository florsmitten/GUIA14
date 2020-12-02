package Vista;

import Controlador.ControladorConsultaOT;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FrameConsultaOT extends JFrame{

    private ControladorConsultaOT controladorConsultaOT;

    private JFrame ventana = new JFrame("Consulta OT");
    private JPanel panelConsulta = new JPanel(new FlowLayout());
    private JPanel panelTotales = new JPanel(new FlowLayout());
    private JPanel panelCentral = new JPanel();

    private JLabel labelCodigoOT = new JLabel("Código OT");
    private JTextField textCodigoOT  = new JTextField(20);
    private JButton buttonBuscar = new JButton("Buscar");
    private String[] columnas = {"Codigo Tarea", "Tarea Realizada", "Fecha Fin Tarea", "Hora Fin Tarea", "Operario Asignado"};
    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable tabla = new JTable(tableModel) {};
    private JScrollPane scrollPane = new JScrollPane(tabla);

    public FrameConsultaOT(ControladorConsultaOT controladorConsultaOT) {
        this.controladorConsultaOT = controladorConsultaOT;
        controladorConsultaOT.setVista(this);

        ventana.setSize(750, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        buttonBuscar.addActionListener(controladorConsultaOT);

        panelConsulta.add(labelCodigoOT);
        panelConsulta.add(textCodigoOT);

        for (int i = 0; i < columnas.length; i++) {
            tableModel.addColumn(columnas[i]);
        }

        panelCentral.add(scrollPane, BorderLayout.CENTER);
        panelCentral.add(panelTotales, BorderLayout.SOUTH);

        ventana.add(panelConsulta, BorderLayout.NORTH);
        ventana.add(buttonBuscar, BorderLayout.SOUTH);
        ventana.add(panelCentral, BorderLayout.CENTER);

    }

    public ControladorConsultaOT getControladorConsultaOT() {
        return controladorConsultaOT;
    }

    public void setControladorConsultaOT(ControladorConsultaOT controladorConsultaOT) {
        this.controladorConsultaOT = controladorConsultaOT;
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

    public JLabel getLabelCodigoOT() {
        return labelCodigoOT;
    }

    public void setLabelCodigoOT(JLabel labelCodigoOT) {
        this.labelCodigoOT = labelCodigoOT;
    }

    public JTextField getTextCodigoOT() {
        return textCodigoOT;
    }

    public void setTextCodigoOT(JTextField textCodigoOT) {
        this.textCodigoOT = textCodigoOT;
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
