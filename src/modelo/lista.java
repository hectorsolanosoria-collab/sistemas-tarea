/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

public class lista {
    private ArrayList<trabajo> lista;

    public lista() {
        lista = new ArrayList<>();
    }

    public void agregar(trabajo t) {
        lista.add(t);
    }

    public ArrayList<trabajo> getLista() {
        return lista;
    }

    public trabajo buscarPorCodigo(String codigo) {
        for (trabajo t : lista) {
            if (t.getCodigo().equals(codigo)) {
                return t;
            }
        }
        return null;
    }

    public void eliminar(String codigo) {
        lista.removeIf(t -> t.getCodigo().equals(codigo));
    }
}
