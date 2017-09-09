/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap1.complejidad;

/**
 *
 * @author David
 */
public class Ciclos {
    
    //Constructor
    public Ciclos(){}
    
    //numeros del 1 al 100
    public void Nro1al100(){
        int i=0;
        while(i <= 100){
           System.out.println(i);
            i++;
        }
    }   
    
        //Metodo numeros del 100 al 1
    public void Nr100al1 (){
        int i;
        for(i=100; i>=1; i--){
            System.out.println(i);
        }
    }
    
    //Metodo Suma de los numeros del 1 al 100
    
    public void Suma1al100(){
        int suma;
        suma=0;
        
        for(int i=1;i<=100; i++){
            suma+=i;
        }
        System.out.println(suma);
    }
    
    //Metodo Numeros pares del 1 al 100

    public void Pares(){
        int x;
        for(x=1; x<100; x++ ){
            if(x%2 == 0){
                System.out.println(x);
            
            }
        }
        
    }
    
}
