/*
 * Algoritmo que genera una serie Fibonacci
 * 0,1,1,2,3,5,8,13,21,34
*/

public class SerieFibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        
        while (c < 34) {
            if (c == 0) {
                System.out.print(a + ", " + b + ", ");
                
            } else if (c == 34) {
                System.out.println(c);
                break;
            }
            
            c = a + b;
            System.out.print(c + ", ");
            
            a = b;
            b = c;
        }
    }
}
