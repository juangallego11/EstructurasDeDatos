/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3.mapas;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author David
 */
public class TablaHash {

    public String[] arreglo;
    int tama;
    int contador;

    public TablaHash(int tam) {
        tama = tam;
        arreglo = new String[tam];
        Arrays.fill(arreglo, "-1");

    }

    public TablaHash() {

    }

    public void miFuncionHash(String[] cadenaArreglo, String[] arreglo) {
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento) % 7;
            System.out.println("El indice es " + indiceArreglo + " para el valor  " + elemento);
            while (arreglo[indiceArreglo] != "-1") {
                indiceArreglo++;
                System.out.println("Hay una colision en el indice  " + (indiceArreglo - 1)
                        + " cambiar a  " + indiceArreglo);
                indiceArreglo %= tama;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }

    public void listar() {
        int aumentar = 0, i, j;
        
        for (i = 0; i < 1; i++) {
            aumentar +=8;

            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = aumentar - 8; j < aumentar; j++) {
                System.out.format("| %3s" + " ", j);
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();

            for (j = aumentar - 8; j < aumentar; j++) {
                if (arreglo[j].equals("-1")) {
                    System.out.print("|   ");
                } else {
                    System.out.print(String.format("| %3s" + " ", arreglo[j]));
                }
            }
            System.out.println("|");
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
 