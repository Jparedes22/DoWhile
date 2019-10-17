/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraswitch;

/**
 *
 * @author Usuario DAM 1
 */
public class MayorNumero {

    public static void main(String[] args) {
        int n;
        int max = 0;

        do {
            n = (int) (Math.random() * 100);
            if(n!=0){
                System.out.println(n);
            }
            if (n > max) {
                max = n;
            }
        } while (n != 0);
        System.out.printf("El máximo es: %d%n",max);
    }
}
