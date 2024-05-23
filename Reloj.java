/*
 * Practica de de logica de programacion;
 * El algoritmo genera segundo a segundo una cantidad de horas
 * que designemos.
*/
public class Reloj {
    static int horas = 0;
    static int minutos = 0;
    static int segundos = 0;

    public static void main(String[] args) {
        System.out.println("Hora Inicial: " + horas + ":" + minutos + ":" + segundos);
        iniciarReloj();
    }

    public static void iniciarReloj() {
        while (horas < 2) {
            segundos += 1;
            System.out.println("Hora Actual: " + horas + ":" + minutos + ":" + segundos);

            if (segundos == 59) {
                minutos += 1;

                if (minutos == 60) {
                    minutos = 0;
                    horas += 1;
                }

                segundos = 0;
                System.out.println("Hora Actual: " + horas + ":" + minutos + ":" + segundos);
            }
        }
    }
}
