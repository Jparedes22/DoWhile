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
public class Binarios {

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número en base 10");
        numero = sc.nextInt();
        int valor=numero;
        int resto;
        String conversion = "";
        String resulNum="";
           do{
            resto= numero%2;
            numero=numero/2;
            conversion=resto+conversion;
            System.out.println(resto);
        }while(numero!=1);
        System.out.println(numero+conversion);
         numero=valor;
      do{
            resto= numero%8;
            numero=numero/8;
            conversion=resto+conversion;
            System.out.println(resto);
        }while(numero>7);
        System.out.println(numero+conversion);
         
        do {
            resto = numero % 16;
            numero = numero / 16;
            conversion = resto + conversion;
            System.out.println(resto);
         if (numero >=10&&numero<=17){
             switch(resto){
                 case 10:
                     resulNum="A";
                     break;
         }
         
        }
        
        
        
        
        
        
        

    }
}
