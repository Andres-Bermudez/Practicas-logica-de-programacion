/*
 * Reto No. 4
 * Escribe un programa que se encargue de comprobar si un n&uacute;mero es o no primo.
 * Hecho esto, imprime los n&uacute;meros primos entre 1 y 100.
 *
 * Resultado:
 * 1. Si ejecutas el programa llamando al metodo printPrimeNumbers(), se imprimen los numeros
 *    primos del 1 al 100.
 *
 *    Asi: Mi resultado: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 55, 59, 61, 65, 67, 71, 73, 77, 79, 83, 85, 89, 91, 95, 97,
 *         Resutado esperado: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
 *
 * Linea 27 y 28
 *
 * 2. Si se ejecuta el programa llamando los demas metodos, se podra hacer una verificacion
 *    numero por numero de forma manual. Desde la linea 19 hasta la 23.
 */

public class Main {
    public static void main(String[] args) {

        /*
        while (true) {
            NumeroPrimo num = new NumeroPrimo();
            num.inputData();
            num.verifiedNumber();
        }
        */

        NumeroPrimo num = new NumeroPrimo();
        num.printPrimeNumbers();

    }
}