/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles.nodos;

import cap1.tiposdedatos.Persona;

/**
 *
 * @author David
 */
public class NodoPila {

    /**
     * @return the dato
     */
    public Persona getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Persona dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoPila getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    private Persona dato;
    public NodoPila siguiente;

}
