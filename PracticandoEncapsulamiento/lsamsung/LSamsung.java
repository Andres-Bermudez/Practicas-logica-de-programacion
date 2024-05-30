package lsamsung;
/*
 * Ejercicio para practicar Encapsulamiento en Java:
 *
 * Requerimientos: Samsung solicita el desarrollo de una clase programada
 * en Java, para el funcionamiento logico de su nueva linea de lavadoras,
 * misma que puedan implementar sus programadores de manera sencilla en 
 * en los programas desarrollados de Samsung con las siguientes caracteristicas:
 *
 * 1. Debe recibir los kilos de ropa y tipo de ropa a travez de argumentos.
 * 2. Debe realizar las funciones de llenado de agua, lavado y secado.
 * 3. La clase debe estar correctamente encapsulada, para evitar que los
 *    programadores de Samsung utilicen metodos o variables que no son necesarios.
 * 4. El unico metodo disponible para importar, debe ser cicloFinalizado().
*/

public class LSamsung {
    // Estas dos varibales almacenan los datos que vienen de la clase principal
    private int kilosRopa = 0;
    private int tipoRopa = 0;
    
    // Estas variables almacenan el estado de cada proceso de la lavadora
    private int llenado = 0;
    private int lavado = 0;
    private int secado = 0;
    
    // Metodo constructor que recibe los datos enviados desde la clase principal
    public LSamsung(int kilosRopa, int tipoRopa) {
        this.kilosRopa = kilosRopa;
        this.tipoRopa = tipoRopa;
    }
    
    // Este metodo ejecuta el llenado de la lavadora
    private void llenadoAgua() {
        if (kilosRopa <= 12) {
            System.out.println("Llenando...");
            llenado = 1;
            System.out.println("¡Llenado Completo!");
            
        } else {
            System.out.println("¡Sobrepasaste el limite de peso!");
        }
    }
    
    // Este metodo inicia el lavado de la ropa
    private void lavadoRopa() {
        llenadoAgua();
        
        if (llenado == 1) {
            if (tipoRopa == 1) {
                System.out.println("Lavando ropa blanca o delicada");
                System.out.println("lavando suavemente....");
                lavado = 1;
                System.out.println("¡Lavado completado!");
                
            } else if (tipoRopa == 2) {
                System.out.println("Lavado de ropa normal");
                System.out.println("Lavando.....");
                lavado = 1;
                System.out.println("!Lavado completado¡");
                
            } else {
                System.out.println("Opcion no disponible!");
                lavado = 1;
                System.out.println("Lavando ropa normal!");
            }
        }
    }
    
    // Este metodo realiza el secado de ropa
    private void secadoRopa() {
        lavadoRopa();
        
        if (lavado == 1) {
            System.out.println("Secando tu ropa....");
            secado = 1;
            System.out.println("Tu ropa esta seca!");
        }
    }
    
    // Este metodo verifica y le comunica al usuario si su ropa ya esta lista
    public void cicloFinalizado() {
        secadoRopa();
        
        if (secado == 1) {
            System.out.println("Ciclo finalizado, tu ropa esta lista! :)");
        }
    }
}
