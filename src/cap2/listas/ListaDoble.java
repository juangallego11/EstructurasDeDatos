/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap2.listas;

import utiles.nodos.NodoDoble;

/**
 *
 * @author David
 */
public class ListaDoble {
    
    private NodoDoble cabeza;
    private NodoDoble cola;

    //METODO CREAR LISTA
    public void Crearlist() {
        this.cabeza = null;
        this.cola = null;
    }

    //COMPROBAR SI LA LISTA ESTA VACIA
    public boolean esVacia() {
        return cabeza == null;
    }
    // INSERTAR AL INICIO

    public void Insertarfin(int dato) {
        NodoDoble nodo1 = new NodoDoble();
        nodo1.setDato(dato);
        if (this.cabeza == null) {
            this.cabeza = nodo1;
            this.cola = nodo1;
        } else {
            NodoDoble aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo1);
            nodo1.setAnterior(aux);
        }
    }

    //INSERTAR AL FINAL
    public void Insertarini(int dato) {
        NodoDoble nodo2 = new NodoDoble();
        nodo2.setDato(dato);
        if (esVacia()) {
            this.cabeza = nodo2;
            this.cola = nodo2;
        } else {
            nodo2.setSiguiente(cabeza);
            cabeza.setAnterior(nodo2);
        }
    }

    //METODO IMPRIMIR
    public void Listar() {
        if (!esVacia()) {
            NodoDoble aux = cabeza;
            while (aux != null) {
                System.out.print("[" + aux.getDato() + "]");
                aux = aux.getSiguiente();
            }
            System.out.println("null");
        } else {
        }
    }
 //METODO BORRAR
    public void Borrar(int dato){
        if(esVacia()){
            NodoDoble aux = cabeza;
            NodoDoble ant = null;
            while(aux != null){
                if(aux.getDato() == dato){
                    if(ant == null){
                        this.cabeza = cabeza.getSiguiente();
                        aux.setSiguiente(ant);
                        aux = cabeza;
                    }else{
                        ant.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(null);
                        aux = ant.getSiguiente();
                        }
                    }else{
                    ant = aux;
                    aux = aux.getSiguiente();
                }
            }
        }
    }
}
