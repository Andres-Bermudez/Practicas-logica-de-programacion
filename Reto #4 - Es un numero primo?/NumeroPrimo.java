/*
 * Reto No. 4
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

import java.util.Scanner;

public class NumeroPrimo {
    private int number;

    Scanner sc = new Scanner(System.in);

    public void inputData() {
        int counter = 0;

        while (counter == 0) {
            System.out.print("Enter the number: ");
            number = sc.nextInt();

            if (number > 0) {
                counter = 1;

            } else {
                System.out.println("Incorrect Option!");
            }
        }
    }

    public void verifiedNumber() {
        int squareRoot = (int)(Math.sqrt(number));
        String resultSqrt = "";

        if (number < 2) {
            System.out.println("Not");

        } else if (number == 2 || number == 3) {
            System.out.println("Yes");

        } else if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("Not");

        } else {
            for (int i = squareRoot; i <= squareRoot; i += 2) {
                if (number % i != 0) {
                    resultSqrt = "Yes";

                } else {
                    resultSqrt = "Not";
                }
            }
            System.out.println(resultSqrt);
        }
    }

    public void printPrimeNumbers() {
        for (int i = 1; i <= 100; i++) {
            int squareRoot = (int)(Math.sqrt(i));

            if (i < 2) {
                // Do Nothing

            } else if (i == 2 || i == 3) {
                System.out.print(i + ", ");

            } else if (i % 2 == 0 || i % 3 == 0) {
                // Do Nothing

            } else {
                for (int x = squareRoot; x <= squareRoot; x += 2) {
                    if (i % x != 0) {
                        System.out.print(i + ", ");

                    } else {
                        // Do Nothing
                    }
                }
            }
        }
    }
}

