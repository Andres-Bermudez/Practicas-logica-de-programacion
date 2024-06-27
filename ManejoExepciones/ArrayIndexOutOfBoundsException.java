import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          String[] names = {"Andres", "Josue", "Natalia", "Laura"};

          System.out.print("Position: ");
          int position = sc.nextInt();

          try {
               System.out.println("Name: " + names[position]);
               
          } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("This position does not exist!");
          }
     }
}
