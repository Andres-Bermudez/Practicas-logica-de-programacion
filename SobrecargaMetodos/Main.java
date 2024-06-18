/*
 * Practica de Sobrecarga de metodos
 *
 * ¿Que es?
 *
 * Es una caracteristica que tiene Java que nos permite declarar varios metodos
 * con el mismo nombre que ejecutan un proceso similar, pero que se diferencia en el tipo,
 * la cantidad y el orden de los parametros.
 */

public class Main {

    public static void main (String[] args) {

        SobrecargaMetodos obj = new SobrecargaMetodos();
        obj.setNombreFigura("Figura 1");

        obj.crearFigura();

        obj.crearFigura("Cuadrado");

        obj.crearFigura("Rectangulo", 25, 32);
    }
}
