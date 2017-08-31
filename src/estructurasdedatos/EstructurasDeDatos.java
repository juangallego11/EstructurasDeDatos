/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import cap1.complejidad.Ciclos;
import cap1.complejidad.Condicionales;
import cap1.tiposdedatos.Persona;


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
        //Condicionales con = new Condicionales();
        //con.SumaImpares();
        //con.SumaPares();
        //con.numerosentreintervalo();
    
        
        //PRUEBA CLASE PERSONA
        
        Persona people=new Persona();
        people.setNombre("David");
        people.setDireccion("Barajas");
        people.setCedula("767687");
        people.setTelefono("657686");
        
        System.out.println("nombre: "+people.getNombre()+"\n"+"direccion: "+people.getDireccion()+"\n"+"cedula: "
                +people.getCedula()+"\n"+"telefono: "+people.getTelefono());
        
    }
    
}
