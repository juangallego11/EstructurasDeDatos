/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.arreglos;

/**
 *
 * @author David
 */
public class Matriz {
    
    //Mis atributos
    
    private int matriz[][];
    private int filas;
    private int columnas;
    
    //Metodo Crear La Matriz
    
    public void crear(int fila, int columna){
    
        this.filas = fila;
        this.columnas = columna;
        matriz = new int [fila][columna];
    }
    
    //Metodo Para Insertar Matriz
    
    public void insertar(int f, int c, int num){
    if(f> filas && c>columnas){
        System.out.println("ESTA POSICION NO ES VALIDA");
    } else {
            this.filas = f;
            this.columnas = c;
            this.matriz[f][c]= num; 
        }
    }
    
    //Metodo Listar
    
    public void listar ()
    {
        for(int f = 0; f<matriz.length; f++){
        for(int c = 0; c< matriz[f].length; c++){
            System.out.print(matriz[f][c]+"\t"); 
        }
            System.out.println(" ");
            }
   
        }
}
