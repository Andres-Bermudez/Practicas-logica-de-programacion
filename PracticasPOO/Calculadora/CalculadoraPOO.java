import java.util.Scanner;

public class CalculadoraPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
        
        String seleccionUsuario = sc.nextLine();
        
        if (seleccionUsuario.equals("0")) {
            System.exit(0);
        }
        
        System.out.print("Ingresa el primer valor: ");
        double primerValor = sc.nextDouble();
        
        System.out.print("Ingresa el segundo valor: ");
        double segundoValor = sc.nextDouble();
        
        Operaciones objeto = new Operaciones(primerValor, segundoValor, seleccionUsuario);
        
        objeto.mostrarResultado();
    }
}
