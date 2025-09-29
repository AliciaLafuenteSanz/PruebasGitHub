package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("hola sofi");
        System.out.print("Hola Ali");
        System.out.print("Nueva rama");
        System.out.println("Despues del merge");
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿En que año naciste?:");
        int edad = teclado.nextInt();
        System.out.println("Tienes/vas a tener "+(2025-edad)+" años");
    }
}
