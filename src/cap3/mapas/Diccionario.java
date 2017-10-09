/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3.mapas;

/**
 *
 * @author David
 */
public class Diccionario<c, v> {

    Mapa<c, v> inicio = new Mapa<>();

    public boolean esVacia() {
        return inicio.getClave() == null;
    }

    //Crear_mi_mapa
    public void agregarMapa(c clave, v valor) {
        Mapa<c, v> nuevo = new Mapa<>(clave, valor);
        if (esVacia()) {
            this.inicio.setClave(clave);
            this.inicio.setValor(valor);
        } else {
            Mapa<c, v> aux = this.inicio;
            while (aux.getSiguiente() != null) {
                if (aux.getClave() != clave) {
                    aux = aux.getSiguiente();
                } else {
                    aux.setValor(valor);
                }
            }
            aux.setSiguiente(nuevo);
        }

    }

    //Metodo_Listar
    
    public void listar(){
        if(!esVacia()){
            Mapa<c,v> aux = this.inicio;
            while(aux != null){
                System.out.println(aux.getClave() + ": " + aux.getValor());
                aux = aux.getSiguiente();
            }
        }
        System.out.println("\t");
    }
    
    //Buscar_Valor_X_Clave
    
    public void buscarValorConClave(c clave){
        if (inicio.getClave()== clave){
            System.out.println(inicio.getClave() + ": " + inicio.getValor());
        } else{
            Mapa<c,v> aux = this.inicio;
            while(aux !=null){
                if(aux.getClave()== clave){
                    System.out.println(aux.getClave() + ": " + aux.getValor());
                }
                aux = aux.getSiguiente();
            }
        }
    }
}
