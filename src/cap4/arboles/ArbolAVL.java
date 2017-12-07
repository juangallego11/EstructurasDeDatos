/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4.arboles;

import utiles.nodos.NodoArbolAVL;

/**
 *
 * @author Gallego
 */
public class ArbolAVL {

    private NodoArbolAVL raiz;

    public ArbolAVL() {
        this.raiz = null;
    }

    public NodoArbolAVL obteneRaiz() {
        return raiz;
    }

    //Factor de Equilibrio
    public int Fe(NodoArbolAVL d) {
        if (d == null) {
            return -1;
        } else {
            return d.getFe();
        }
    }
//NodoPrincipal(si es null crea la raiz, si no, lo inserta en un subarbol)
    
    public void insertar(int i) {
        NodoArbolAVL aux = new NodoArbolAVL(i);
        if (this.obteneRaiz() == null) {
            this.setRaiz(aux);
            System.out.println("Se Ha Creado La Raiz");
        } else {
            this.setRaiz(insertarN(aux, this.obteneRaiz()));
        }
    }
    
    //FuncionInsertaer
    
    public NodoArbolAVL insertarN(NodoArbolAVL nuevo, NodoArbolAVL subArbol) {
        NodoArbolAVL padre = subArbol;
        System.out.print(" Dato = " + nuevo.getDato());

        if (subArbol == null) {
            System.out.println("Creando Hijo = ");
            subArbol = nuevo;
            return subArbol;
        } else {
            System.out.println("  --> SubArbol = " + subArbol.getDato());
        }
        if (nuevo.getDato() < subArbol.getDato()) {
            System.out.println("");
            System.out.println("Dato Menor Que Raiz");
            if (subArbol.gethIzq() == null) {
                subArbol.sethIzq(nuevo);
            } else {
                subArbol.sethIzq(insertarN(nuevo, subArbol.gethIzq()));
                if ((Fe(subArbol.gethIzq()) - Fe(subArbol.gethDer()) == 2)) {
                    if (nuevo.getDato() < subArbol.gethIzq().getDato()) {
                        padre = rotarII(subArbol);
                    } else {
                        padre = rotarID(subArbol);
                    }
                }
            }
            return subArbol;
        } else if (nuevo.getDato() > subArbol.getDato()) {
            if (subArbol.gethDer() == null) {
                subArbol.sethDer(nuevo);
            } else {
                subArbol.sethDer(insertarN(nuevo, subArbol.gethDer()));
                if ((Fe(subArbol.gethDer()) - Fe(subArbol.gethIzq()) == 2)) {
                    if (nuevo.getDato() > subArbol.gethDer().getDato()) {
                        padre = rotarDD(subArbol);

                    } else {
                        padre = rotarDI(subArbol);
                    }
                }
            }
            return subArbol;

        } else {
            System.out.println("El Nodo ya Existe");
        }
        if ((subArbol.gethIzq() == null) && (subArbol.gethDer() != null)) {
            subArbol.setFe(subArbol.gethDer().getFe() + 1);
        } else if ((subArbol.gethDer() == null) && (subArbol.gethIzq() != null)) {
            subArbol.setFe(subArbol.gethIzq().getFe() + 1);
        } else {
            subArbol.setFe(Math.max(Fe(subArbol.gethIzq()), Fe(subArbol.gethDer())) + 1);
        }
        return padre;
    }

    public void setRaiz(NodoArbolAVL raiz) {
        this.raiz = raiz;
    }

    //Rotaciones
    
    //IZQ-IZQ
    public NodoArbolAVL rotarII(NodoArbolAVL n) {
        NodoArbolAVL aux = n.gethIzq();
        n.sethIzq(aux.gethDer());
        aux.sethDer(n);
        n.setFe(Math.max(Fe(n.gethIzq()), Fe(n.gethDer())) + 1);
        aux.setFe(Math.max(Fe(aux.gethIzq()), Fe(aux.gethDer())) + 1);
        return aux;
    }
    //DER-DER
    public NodoArbolAVL rotarDD(NodoArbolAVL n) {
        NodoArbolAVL aux = n.gethDer();
        n.sethDer(aux.gethIzq());
        aux.sethIzq(n);
        n.setFe(Math.max(Fe(n.gethIzq()), Fe(n.gethDer())) + 1);
        aux.setFe(Math.max(Fe(aux.gethIzq()), Fe(aux.gethDer())) + 1);
        return aux;
    }
    //IZQ-DER
    public NodoArbolAVL rotarID(NodoArbolAVL n) {
        NodoArbolAVL aux;
        n.sethIzq(rotarDD(n.gethDer()));
        aux = rotarII(n);
        return aux;
    }
    //DER-IZQ
    public NodoArbolAVL rotarDI(NodoArbolAVL n) {
        NodoArbolAVL aux;
        n.sethDer(rotarII(n.gethDer()));
        aux = rotarDD(n);
        return aux;
    }

}
