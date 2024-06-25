// Juego de adivinar el numero secreto

import java.util.Scanner;

public class JuegoNumeroSecreto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Controladores
        int numeroMaximo = 100;
        int numeroSecreto = (int) ((Math.random() * numeroMaximo) + 1); // Numero secreto aleatorio
        int numeroUsuario = 0;
        int cantidadIntentos = 5;
        String resultadoFinal = "";
        
        // Menú de bienvenida
        System.out.println("Bienvenido al juego numero secreto!");
        System.out.println("¡Adivina el numero secreto entre 1 y " + numeroMaximo);
        System.out.println("Tienes " + cantidadIntentos + " intentos!");
        
        // Lógica del juego
        while (cantidadIntentos > 0) {
            System.out.print("Ingresar numero: ");
            numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroSecreto) {
                System.out.println("Acertaste, adivinaste el numero secreto!");
                cantidadIntentos = 0;

            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El numero secreto es menor!");

            } else {
                System.out.println("El numero secreto es mayor!");
            }
            cantidadIntentos--;
        }
        
        // Resultado final
        System.out.println("");
        resultadoFinal = numeroUsuario == numeroSecreto ? "Felicitaciones, Ganaste!" : "Lo siento, Perdiste!"; // Operador ternario
        System.out.println(resultadoFinal);
    }
}
