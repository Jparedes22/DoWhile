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
public class MinimoComunMultiplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre 0 y 100");
        int num1 = sc.nextInt();
        System.out.println("Introduce un número inferior al anterior"
                + " entre 0 y 100");
        int num2 = sc.nextInt();
        double multiplo;
        int multi = 0;
        int nNum2;
        if (num1 < 0 || num1 > 100 || num2 < 0 || num2 > 100) {
            System.out.println("Número erróneo");

        } else {
            do {
                multi++;
                nNum2 = num2 * multi;
                multiplo = num1 % nNum2;
            } while (multiplo != 0);
            System.out.printf("El numero %d es mcm %n", nNum2);
        }
    }
}
