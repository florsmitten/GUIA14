package Vista;

import Controlador.ControladorFrameIngresoOT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FrameIngresoOT {

    private JFrame ventana = new JFrame();
    private JPanel panelPie = new JPanel();
    private JPanel panelCabecera = new JPanel();
    private JPanel panelCenter = new JPanel();
    private JPanel panelCenterLeft = new JPanel();
    private JPanel panelCenterRight = new JPanel();
    private JPanel panelCodigoOT = new JPanel();
    private JPanel panelFechaRegistracion = new JPanel();
    private JPanel panelProducto = new JPanel(); //combo
    private JPanel panelCantidadRequerida = new JPanel();
    private JPanel panelFechaFinalizacion = new JPanel();
    private JPanel panelDescripcion = new JPanel();
    private JPanel panelEsUrgente = new JPanel(); //CkeckBox
    private JPanel panelNombreResponsables = new JPanel();
    private JPanel panelSupervisor = new JPanel();//combo
    private JPanel panelTareas = new JPanel(); //VER COMO CARGAR LAS TAREAS QUE VAN POR COMPOSICION
    private JPanel panelUp = new JPanel();
    private JPanel panelDown = new JPanel();

    private JTextArea textIntroduccion = new JTextArea("Bienvenido\n" + "Complete el formulario con los datos requeridos\n");

    private JLabel labelCodigoOT = new JLabel("Código de OT");
    private JLabel labelFechaRegistracion = new JLabel("Fecha registración");
    private JLabel labelProducto = new JLabel("Producto");
    private JLabel labelCantidadRequerida  = new JLabel("Cantidad requerida");
    private JLabel labelFechaFinalizacion = new JLabel("Fecha de finalización");
    private JLabel labelDescripcion = new JLabel("Descripción");
    private JLabel labelEsUrgente = new JLabel("Estado");
    private JLabel labelNombreResponsables = new JLabel("Nombre de los responsables");
    private JLabel labelSupervisor = new JLabel("Supervisor");
    //private JLabel labelTareas = new JLabel("Tareas");

    private JTextField textCodigoOT = new JTextField(10);
    private JTextField textFechaRegistracion = new JTextField(8);

    private JComboBox<String> comboProductos = new JComboBox<String>();

    private JTextField textCantidadRequerida = new JTextField(10);
    private JTextField textFechaFinalizacion = new JTextField(8);
    private JTextField textDescripcion = new JTextField(50);

    private JCheckBox boxEsUrgente= new JCheckBox("Sangre");

    private JTextField textNombreResponsables = new JTextField(50);

    private JComboBox<String> comboSupervisor= new JComboBox<String>();

    //TAREAS

    private JButton buttonAceptar = new JButton("Aceptar");
    private JButton buttonCancelar = new JButton("Cancelar");
    private JButton buttonEditar = new JButton("Editar");
    private JButton buttonAnular = new JButton("Anular");

    private JScrollPane scrollPane = new JScrollPane();
    private JScrollPane scrollPaneAux = new JScrollPane();

    private boolean ingreso;

    public FrameIngresoOT(ControladorFrameIngresoOT controladorFrameIngresoOT, boolean esIngreso) {

        ventana.setSize(600, 500);

        ingreso = esIngreso;
        if (esIngreso) {

            ventana.setTitle("Ingreso de OT");
            buttonEditar.setVisible(false);
            buttonAnular.setVisible(false);
            buttonAceptar.setEnabled(true);
            buttonCancelar.setEnabled(true);

            buttonCancelar.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    limpiar(true);
                }
            });

        } else {
            ventana.setTitle("Edicion de OT");
            buttonEditar.setEnabled(true);
            buttonAnular.setEnabled(true);
            buttonAceptar.setVisible(false);
            buttonCancelar.setVisible(false);

            buttonCancelar.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cerrar la ventana?",
                            "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        ventana.dispose();
                    }
                }
            });
        }

        buttonAceptar.addActionListener(controladorFrameIngresoOT);

        buttonAnular.addActionListener(controladorFrameIngresoOT);

        buttonEditar.addActionListener(controladorFrameIngresoOT);

        controladorFrameIngresoOT.setVista(this);

        comboProductos.addItemListener(controladorFrameIngresoOT);
        comboProductos.addActionListener(controladorFrameIngresoOT);

        comboSupervisor.addItemListener(controladorFrameIngresoOT);
        comboSupervisor.addActionListener(controladorFrameIngresoOT);

        textIntroduccion.setEditable(false);
        panelCabecera.add(textIntroduccion);
        ventana.add(panelCabecera, BorderLayout.NORTH);

        panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
        panelUp.setLayout(new GridLayout(1, 2));

        panelCodigoOT.setLayout(new GridLayout(2, 1));
        panelCodigoOT.add(labelCodigoOT);
        panelCodigoOT.add(textCodigoOT);
        panelCenterLeft.add(panelCodigoOT);

        panelFechaRegistracion.setLayout(new GridLayout(2, 1));
        panelFechaRegistracion.add(labelFechaRegistracion);
        panelFechaRegistracion.add(textFechaRegistracion);
        panelCenterRight.add(panelFechaRegistracion);

        panelProducto.add(labelProducto);
        panelProducto.add(comboProductos);
        panelCenterLeft.add(panelProducto);

        panelCantidadRequerida.setLayout(new GridLayout(2, 1));
        panelCantidadRequerida.add(labelCantidadRequerida);
        panelCantidadRequerida.add(textCantidadRequerida);
        panelCenterRight.add(panelCantidadRequerida);

        panelFechaFinalizacion.setLayout(new GridLayout(2, 1));
        panelFechaFinalizacion.add(labelFechaFinalizacion);
        panelFechaFinalizacion.add(textFechaFinalizacion);
        panelCenterLeft.add(panelFechaFinalizacion);

        panelSupervisor.add(labelSupervisor);
        panelSupervisor.add(comboSupervisor);
        panelCenterRight.add(panelSupervisor);

        panelEsUrgente.setLayout(new GridLayout(2, 1));
        panelEsUrgente.add(labelEsUrgente);
        panelEsUrgente.add(boxEsUrgente);
        panelCenterLeft.add(panelEsUrgente);

        panelDescripcion.setLayout(new GridLayout(2, 1));
        panelDescripcion.add(labelDescripcion);
        panelDescripcion.add(textDescripcion);
        panelDown.add(panelDescripcion);

        panelNombreResponsables.setLayout(new GridLayout(2, 1));
        panelNombreResponsables.add(labelNombreResponsables);
        panelNombreResponsables.add(textNombreResponsables);
        panelDown.add(panelNombreResponsables);

        //TAREAS

        panelUp.add(panelCenterLeft);
        panelUp.add(panelCenterRight);
        panelCenter.add(panelUp);
        panelCenter.add(panelDown);

        ItemListener itemListener = new ItemListener() {

            public void itemStateChanged(ItemEvent e) {

            }
        };

        // Abajo
        panelPie.add(buttonAceptar);
        panelPie.add(buttonCancelar);
        panelPie.add(buttonEditar);
        panelPie.add(buttonAnular);
        ventana.add(panelPie, BorderLayout.SOUTH);
        ventana.add(panelCenter, BorderLayout.CENTER);

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    public void limpiar(boolean conf) {
        int rta = !(conf) ? 0 : (JOptionPane.showConfirmDialog(null, "Los datos no fueron guardados. Confirma?", "Confirmacion", JOptionPane.YES_NO_OPTION));
        if (rta == JOptionPane.YES_OPTION) {
            textCodigoOT.setText("");
            textFechaRegistracion.setText("");
            textCantidadRequerida.setText("");
            textFechaFinalizacion.setText("");
            textDescripcion.setText("");
            textNombreResponsables.setText("");
            boxEsUrgente.setSelected(false);
            comboProductos.setSelectedIndex(0);
            comboSupervisor.setSelectedIndex(0);
        }
    }

    public void editable(boolean esEditable) {
        textCodigoOT.setEditable(esEditable);
        textFechaRegistracion.setEditable(esEditable);
        textCantidadRequerida.setEditable(esEditable);
        textFechaFinalizacion.setEditable(esEditable);
        textDescripcion.setEditable(esEditable);
        textNombreResponsables.setEditable(esEditable);
        boxEsUrgente.setEnabled(esEditable);
        comboProductos.setEnabled(esEditable);
        comboSupervisor.setEnabled(esEditable);
        buttonAceptar.setEnabled(esEditable);
        buttonCancelar.setEnabled(esEditable);
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JPanel getPanelPie() {
        return panelPie;
    }

    public void setPanelPie(JPanel panelPie) {
        this.panelPie = panelPie;
    }

    public JPanel getPanelCabecera() {
        return panelCabecera;
    }

    public void setPanelCabecera(JPanel panelCabecera) {
        this.panelCabecera = panelCabecera;
    }

    public JPanel getPanelCenter() {
        return panelCenter;
    }

    public void setPanelCenter(JPanel panelCenter) {
        this.panelCenter = panelCenter;
    }

    public JPanel getPanelCenterLeft() {
        return panelCenterLeft;
    }

    public void setPanelCenterLeft(JPanel panelCenterLeft) {
        this.panelCenterLeft = panelCenterLeft;
    }

    public JPanel getPanelCenterRight() {
        return panelCenterRight;
    }

    public void setPanelCenterRight(JPanel panelCenterRight) {
        this.panelCenterRight = panelCenterRight;
    }

    public JPanel getPanelCodigoOT() {
        return panelCodigoOT;
    }

    public void setPanelCodigoOT(JPanel panelCodigoOT) {
        this.panelCodigoOT = panelCodigoOT;
    }

    public JPanel getPanelFechaRegistracion() {
        return panelFechaRegistracion;
    }

    public void setPanelFechaRegistracion(JPanel panelFechaRegistracion) {
        this.panelFechaRegistracion = panelFechaRegistracion;
    }

    public JPanel getPanelProducto() {
        return panelProducto;
    }

    public void setPanelProducto(JPanel panelProducto) {
        this.panelProducto = panelProducto;
    }

    public JPanel getPanelCantidadRequerida() {
        return panelCantidadRequerida;
    }

    public void setPanelCantidadRequerida(JPanel panelCantidadRequerida) {
        this.panelCantidadRequerida = panelCantidadRequerida;
    }

    public JPanel getPanelFechaFinalizacion() {
        return panelFechaFinalizacion;
    }

    public void setPanelFechaFinalizacion(JPanel panelFechaFinalizacion) {
        this.panelFechaFinalizacion = panelFechaFinalizacion;
    }

    public JPanel getPanelDescripcion() {
        return panelDescripcion;
    }

    public void setPanelDescripcion(JPanel panelDescripcion) {
        this.panelDescripcion = panelDescripcion;
    }

    public JPanel getPanelEsUrgente() {
        return panelEsUrgente;
    }

    public void setPanelEsUrgente(JPanel panelEsUrgente) {
        this.panelEsUrgente = panelEsUrgente;
    }

    public JPanel getPanelNombreResponsables() {
        return panelNombreResponsables;
    }

    public void setPanelNombreResponsables(JPanel panelNombreResponsables) {
        this.panelNombreResponsables = panelNombreResponsables;
    }

    public JPanel getPanelSupervisor() {
        return panelSupervisor;
    }

    public void setPanelSupervisor(JPanel panelSupervisor) {
        this.panelSupervisor = panelSupervisor;
    }

    public JPanel getPanelTareas() {
        return panelTareas;
    }

    public void setPanelTareas(JPanel panelTareas) {
        this.panelTareas = panelTareas;
    }

    public JPanel getPanelUp() {
        return panelUp;
    }

    public void setPanelUp(JPanel panelUp) {
        this.panelUp = panelUp;
    }

    public JPanel getPanelDown() {
        return panelDown;
    }

    public void setPanelDown(JPanel panelDown) {
        this.panelDown = panelDown;
    }

    public JTextArea getTextIntroduccion() {
        return textIntroduccion;
    }

    public void setTextIntroduccion(JTextArea textIntroduccion) {
        this.textIntroduccion = textIntroduccion;
    }

    public JLabel getLabelCodigoOT() {
        return labelCodigoOT;
    }

    public void setLabelCodigoOT(JLabel labelCodigoOT) {
        this.labelCodigoOT = labelCodigoOT;
    }

    public JLabel getLabelFechaRegistracion() {
        return labelFechaRegistracion;
    }

    public void setLabelFechaRegistracion(JLabel labelFechaRegistracion) {
        this.labelFechaRegistracion = labelFechaRegistracion;
    }

    public JLabel getLabelProducto() {
        return labelProducto;
    }

    public void setLabelProducto(JLabel labelProducto) {
        this.labelProducto = labelProducto;
    }

    public JLabel getLabelCantidadRequerida() {
        return labelCantidadRequerida;
    }

    public void setLabelCantidadRequerida(JLabel labelCantidadRequerida) {
        this.labelCantidadRequerida = labelCantidadRequerida;
    }

    public JLabel getLabelFechaFinalizacion() {
        return labelFechaFinalizacion;
    }

    public void setLabelFechaFinalizacion(JLabel labelFechaFinalizacion) {
        this.labelFechaFinalizacion = labelFechaFinalizacion;
    }

    public JLabel getLabelDescripcion() {
        return labelDescripcion;
    }

    public void setLabelDescripcion(JLabel labelDescripcion) {
        this.labelDescripcion = labelDescripcion;
    }

    public JLabel getLabelEsUrgente() {
        return labelEsUrgente;
    }

    public void setLabelEsUrgente(JLabel labelEsUrgente) {
        this.labelEsUrgente = labelEsUrgente;
    }

    public JLabel getLabelNombreResponsables() {
        return labelNombreResponsables;
    }

    public void setLabelNombreResponsables(JLabel labelNombreResponsables) {
        this.labelNombreResponsables = labelNombreResponsables;
    }

    public JLabel getLabelSupervisor() {
        return labelSupervisor;
    }

    public void setLabelSupervisor(JLabel labelSupervisor) {
        this.labelSupervisor = labelSupervisor;
    }

    public JTextField getTextCodigoOT() {
        return textCodigoOT;
    }

    public void setTextCodigoOT(JTextField textCodigoOT) {
        this.textCodigoOT = textCodigoOT;
    }

    public JTextField getTextFechaRegistracion() {
        return textFechaRegistracion;
    }

    public void setTextFechaRegistracion(JTextField textFechaRegistracion) {
        this.textFechaRegistracion = textFechaRegistracion;
    }

    public JComboBox<String> getComboProductos() {
        return comboProductos;
    }

    public void setComboProductos(JComboBox<String> comboProductos) {
        this.comboProductos = comboProductos;
    }

    public JTextField getTextCantidadRequerida() {
        return textCantidadRequerida;
    }

    public void setTextCantidadRequerida(JTextField textCantidadRequerida) {
        this.textCantidadRequerida = textCantidadRequerida;
    }

    public JTextField getTextFechaFinalizacion() {
        return textFechaFinalizacion;
    }

    public void setTextFechaFinalizacion(JTextField textFechaFinalizacion) {
        this.textFechaFinalizacion = textFechaFinalizacion;
    }

    public JTextField getTextDescripcion() {
        return textDescripcion;
    }

    public void setTextDescripcion(JTextField textDescripcion) {
        this.textDescripcion = textDescripcion;
    }

    public JCheckBox getBoxEsUrgente() {
        return boxEsUrgente;
    }

    public void setBoxEsUrgente(JCheckBox boxEsUrgente) {
        this.boxEsUrgente = boxEsUrgente;
    }

    public JTextField getTextNombreResponsables() {
        return textNombreResponsables;
    }

    public void setTextNombreResponsables(JTextField textNombreResponsables) {
        this.textNombreResponsables = textNombreResponsables;
    }

    public JComboBox<String> getComboSupervisor() {
        return comboSupervisor;
    }

    public void setComboSupervisor(JComboBox<String> comboSupervisor) {
        this.comboSupervisor = comboSupervisor;
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

    public JButton getButtonEditar() {
        return buttonEditar;
    }

    public void setButtonEditar(JButton buttonEditar) {
        this.buttonEditar = buttonEditar;
    }

    public JButton getButtonAnular() {
        return buttonAnular;
    }

    public void setButtonAnular(JButton buttonAnular) {
        this.buttonAnular = buttonAnular;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JScrollPane getScrollPaneAux() {
        return scrollPaneAux;
    }

    public void setScrollPaneAux(JScrollPane scrollPaneAux) {
        this.scrollPaneAux = scrollPaneAux;
    }

    public boolean isIngreso() {
        return ingreso;
    }

    public void setIngreso(boolean ingreso) {
        this.ingreso = ingreso;
    }
}
