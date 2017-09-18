/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap2.arreglos;

/**
 *
 * @author David
 */
public class Vector {

    private int tama;
    private String[] vector;

    //Metodo Crear Vector
    public void crearvec(int tam) {
        this.tama = tam;
        if (this.vector == null) {
            this.vector = new String[this.tama];
        } else {
            System.out.println("No se puedo crear el vector");
        }

    }

    //Metodo Insertar
    public void insertar(int pos, String dato) {
        if (pos < tama) {
            vector[pos] = dato;
        } else {
            System.out.println("Posicion No Valida");
        }
    }

    //Metodo Borrar
    public void borrar(int pos) {
        vector[pos] = "";
    }

    //Metodo Listar
    public void listar() {
        if (this.vector == null) {
            System.out.println("El vector esta vacio");
        } else {
            for (int i = 0; i < tama; i++) {
                System.out.println(i + "." + vector[i]);
            }
        }
    }

    //Metodo Actualizar
    public void actualizar(int pos, String dato) {
        if (pos < tama) {
            vector[pos] = dato;
        }else{
            System.out.println("Posicion no valida");
        }
    }
}
