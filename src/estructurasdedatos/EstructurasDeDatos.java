/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import cap1.complejidad.Ciclos;
import cap1.complejidad.Condicionales;
import cap1.tiposdedatos.Persona;
import estructurasdedatos.cap2.arreglos.Matriz;


/**
 *
 * @author tusk
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        
        //Prueba Ciclos
        
        /*Ciclos ci = new Ciclos();
        ci.Nro1al100();
        ci.Nr100al1();
        ci.Suma1al100();
        ci.Pares();*/
        
        //Prueba Condicionales
        /*Condicionales con = new Condicionales();
        con.SumaImpares();
        con.SumaPares();
        con.numerosentreintervalo();*/
    
        
        //PRUEBA CLASE PERSONA
        
        /*Persona people=new Persona();
        people.setNombre("David");
        people.setDireccion("Barajas");
        people.setCedula("767687");
        people.setTelefono("657686");
        
        System.out.println("nombre: "+people.getNombre()+"\n"+"direccion: "+people.getDireccion()+"\n"+"cedula: "
                +people.getCedula()+"\n"+"telefono: "+people.getTelefono());*/
        
        
        
        //PRUEBA MARTRIZ
        Matriz mimatriz = new Matriz();
        mimatriz.crear(3, 3);
        mimatriz.insertar(0, 0, 4);
        mimatriz.insertar(0,1, 3);
        mimatriz.insertar(0,2, 1);
        mimatriz.insertar(1,0, 8);
        mimatriz.insertar(1,1, -2);
        mimatriz.insertar(1,2, 7);
        mimatriz.insertar(2,0, 2);
        mimatriz.insertar(2,1, 5);
        mimatriz.insertar(2,2, 0);
        mimatriz.listar();
    }
    
}
