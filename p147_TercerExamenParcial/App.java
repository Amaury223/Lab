package p147_TercerExamenParcial;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

public class App extends JFrame implements ActionListener {
    ArrayList<Jugador> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercade;
    JDialog jdlAcercade;
    JLabel lblDatos;
    JTable table;
    JScrollPane spane;
    DefaultTableModel modelo;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JLabel lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblDescripcion, lblSalario;
    JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    JButton btnAgregar, btnGrabar;
    JFileChooser fchArchivo;

    public App() {
        super("Procesa datos de jugadores");
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        smnAbrir = new JMenuItem("Abrir");
        mnuArchivo.add(smnAbrir);
        smnAbrir.addActionListener(this);
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        mnuArchivo.add(new JSeparator());
        smnSalir = new JMenuItem("Salir");
        mnuArchivo.add(smnSalir);
        smnSalir.addActionListener(this);
        smnAcercade = new JMenuItem("Acerca de ...");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);

        jdlAcercade = new JDialog(this, "Acerca de ...");
        jdlAcercade.setSize(400, 250);
        jdlAcercade.setModal(true);
        jdlAcercade.setLocationRelativeTo(null);
        lblDatos = new JLabel(
                "<html>Programación Orientada a Objetos I<br>Sebastian Guerra Hernandez<br>sebas@uaz.edu.mx</html>",
                JLabel.CENTER);
        lblDatos.setFont(new Font("Arial", Font.BOLD, 18));
        jdlAcercade.add(lblDatos);

        setLayout(new GridLayout(3, 1));
        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        getContentPane().add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] { "Nombre", "Edad", "Sexo", "EstadoCivil", "Descripcion", "Salario" });
        table.setModel(modelo);

        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(6, 2, 0, 0));
        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblSexo = new JLabel("Sexo");
        lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);
        lblEstadoCivil = new JLabel("Estado Civil");
        lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEstadoCivil = new JTextField();
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);
        lblDescripcion = new JLabel("Descripción");
        lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        lblSalario = new JLabel("Salario");
        lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);

        // Toma el renglón
        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });

        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    }

    public void mostrarDatos(int ren) { 
        if (ren >= 0) { 
            txtNombre.setText(modelo.getValueAt(ren, 0).toString()); 
        txtEdad.setText(modelo.getValueAt(ren, 1).toString()); 
        txtSexo.setText(modelo.getValueAt(ren, 2).toString()); 
        txtEstadoCivil.setText(modelo.getValueAt(ren, 3).toString()); 
        txtDescripcion.setText(modelo.getValueAt(ren, 4).toString()); 
        txtSalario.setText(modelo.getValueAt(ren, 5).toString()); 
        btnGrabar.setEnabled(true);
    }
}
