/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 6;
        /*  int numero;
        do {
            System.out.println("Introduce un número");
            numero = sc.nextInt();
            System.out.printf("El número introducido es %d%n", numero);
            num--;
        } while (num > 0);
         */
        double nota;
        double acumulador = 0;
        do {
            System.out.println("Introduce una nota");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                nota = 0.0;
            } else {
            }
            acumulador += nota;
            num--;
        } while (num > 0);
        
        System.out.printf("La media del ciclo es: %.2f%n",acumulador/6);
                
    }

}
