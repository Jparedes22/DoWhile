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
public class MenuCalculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicación de cálculo");
        System.out.println("Introduce el primer operando");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo operando");
        int num2 = sc.nextInt();
        System.out.println("a.Sumar");
        System.out.println("b.Restar");
        System.out.println("c.Multiplicar");
        System.out.println("d.Dividir");
        System.out.println("e.Módulo");
        System.out.println("f.Salir");
        System.out.println("Introduce la letra del menú al que quieras acceder");
        String opcion = sc.next();

        switch (opcion.toLowerCase()) {
            case "a":
                int suma = num1 + num2;
                System.out.println(suma);
                break;
            case "b":
                int resta = num1 - num2;
                System.out.println(resta);
                break;
            case "c":
                int multi = num1 * num2;
                System.out.println(multi);
                break;
            case "d":
                int divi = num1 / num2;
                System.out.println(divi);
                break;
            case "e":
                int multiplo = num1 % num2;
                System.out.println(multiplo);
                break;
            case "f":
                System.out.println("Apagando calculadora");
                break;
            default:
                do {
                    System.out.println("Introduce una opción válida");
                    opcion = sc.next();
                } while (!opcion.equalsIgnoreCase("f"));

                System.out.println("Saliendo...");
                System.out.println("Si quiere salir introduzca una f, sino "
                        + "culaquier otra tecla");
                opcion = sc.next();
                if (opcion.equalsIgnoreCase("f")) {
                    System.out.println("Saliendo...");
                } else {
                    System.out.println("Introduce un operando");
                    num1 = sc.nextInt();
                    System.out.println("Introduce otro operando");
                    num2 = sc.nextInt();
                    System.out.println("a.Sumar");
                    System.out.println("b.Restar");
                    System.out.println("c.Multiplicar");
                    System.out.println("d.Dividir");
                    System.out.println("e.Módulo");
                    System.out.println("f.Salir");
                    System.out.println("Introduce la letra del menú al que quieras acceder");
                    opcion = sc.next();
                    switch (opcion.toLowerCase()) {
                        case "a":
                            suma = num1 + num2;
                            System.out.println(suma);
                            break;
                        case "b":
                            resta = num1 - num2;
                            System.out.println(resta);
                            break;
                        case "c":
                            multi = num1 * num2;
                            System.out.println(multi);
                            break;
                        case "d":
                            divi = num1 / num2;
                            System.out.println(divi);
                            break;
                        case "e":
                            multiplo = num1 % num2;
                            System.out.println(multiplo);
                            break;
                        case "f":
                            System.out.println("Apagando calculadora...");
                            break;
                        default:
                            do {
                                System.out.println("Introduce una opción válida");
                                opcion = sc.next();
                            } while (!opcion.equalsIgnoreCase("f"));
                    }
                }
        }
    }
}
