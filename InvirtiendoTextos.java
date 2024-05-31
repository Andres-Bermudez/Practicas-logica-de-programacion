/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

import java.util.Scanner;

public class InvirtiendoTextos {
    public static void main (String[] args) {
        System.out.print("Ingresa el texto: ");
        
        Scanner sc = new Scanner(System.in);
        
        String textoOriginal = sc.nextLine();
        String textoInvertido = "";
        
        int tamañoTexto = textoOriginal.length();
            
        while (tamañoTexto > 0) {
            textoInvertido += textoOriginal.substring(tamañoTexto - 1, tamañoTexto);
            tamañoTexto--;
        }
        
        System.out.println("Texto Invertido: " + textoInvertido);
    }    
}
