import java.util.Scanner;

public class PalindromoWhile {
    public static void main (String[] args) {
        System.out.print("Ingresa el texto: ");
        
        Scanner sc = new Scanner(System.in);
        
        String textoUno = sc.nextLine();
        String textoDos = "";
        
        int tamañoTexto = textoUno.length();
            
        while (tamañoTexto > 0) {
          textoDos += textoUno.substring(tamañoTexto - 1, tamañoTexto);
          tamañoTexto--;
        }
        
        if (textoUno.equals(textoDos)) {
            System.out.println(textoUno + ": Si es un palindromo");
            
        } else {
            System.out.println(textoUno + ": No es un palindromo");
        }
    }
}
