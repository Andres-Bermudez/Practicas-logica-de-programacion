/*
 * Ejercicio #3 de los retos de programacion de MourevDev
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        
        System.out.print(a + ", ");
        System.out.print(b + ", ");
        
        for(int i = 0; i < 48; i++) {
            c = a + b;
            a = b;
            b = c;
            
            System.out.print(c + ", ");
        }
    }
}

// Resultado:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, ...... etc
