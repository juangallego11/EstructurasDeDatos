/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3.mapas;

/**
 *
 * @author david
 */
public class Mapa<c, v> {

    /**
     * @return the clave
     */
    public c getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(c clave) {
        this.clave = clave;
    }

    /**
     * @return the valor
     */
    public v getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(v valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public Mapa<c, v> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Mapa<c, v> siguiente) {
        this.siguiente = siguiente;
    }
    //como este tipo de estructura necesita un tipo de dato, declaramos y,v

    private c clave;
    private v valor;
    private Mapa<c, v> siguiente;

    public Mapa(c clave, v valor){
        this.clave = clave;
        this.valor = valor;
    }
    
    Mapa(){
        
    }
    
}
