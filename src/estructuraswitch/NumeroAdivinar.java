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
public class NumeroAdivinar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int) (Math.random() * 20);
        System.out.println("Dime un número");
        int numero = sc.nextInt();
        int numero1;
        int veces=1;
        int veces2=1;

        if (numero == n) {
            System.out.println("Enhorabuena, has acertado");
        } else {
            do {
                System.out.println("Inténtalo de nuevo");
                numero1 = sc.nextInt();
                veces++;
            } while (numero1 != n);
            System.out.printf("Enhorabuena, has acertado después de %d intentos",veces);
        }
        int n2 = (int) (Math.random() * 20);
        int numero2= sc.nextInt();
        if (numero2 == n2) {
            System.out.println("Enhorabuena, has acertado");
        } else {
            do {
                System.out.println("Inténtalo de nuevo");
                System.out.println("Dime otro número");
                numero2 = sc.nextInt();
                veces2++;
            } while (numero2 != n2);
            if(veces2<veces){
                System.out.printf("Enhorabuena, has acertado en %d intentos y has superado el record",veces2);
            }else{
                System.out.printf("Enhorabuena, has acertado en %d intentos "
                        + "pero no has superado el record",veces2);
            }
        }
        
        
        
    }
}
