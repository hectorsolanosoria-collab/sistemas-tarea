/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;
import vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tareacontrolador implements ActionListener {

    private vistatrabajo vista;
    private lista modelo;

    public tareacontrolador(vistatrabajo vista, lista modelo) {
        this.vista = vista;
        this.modelo = modelo;

        vista.btnAgregar.addActionListener(this);
        vista.btnBuscar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.btnEstado.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnAgregar) {

            String codigo = vista.txtCodigo.getText();

            if (codigo.isEmpty()) {
                vista.area.append("Error: campos vacíos\n");
                return;
            }

            if (modelo.buscarPorCodigo(codigo) != null) {
                vista.area.append("Error: código repetido\n");
                return;
            }

            String titulo = vista.txtTitulo.getText();
            String curso = vista.txtCurso.getText();
            String fecha = vista.txtFecha.getText();
            String estado = vista.cbEstado.getSelectedItem().toString();

            trabajo t = new trabajo(codigo, titulo, curso, fecha, estado);
            modelo.agregar(t);

            vista.area.append("Agregado: " + codigo + "\n");
        }

        if (e.getSource() == vista.btnBuscar) {
            trabajo t = modelo.buscarPorCodigo(vista.txtCodigo.getText());

            if (t != null) {
                vista.area.append("Encontrado: " + t.getTitulo() + "\n");
            } else {
                vista.area.append("No encontrado\n");
            }
        }

        if (e.getSource() == vista.btnEliminar) {
            modelo.eliminar(vista.txtCodigo.getText());
            vista.area.append("Eliminado\n");
        }

        if (e.getSource() == vista.btnEstado) {
            trabajo t = modelo.buscarPorCodigo(vista.txtCodigo.getText());

            if (t != null) {
                t.setEstado(vista.cbEstado.getSelectedItem().toString());
                vista.area.append("Estado actualizado\n");
            }
        }
    }
}
