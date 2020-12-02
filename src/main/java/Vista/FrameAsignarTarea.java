package Vista;

import Controlador.ControladorAsignarTarea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameAsignarTarea extends JFrame {

    private ControladorAsignarTarea controladorAsignarTarea;

    private JFrame ventana = new JFrame("Asignar Tarea");
    private JPanel panelAsignar = new JPanel(new FlowLayout());
    private JPanel panelTotales = new JPanel(new FlowLayout());
    private JPanel panelCentral = new JPanel();

    private JLabel labelOperarios = new JLabel("Operarios");
    private JComboBox<String> comboOperarios = new JComboBox<String>();

    private JButton buttonAceptar = new JButton("Aceptar");
    private JButton buttonCancelar = new JButton("Cancelar");

    public FrameAsignarTarea(ControladorAsignarTarea controladorAsignarTarea) {
        this.controladorAsignarTarea = controladorAsignarTarea;
        controladorAsignarTarea.setVista(this);

        ventana.setSize(750, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        buttonAceptar.addActionListener(controladorAsignarTarea);
        comboOperarios.addItemListener(controladorAsignarTarea);
        comboOperarios.addActionListener(controladorAsignarTarea);

        buttonCancelar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cerrar la ventana?",
                        "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    ventana.dispose();
                }
            }
        });

        panelAsignar.add(labelOperarios);
        panelAsignar.add(comboOperarios);

        panelCentral.add(panelTotales, BorderLayout.SOUTH);

        ventana.add(panelAsignar, BorderLayout.NORTH);
        ventana.add(panelCentral, BorderLayout.CENTER);


    }

    public void limpiar(boolean conf) {
        int rta = !(conf) ? 0 : (JOptionPane.showConfirmDialog(null, "Los datos no fueron guardados. Confirma?", "Confirmacion", JOptionPane.YES_NO_OPTION));
        if (rta == JOptionPane.YES_OPTION) {

            comboOperarios.setSelectedIndex(0);
        }
    }

    public ControladorAsignarTarea getControladorAsignarTarea() {
        return controladorAsignarTarea;
    }

    public void setControladorAsignarTarea(ControladorAsignarTarea controladorAsignarTarea) {
        this.controladorAsignarTarea = controladorAsignarTarea;
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JPanel getPanelAsignar() {
        return panelAsignar;
    }

    public void setPanelAsignar(JPanel panelAsignar) {
        this.panelAsignar = panelAsignar;
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

    public JLabel getLabelOperarios() {
        return labelOperarios;
    }

    public void setLabelOperarios(JLabel labelOperarios) {
        this.labelOperarios = labelOperarios;
    }

    public JComboBox<String> getComboOperarios() {
        return comboOperarios;
    }

    public void setComboOperarios(JComboBox<String> comboOperarios) {
        this.comboOperarios = comboOperarios;
    }

    public JButton getButtonAceptar() {
        return buttonAceptar;
    }

    public void setButtonAceptar(JButton buttonAceptar) {
        this.buttonAceptar = buttonAceptar;
    }

    public JButton getButtonCancelar() {
        return buttonCancelar;
    }

    public void setButtonCancelar(JButton buttonCancelar) {
        this.buttonCancelar = buttonCancelar;
    }

}
