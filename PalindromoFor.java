import java.util.Scanner;

public class PalindromoFor {
    public static void main (String[] args) {
        System.out.print("Ingresa el texto: ");
        
        Scanner sc = new Scanner(System.in);
        
        String textoUno = sc.nextLine();
        String textoDos = "";
        
        for (int tamañoTexto = textoUno.length(); tamañoTexto > 0; tamañoTexto--) {
          textoDos += textoUno.substring(tamañoTexto - 1, tamañoTexto);
        }
        
        if (textoUno.equals(textoDos)) {
            System.out.println(textoUno + ": Si es un palindromo");
            
        } else {
            System.out.println(textoUno + ": No es un palindromo");
        }
    }
}
