/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles.nodos;

/**
 *
 * @author David
 */
public class NodoArbolAVL {

    /**
     * @return the hIzq
     */
    public NodoArbolAVL gethIzq() {
        return hIzq;
    }

    /**
     * @param hIzq the hIzq to set
     */
    public void sethIzq(NodoArbolAVL hIzq) {
        this.hIzq = hIzq;
    }

    /**
     * @return the hDer
     */
    public NodoArbolAVL gethDer() {
        return hDer;
    }

    /**
     * @param hDer the hDer to set
     */
    public void sethDer(NodoArbolAVL hDer) {
        this.hDer = hDer;
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

    /**
     * @return the fe
     */
    public int getFe() {
        return fe;
    }

    /**
     * @param fe the fe to set
     */
    public void setFe(int fe) {
        this.fe = fe;
    }

    private NodoArbolAVL hIzq;
    private NodoArbolAVL hDer;
    private int dato;
    private int fe;
    
    public NodoArbolAVL(int dato) {
        this.dato = dato;
        this.hIzq = null;
        this.hDer = null;
        this.dato = dato;
        this.fe = 0;
    }
    
}
