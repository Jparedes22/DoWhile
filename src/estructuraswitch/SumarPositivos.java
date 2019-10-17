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
public class SumarPositivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int acumulador = 0;
        do {
            System.out.println("Introduce un número");
            num = sc.nextInt();
            acumulador += num;
        } while (num != 0);
        System.out.printf("La suma de los número es %d%n", acumulador);

    }
}
