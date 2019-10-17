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
public class EstructuraSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota");
        int nota = sc.nextInt();

        switch (nota) {
            case 0:
                System.out.println("Tu nota es 0");
                break;
            case 1:
                System.out.println("Tu nota es 1");
                break;
            case 2:
                System.out.println("Tu nota es 2");
                break;
            case 3:
                System.out.println("Tu nota es 3");
                break;
            case 4:
                System.out.println("Tu nota es 4");
                break;
            case 5:
                System.out.println("Tu nota es 5");
                break;
            case 6:
                System.out.println("Tu nota es 6");
                break;
            case 7:
                System.out.println("Tu nota es 7");
                break;
            case 8:
                System.out.println("Tu nota es 8");
                break;
            case 9:
                System.out.println("Tu nota es 9");
                break;
            case 10:
                System.out.println("Tu nota es 10");
                break;
            default:
                System.out.println("Nota introducida no válida");

                String palabra = "HoLA";
                switch (palabra.toLowerCase()) {
                    case "hola":
                        System.out.println("Está entrando");
                        break;
                    case "adios":
                        System.out.println("Está saliendo");
                        break;
                }

        }

    }

}
