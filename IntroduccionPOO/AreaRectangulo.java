/*
 * Esta clase contiene la logica del programa
 * Aqui se procesan los datos para calcular el area del rectangulo
*/

public class AreaRectangulo {
    // Variables de instancia
    private int longitudBase;
    private int longitudAltura;
    private int areaTotal;
    
    // Creacion del metodo constructor que recibe los datos ingresados en la clase Rectangulo
    public AreaRectangulo(int valorBase, int valorAltura) {
        this.longitudBase = valorBase;
        this.longitudAltura = valorAltura;
    }
    
    // Metodo que hace la operacion para calcular el area
    public void area() {
        areaTotal = longitudBase * longitudAltura;
    }
    
    // Metodo que nos muestra en pantalla el resultado
    public void mostrarResultado() {
        area();
        System.out.println("Area: " + areaTotal);
    }
}
