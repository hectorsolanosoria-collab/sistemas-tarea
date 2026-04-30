/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import vista.vistatrabajo;
import modelo.lista;
import controlador.tareacontrolador;

public class main {
    public static void main(String[] args) {

        vistatrabajo vista = new vistatrabajo();
        lista modelo = new lista();

        tareacontrolador controlador = new tareacontrolador(vista, modelo);

        vista.setVisible(true);
    }
}