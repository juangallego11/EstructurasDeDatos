/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap2.listas;

import estructurasdedatos.utiles.nodos.NodoSimple;

/**
 *
 * @author David
 */
public class ListaSimple {

    private NodoSimple cabeza;
    private NodoSimple cola;

    //Metodo Crear Lista
    public void crearlista() {

        this.cabeza = null;
        this.cola = null;

    }

    //Metodo para saber si la cola esta vacia
    public boolean esvacia() {
        return cabeza == null;
    }

    //Metodo Insertar en el Inicio
    public void insertaraInicio(int valor) {

        NodoSimple nodo = new NodoSimple();
        nodo.setDato(valor);
        if (esvacia()) {
            this.cabeza = nodo;
            this.cola = nodo;
        } else {
            nodo.setSiguiente(cabeza);
            this.cabeza = nodo;
        }

    }
    //Metodo Insertar Al Final

    public void insertarFinal(int valor) {

        NodoSimple nodo1 = new NodoSimple();
        nodo1.setDato(valor);
        if (esvacia()) {
            this.cabeza = nodo1;
            this.cola = nodo1;
        } else {
            NodoSimple aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo1);
            this.cola = nodo1;
        }
    }

    //Metodo Listar
    public void listar() {
        if (!esvacia()) {
            NodoSimple aux = cabeza;
            while (aux != null) {
                System.out.print("[" + aux.getDato() + "]" + "->");
                aux = aux.getSiguiente();
            }
            System.out.println("null");
        }

    }
    
    //Metodo Borrar
    public void borrar(int valor){
        if(valor == cabeza.getDato()){
            this.cabeza = cabeza.getSiguiente();
        }else{
            NodoSimple aux = cabeza;
            while(aux.getSiguiente().getDato() != valor){
                aux= aux.getSiguiente();
            }
           NodoSimple auxsig = aux.getSiguiente().getSiguiente();
           aux.setSiguiente(auxsig);
        }
        
    }
}
