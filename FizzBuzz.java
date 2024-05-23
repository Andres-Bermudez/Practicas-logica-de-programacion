/*
 * Ejercicio FizzBuzz:
 * El algoritmo genera los numeros del 1 al 100
 * Aquellos numeros que son multiplos de 3 los intercambia por "Fizz"
 * los numeros que son multiplos de 5 los intercambia por "Buzz"
 * y los que son multiplos de 3 y de 5 al mismo tiempo los intercambia por "FizzBuzz"
*/

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
                
            } else if (i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Buzz");
                }
                
            } else {
                System.out.println(i);
            }
        }
    }
}
