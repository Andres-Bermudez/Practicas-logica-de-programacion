package lsamsungprincipal;

import lsamsung.LSamsung;
import java.util.Scanner;

public class LSamsungPrincipal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Tu ropa es blanca o de color?");
        System.out.println("1. Ropa blanca");
        System.out.println("2. Ropa de Color");
        int tipoRopa = sc.nextInt();
        
        System.out.println("Kilos de ropa: ");
        int kilosRopa = sc.nextInt();
        
        LSamsung objeto = new LSamsung(kilosRopa, tipoRopa);
        
        objeto.cicloFinalizado();
    }
}
