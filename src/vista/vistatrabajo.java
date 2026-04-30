/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;

public class vistatrabajo extends JFrame {

    public JTextField txtCodigo, txtTitulo, txtCurso, txtFecha;
    public JComboBox<String> cbEstado;
    public JButton btnAgregar, btnBuscar, btnEliminar, btnEstado;
    public JTextArea area;

    public vistatrabajo() {
        setTitle("Gestión de Tareas");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 20, 100, 25);
        panel.add(lblCodigo);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(20, 60, 100, 25);
        panel.add(lblTitulo);

        JLabel lblCurso = new JLabel("Curso:");
        lblCurso.setBounds(20, 100, 100, 25);
        panel.add(lblCurso);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(20, 140, 100, 25);
        panel.add(lblFecha);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setBounds(20, 180, 100, 25);
        panel.add(lblEstado);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 20, 150, 25);
        panel.add(txtCodigo);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(120, 60, 150, 25);
        panel.add(txtTitulo);

        txtCurso = new JTextField();
        txtCurso.setBounds(120, 100, 150, 25);
        panel.add(txtCurso);

        txtFecha = new JTextField();
        txtFecha.setBounds(120, 140, 150, 25);
        panel.add(txtFecha);

        cbEstado = new JComboBox<>();
        cbEstado.addItem("Pendiente");
        cbEstado.addItem("En proceso");
        cbEstado.addItem("Completada");
        cbEstado.setBounds(120, 180, 150, 25);
        panel.add(cbEstado);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(20, 220, 100, 30);
        panel.add(btnAgregar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(140, 220, 100, 30);
        panel.add(btnBuscar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(260, 220, 100, 30);
        panel.add(btnEliminar);

        btnEstado = new JButton("Estado");
        btnEstado.setBounds(380, 220, 100, 30);
        panel.add(btnEstado);

        area = new JTextArea();
        area.setBounds(20, 260, 460, 80);
        panel.add(area);

        add(panel);
    }
}
