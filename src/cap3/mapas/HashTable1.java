/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3.mapas;



/**
 *
 * @author David Gallego
 */
public class HashTable1 {

     private Mapa2[] tablahash;
    private Mapa2 dato;
    private int tam;

    public void crearvector(int t) {
        this.tam = t;
        this.tablahash = new Mapa2[tam];
    }

    public int funcionhash(int valor) {
        int vecht[] = new int[7];
        int num = valor;
        int pos;
        for (int i = 0; i < 10; i++) {
            int rest = num % 10;
            num = num / 10;
            vecht[i] = rest;
        }
        pos = vecht[0] + vecht[1] + vecht[2];
        pos = pos * pos;
        if (this.tablahash[pos] == null) {
            return pos;
        } else {
            while (this.tablahash[pos] != null) {
                if (pos < this.tam) {
                    pos = pos + 1;
                } else {
                    pos = 0;
                }
            }
            return pos;
        }
    }

    public boolean insertar(int llave, String valor) {
        Mapa2 nuevo = new Mapa2();
        nuevo.setLlave(llave);
        nuevo.setValor(valor);
        int posicion = this.funcionhash(llave);
        this.tablahash[posicion] = nuevo;
        return true;
    }

    public void listar() {

        for (int i = 0; i < tam; i++) {
            if (this.tablahash[i] != null) {
                System.out.println("El dato " + this.tablahash[i].getLlave()
                        + " esta ubicado en la posicion " + i + " de la tabla hash");
            }
        }
    }

    public void buscar(int dato) {
        if (tablahash[0].getLlave() == dato) {
            System.out.println("el dato " + dato + " esta en la posicion " + "0");
        } else {
            for(int i=1; i < tam; i++){
                if (tablahash[i].getLlave() == dato) {
                    System.out.println("el dato" + dato + "esta en la posicion " + i);
                }
                
            }
           
        }
    }

    public void eliminarPorPosicion(int pos) {
        tablahash[pos] = null;
        System.out.println("el dato de la posicion " + pos + " ha sido eliminada");
    }

}
