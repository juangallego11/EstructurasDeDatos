/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap1.complejidad;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Condicionales1 {

    public Condicionales1() {
    }

    // Suma de los numeros impares del 1 al 100
    public void SumaImpares() {
        int suma;
        suma = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        System.out.println(suma);
    }

    //Suma de los numeros pares del 1 al 100 y decir cuantos hay
    public void SumaPares() {
        int suma = 0;
        int cont = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                suma += i;
                cont++;
            }
        }
        System.out.println("La suma es  " + suma);
        System.out.println("Hay " + cont + " numeros pares");
    }

    
    //Imprimir los numeros entre un intervalo dado
    public void numerosentreintervalo() {
        int num1, num2, b;

        System.out.println("Introduzca primer número:");
        Scanner n1 = new Scanner(System.in);
        num1 = n1.nextInt();
        System.out.println("Introduzca segundo número:");
        Scanner n2 = new Scanner(System.in);
        num2 = n2.nextInt();

        if (num1 > num2) {
            System.out.println("Los valores introducidos no son correctos");
        } else {
            for (b = num1; b <= num2; b++) {
                System.out.println(b);
            }
        }
    }

}
