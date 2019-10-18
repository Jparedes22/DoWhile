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
public class MenuSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcionSalida = "e";
        String opcion;
        System.out.println("Bienvenido a la aplicación del menú");
        System.out.println("a.Menú General");
        System.out.println("b.Menú de Audio");
        System.out.println("c.Menú de Vídeo");
        System.out.println("d.Controles");
        System.out.println("e.Salir");
        System.out.println("Introduce la letra del menú al que quieras acceder");
        opcion = sc.next();

        switch (opcion.toLowerCase()) {

            case "a":
                System.out.println("La opcion seleccionada es: A");
                System.out.println("Accediendo a Menú General");
                break;
            case "b":
                System.out.println("La opcion seleccionada es: B");
                System.out.println("Accediendo a Menú de Audio");
                break;
            case "c":
                System.out.println("La opcion seleccionada es: C");
                System.out.println("Accediendo a Menú de Vídeo");
                break;
            case "d":
                System.out.println("La opcion seleccionada es: D");
                System.out.println("Accediendo a Controles");
                break;
            case "e":
                System.out.println("La opcion seleccionada es: E");
                System.out.println("Saliendo del menú");
                break;
            default:
                System.out.println("Opción no contemplada");
                do{
                    System.out.println("Introduce otra letra");
                    opcion=sc.next();
                    
                }while(!opcion.equalsIgnoreCase(opcionSalida));
                     
        }

    }

}
