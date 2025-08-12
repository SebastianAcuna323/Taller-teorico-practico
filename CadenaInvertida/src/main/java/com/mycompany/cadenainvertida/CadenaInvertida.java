
package com.mycompany.cadenainvertida;

import java.util.Scanner;

public class CadenaInvertida {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
        StringBuilder inversa = new StringBuilder();
        System.out.println("Ingrese una palabra");
        String palabra = entrada.nextLine();
        int longitud = palabra.length();
        
        
        for (int i = longitud -1; i >= 0; i--) {
            inversa.append(palabra.charAt(i));
        }
         
        System.out.println(inversa.toString());
    }
}
