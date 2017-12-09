/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap2.listas;

/**
 *
 * @author David
 */
public class ColaPrioritaria{
    //Mis_Atributos
    private Cola colaA;
    private Cola colaB;
    private Cola prioritaria;

    public void crearcolas() {
        this.colaA = new Cola();
        this.colaB = new Cola();
        this.prioritaria = new Cola();
    }

    //Hacer cola segun su prioridad 
    public void hacercola(int cedula, int prio) {
        if (prio == 0) {
            if (colaA.size() < colaB.size()) {
                this.colaA.encolar(cedula);
            } else {
                this.colaB.encolar(cedula);
            }
        } else {
            this.prioritaria.encolar(cedula);

        }
    }
    //Metodo Atender teniendo en cuenta la cola con prioridad
    public void atender(){
        Cola aux= new Cola();
        for(int i = 0; i<=prioritaria.size(); i++){
            prioritaria.desencolar();
        }
        if(prioritaria.size() == 0){
            colaA.desencolar();
            colaB.desencolar();
        }
    }

    //Metodo listar para imprimir las 3 colas creadas
    public void listar() {
        System.out.println("cola A:");
        colaA.listar();
        System.out.println("\n");
        System.out.println("cola B");
        colaB.listar();
        System.out.println("\n");
        System.out.println("cola prioritaria");
        prioritaria.listar();
        System.out.println("\n");
    }
    
}
