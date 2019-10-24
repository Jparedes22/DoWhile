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
public class MenuBases {

    public static void main(String[] args) {
        int numero;
        String conversion = "";
        String resulNum = "";
        String opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el número en base 10");
            numero = sc.nextInt();
            int valor = numero;
            int resto;
            if (numero < 0) {
                System.out.println("Introduce un número válido");
            } else {
                System.out.println("a.Pasar a Base2");
            }
            System.out.println("b.Pasar a Base8");
            System.out.println("c.Pasar a Base16");
            System.out.println("d.Salir");
            System.out.println("Introduce la letra de la operación que quieras"
                    + " realizar ");
            opcion = sc.next();

            switch (opcion.toLowerCase()) {
                case "a":
                    
                        do {
                            resto = numero % 2;
                            numero = numero / 2;
                            conversion = resto + conversion;
                            System.out.println(resto);
                        } while (numero != 1);
                        System.out.println(numero + conversion);
                        break;
                        
                      case "b":
                do {
                    resto = numero % 8;
                    numero = numero / 8;
                    conversion = resto + conversion;
                    System.out.println(resto);
                } while (numero > 7);
                 System.out.println(numero + conversion);

                break;
            case "c":
do {
            resto = numero % 16;
            numero = numero / 16;
            conversion = resto + conversion;
            if (resto >= 10) {
                switch (resto) {
                    case 10:
                        resulNum = "A";
                        break;
                    case 11:
                        resulNum = "B";
                        break;
                    case 12:
                        resulNum = "C";
                        break;
                    case 13:
                        resulNum = "D";
                        break;
                    case 14:
                        resulNum = "E";
                        break;
                    case 15:
                        resulNum = "F";
                        break;
                }
                conversion = resulNum + conversion;

            } else {
                conversion = resto + conversion;
            }
        } while (numero > 15);
        System.out.println(numero + resulNum);
                break;

        
                    
        
            
            }  }while (!opcion.equalsIgnoreCase("d"));
            System.out.println("Apagando calculadora");
        
    }
}