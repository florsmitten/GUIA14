package Vista;

import Controlador.ControladorModificacionOT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameModificacionOT extends JFrame{

    private ControladorModificacionOT controladorModificacionOT;

    private JFrame ventana = new JFrame("Modificación OT");
    private JPanel panelConsulta = new JPanel();

    private JTextArea textArea = new JTextArea("- Ingrese el código de la OT que desea modificar -");
    private JLabel labelCodigo = new JLabel("Codigo OT");
    private JTextField textCodigo = new JTextField(10);
    private JButton buttonBuscar = new JButton("Buscar");
    private JButton buttonCancelar = new JButton("Cancelar");

    public FrameModificacionOT(ControladorModificacionOT controladorModificacionOT) {

        ventana.setSize(450, 100);
        this.controladorModificacionOT = controladorModificacionOT;
        controladorModificacionOT.setVista(this);

        buttonCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiar(true);
            }
        });

        buttonBuscar.addActionListener(controladorModificacionOT);

        panelConsulta.setLayout(new FlowLayout());
        textArea.setEditable(false);
        panelConsulta.add(textArea);
        panelConsulta.add(labelCodigo);
        panelConsulta.add(textCodigo);
        panelConsulta.add(buttonBuscar);
        panelConsulta.add(buttonCancelar);

        ventana.add(panelConsulta);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }

    public void limpiar(boolean conf) {
        int rta = !(conf) ? 0 : (JOptionPane.showConfirmDialog(null, "Los datos no fueron guardados. Confirma?", "Confirmacion", JOptionPane.YES_NO_OPTION));
        if (rta == JOptionPane.YES_OPTION) {

            textCodigo.setText("");
        }
    }

    public ControladorModificacionOT getControladorModificacionOT() {
        return controladorModificacionOT;
    }

    public void setControladorModificacionOT(ControladorModificacionOT controladorModificacionOT) {
        this.controladorModificacionOT = controladorModificacionOT;
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

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public JLabel getLabelCodigo() {
        return labelCodigo;
    }

    public void setLabelCodigo(JLabel labelCodigo) {
        this.labelCodigo = labelCodigo;
    }

    public JTextField getTextCodigo() {
        return textCodigo;
    }

    public void setTextCodigo(JTextField textCodigo) {
        this.textCodigo = textCodigo;
    }

    public JButton getButtonBuscar() {
        return buttonBuscar;
    }

    public void setButtonBuscar(JButton buttonBuscar) {
        this.buttonBuscar = buttonBuscar;
    }

    public JButton getButtonCancelar() {
        return buttonCancelar;
    }

    public void setButtonCancelar(JButton buttonCancelar) {
        this.buttonCancelar = buttonCancelar;
    }
}
