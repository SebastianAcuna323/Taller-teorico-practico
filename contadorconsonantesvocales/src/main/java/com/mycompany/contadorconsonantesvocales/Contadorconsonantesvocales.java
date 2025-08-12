
package com.mycompany.contadorconsonantesvocales;

import java.util.Scanner;


public class Contadorconsonantesvocales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String palabra;
        
        int contador1 = 0, contador2 = 0, consonantes;
        
        System.out.println("Ingrese una palabra");
        
        palabra = entrada.nextLine().toLowerCase();
        
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c >= 'a' && c <= 'z') { 
                contador1++;
            }
        }
        
        for (int i = 0; i < palabra.length(); i++) {
            if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e')|| (palabra.charAt(i)=='i')|| 
                    (palabra.charAt(i)=='o')|| (palabra.charAt(i)=='u')) {
                contador2++;
            }
        }
        
        consonantes = contador1-contador2;
        System.out.println("La palabra " + palabra + " contiene " + contador2 + " vocales");
        System.out.println("La palabra " + palabra + " contiene " + consonantes + " consonantes");
        
    }
}
