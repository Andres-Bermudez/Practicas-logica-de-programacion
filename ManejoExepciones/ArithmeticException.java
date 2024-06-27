import java.util.Scanner;

public class ArithmeticException {
     static int firstValue;
     static int secondValue;
     static int result;

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the first value: ");
          firstValue = sc.nextInt();

          System.out.print("Enter the second value: ");
          secondValue = sc.nextInt();
          
          operation();
     }

     public static void operation() {
          // Manejo de la excepcion "ArithmeticException", porque no es posible dividir entre 0.
          try {
               result = firstValue / secondValue;
               System.out.println("The result is: " + result);
               
          } catch (ArithmeticException e) {
               System.out.println("It is not possible to divide by 0");
          }
     }
}
