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
public class EstructuraFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 9999;
        int acumulador = 0;
        int veces;
        System.out.println("¿Cuántos números quieres introducir?");
        veces=sc.nextInt();
        for (int i = 1; i <= veces; i++) {
            System.out.printf("Dime  número %d%n", i);
            int numero = sc.nextInt();
            acumulador += numero;
            if (numero > max) {
                max = numero;
                
            }
            if (numero < min) {
                min = numero;
            }
        }
        double media = acumulador / 10;
        System.out.printf("La media es %.2f %n", media);
        System.out.printf("El máximo es %d %n",max);
         System.out.printf("El mínimo es %d %n",min);
    }
}
