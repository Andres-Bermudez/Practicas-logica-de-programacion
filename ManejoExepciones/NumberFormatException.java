public class NumberFormatException {

     public static void main(String[] args) {
          String number = "546ef";

          try {
               System.out.println(Integer.parseInt(number));

          } catch (NumberFormatException e) {
               System.out.println("Unable to convert this item, format error!");
          }
     }
}
