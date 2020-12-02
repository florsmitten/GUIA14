package Vista;

import Controlador.ControladorMenuSupervisor;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMenuSupervisor extends JFrame{

    JMenu opcion1 = new JMenu("Operaciones");
    JMenu opcion2 = new JMenu("Sistema");
    JMenuItem opcion3 = new JMenuItem("Salir");

    JMenuItem subopcion1 = new JMenuItem("Ingreso");
    JMenuItem subopcion2 = new JMenuItem("Modificacion");
    JMenuItem subopcion3 = new JMenuItem("Consulta OT");
    JMenuItem subopcion4 = new JMenuItem("Crear tarea - Asignar recursos");

    JMenuItem subopcion5 = new JMenuItem("Acerca de");

    private ControladorMenuSupervisor controladorMenuSupervisor;

    public FrameMenuSupervisor(ControladorMenuSupervisor controladorMenuSupervisor) {

        this.controladorMenuSupervisor = controladorMenuSupervisor;
        this.controladorMenuSupervisor.setFrameMenuSupervisor(this);

        this.setTitle("Elaboración de productos químicos - Menu Supervisor");

        JMenu solapa = new JMenu("Opciones");

        opcion1.add(subopcion1);
        opcion1.add(subopcion2);
        opcion1.add(subopcion3);
        opcion1.add(subopcion4);
        opcion2.add(subopcion5);

        subopcion1.addActionListener(controladorMenuSupervisor);
        subopcion2.addActionListener(controladorMenuSupervisor);
        subopcion3.addActionListener(controladorMenuSupervisor);
        subopcion4.addActionListener(controladorMenuSupervisor);
        opcion2.addActionListener(controladorMenuSupervisor);

        solapa.add(opcion1);
        solapa.add(opcion2);
        solapa.add(opcion3);

        subopcion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Elaboración de productos químicos\n" +
                                "Versión 1.0 - 2020\n" +
                                "Schmidt María Florencia", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        opcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?",
                        "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        barraMenu.add(solapa);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public JMenu getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(JMenu opcion1) {
        this.opcion1 = opcion1;
    }

    public JMenu getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(JMenu opcion2) {
        this.opcion2 = opcion2;
    }

    public JMenuItem getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(JMenuItem opcion3) {
        this.opcion3 = opcion3;
    }

    public JMenuItem getSubopcion1() {
        return subopcion1;
    }

    public void setSubopcion1(JMenuItem subopcion1) {
        this.subopcion1 = subopcion1;
    }

    public JMenuItem getSubopcion2() {
        return subopcion2;
    }

    public void setSubopcion2(JMenuItem subopcion2) {
        this.subopcion2 = subopcion2;
    }

    public JMenuItem getSubopcion3() {
        return subopcion3;
    }

    public void setSubopcion3(JMenuItem subopcion3) {
        this.subopcion3 = subopcion3;
    }

    public JMenuItem getSubopcion4() {
        return subopcion4;
    }

    public void setSubopcion4(JMenuItem subopcion4) {
        this.subopcion4 = subopcion4;
    }

    public JMenuItem getSubopcion5() {
        return subopcion5;
    }

    public void setSubopcion5(JMenuItem subopcion5) {
        this.subopcion5 = subopcion5;
    }

    public ControladorMenuSupervisor getControladorMenuSupervisor() {
        return controladorMenuSupervisor;
    }

    public void setControladorMenuSupervisor(ControladorMenuSupervisor controladorMenuSupervisor) {
        this.controladorMenuSupervisor = controladorMenuSupervisor;
    }
}