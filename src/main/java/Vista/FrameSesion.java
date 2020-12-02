package Vista;

import Controlador.ControladorFrameSesion;
import javax.swing.*;
import java.awt.*;

public class FrameSesion extends JFrame{

    private ControladorFrameSesion controladorFrameSesion;
    private JFrame ventana = new JFrame("Elaboración de productos químicos");
    private JPanel panelMensaje = new JPanel();
    private JPanel panelSesion = new JPanel();
    private JLabel mensaje = new JLabel("Escoja un roll para iniciar sesión:");
    private JButton buttonSupervisor = new JButton("Supervisor");
    private JButton buttonOperario = new JButton("Operario");

    public FrameSesion(ControladorFrameSesion controladorFrameSesion) {

        this.ventana.setSize(450, 100);
        this.controladorFrameSesion = controladorFrameSesion;
        controladorFrameSesion.setframeSesion(this);

        this.buttonSupervisor.addActionListener(controladorFrameSesion);
        this.buttonOperario.addActionListener(controladorFrameSesion);

        this.panelMensaje.add(mensaje);
        this.panelSesion.add(buttonSupervisor);
        this.panelSesion.add(buttonOperario);
        this.ventana.add(this.panelMensaje, BorderLayout.NORTH);
        this.ventana.add(this.panelSesion, BorderLayout.SOUTH);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setVisible(true);
    }

    public ControladorFrameSesion getControladorFrameSesion() {
        return controladorFrameSesion;
    }

    public void setControladorFrameSesion(ControladorFrameSesion controladorFrameSesion) {
        this.controladorFrameSesion = controladorFrameSesion;
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JPanel getPanelSesion() {
        return panelSesion;
    }

    public void setPanelSesion(JPanel panelSesion) {
        this.panelSesion = panelSesion;
    }

    public JButton getButtonSupervisor() {
        return buttonSupervisor;
    }

    public void setButtonSupervisor(JButton buttonSupervisor) {
        this.buttonSupervisor = buttonSupervisor;
    }

    public JButton getButtonOperario() {
        return buttonOperario;
    }

    public void setButtonOperario(JButton buttonOperario) {
        this.buttonOperario = buttonOperario;
    }
}




