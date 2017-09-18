/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author David
 */
public class NodoSimple {

    /**
     * @return the siguiente
     */
    public NodoSimple getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
    private NodoSimple siguiente;
    private int dato;
}
