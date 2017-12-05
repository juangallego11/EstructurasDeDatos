/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import cap1.complejidad.Ciclos;
import cap1.complejidad.Condicionales;
import cap1.tiposdedatos.Persona;
import cap2.arreglos.Vector;
import cap2.listas.Cola;
import cap2.listas.ListaDoble;
import cap2.listas.ListaSimple;
import cap2.listas.Pila;
import cap3.mapas.Diccionario;
import cap3.tablahash.TablaHash;
import cap4.arboles.ArbolAVL;
import cap4.arboles.ArbolB;
import cap5.grafos.Grafo;
import estructurasdedatos.cap2.arreglos.Matriz;
import utiles.nodos.NodoArbolAVL;
import utiles.nodos.NodoArbolB;

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
        /*Matriz mimatriz = new Matriz();
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
        mimatriz.eliminar(2,0, 0);
        mimatriz.listar();*/
        //Prueba Vector
        /*Vector mivector = new Vector();
        mivector.crearvec(4);
        mivector.insertar(0, "juan");
        mivector.insertar(1, "david");
        mivector.insertar(2, "gallego");
        mivector.insertar(3, "rangel");
        mivector.listar();
        mivector.actualizar(0, "Juan");
        mivector.listar();
        mivector.borrar(2);
        mivector.listar();*/
        //Prueba ListaSimple
        /*ListaSimple milis = new ListaSimple();
       milis.crearlista();
       milis.insertaraInicio(8);
       milis.insertaraInicio(2);
       milis.insertarFinal(4);
       milis.listar();
       milis.borrar(8);
       milis.listar();*/
        //Prueba Lista_doble
        /*ListaDoble milist = new ListaDoble();
        milist.Crearlist();
        milist.Insertarini(2);
        milist.Listar();
        milist.Insertarfin(23);
        milist.Insertarini(5);
        milist.Listar();*/
        //Prueba Estructura Cola
        /* Cola colaa = new Cola();
        
        colaa.crearCola();
        colaa.encolar(2);
        colaa.listar();
        colaa.desencolar();
        colaa.listar();
        colaa.encolar(3);
        colaa.listar();
        colaa.encolar(6);
        colaa.listar();
        colaa.desencolar();*/
        //Prueba de La Estructura pila
        /*Pila mipila = new Pila();
       
       mipila.apilar("juan", "315", "6677", "jjns");
       mipila.listar();
       mipila.apilar("david", "347", "627", "876");
       mipila.listar();*/
        //Prueba de la Estructura Mapa
        /*Diccionario diccio = new Diccionario();
       diccio.agregarMapa("Escritorio", "Mueble constituido por un tablero para escribir y cajones");
       diccio.agregarMapa("Lapiz", "implemento para escribir");
       diccio.agregarMapa("computador", "dispositivo para todos los ingenieros de sistemas");
       //diccio.buscarValorConClave("Escritorio");
       //diccio.buscarValorConClave("Lapiz");
       diccio.buscarValorConClave("computador");*/
        
        //Prueba Tabla hash
        /*TablaHash mitabla = new TablaHash(8);
       String[] elementos = {"20", "33", "21", "10"};
       mitabla.miFuncionHash(elementos, mitabla.arreglo);
       mitabla.listar();*/
        
        
        //PRUEBA Arbol
        /*ArbolB nuevo = new ArbolB();
        nuevo.insertar(12);
        nuevo.insertar(23);
        nuevo.insertar(10);
        nuevo.insertar(14);
        nuevo.insertar(7);
        nuevo.insertar(19);

        nuevo.preorden();
        System.out.println("<------ preorden");
        nuevo.postorder();
        System.out.println("<------ postorden");
*/
        
        //Prueba TablaHashDavid
        /*TablaHash tabla = new TablaHash();
        tabla.crearvector(2000);
        tabla.insertar(9000, "JuanGallego");
        tabla.insertar(6000, "LeandroGallego");
        tabla.insertar(5000, "DavidGallego");
        tabla.listar();*/
        
        //PruebaArbolAvl
        
    /* ArbolAVL arbol = new ArbolAVL();
     NodoArbolAVL arbol1 = new NodoArbolAVL(50);
     
     arbol.insertar(50);
     arbol.insertar(34);
     arbol.insertar(43);
     arbol.insertar(23);
     arbol.insertar(30);
     //arbol.rotarDD(arbol1);
    */
     
     //Prueba Grafos1
     
     Grafo migrafo = new Grafo(8);
     migrafo.insertaArista(4, 6, 2);
     migrafo.insertaArista(3, 5, 2);
     migrafo.insertaArista(3, 2, 1);
     migrafo.insertaArista(2, 7, 5);
     //migrafo.existeArista(4, 6);
     migrafo.mostrarGrafo();
     
     
        
        
        
        
    }
}
