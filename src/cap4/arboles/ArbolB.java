/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4.arboles;

import utiles.nodos.NodoArbolB;

/**
 *
 * @author David
 */
public class ArbolB {

    private NodoArbolB raiz;

    public boolean esVacia() {
        return raiz == null;
    }

    ///funcion_Insertar
    public void insertar(int nodo1) {
        if (esVacia()) {
            NodoArbolB nuevonodo = new NodoArbolB();
            nuevonodo.dato = nodo1;
            nuevonodo.hijoderecho = new ArbolB();
            nuevonodo.hijoizquierdo = new ArbolB();
            raiz = nuevonodo;
        } else {
            if (nodo1 > raiz.dato) {
                raiz.hijoderecho.insertar(nodo1);
            }
            if (nodo1 < raiz.dato) {
                raiz.hijoizquierdo.insertar(nodo1);
            }
        }
    }
    ///PREORDEN CLASE DEL 23 DE OCT
    public void preorden() {
        if (!esVacia()) {
            System.out.print(raiz.dato + ",");
            raiz.hijoizquierdo.preorden();
            raiz.hijoderecho.preorden();
        }
    }

    ///ORDEN CLASE DEL 23 OCT
    public void order() {
        if (!esVacia()) {
            raiz.hijoizquierdo.order();
            System.out.print(raiz.dato + ",");
            raiz.hijoderecho.order();
        }
    }

    ///POSTORDEN CLASE DEL 23 OCT
    public void postorder() {
        if (!esVacia()) {
            raiz.hijoizquierdo.postorder();
            raiz.hijoderecho.postorder();
            System.out.print(raiz.dato + ",");
        }
    }
    
    //METODO_BUSCAR
}
