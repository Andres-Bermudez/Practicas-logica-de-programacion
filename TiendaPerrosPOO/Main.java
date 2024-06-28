/*
 * Ejemplo de POO aplicando los 4 pilares fundamentales:
 * Abstraccion
 * Encapsulamiento
 * Herencia
 * Polimorfismo
*/
public class Main {

    public static void main(String[] args) {

        Rottweiler p1 = new Rottweiler("Nico", "Rottweiler", "Negro con Amarillo", 2, 45, 95, 15);
        System.out.println(p1.toString());
        p1.ladrar();
        p1.proteger();

        System.out.println("------------------------------------------------------------------------------");

        Chihuahua p2 = new Chihuahua("Cleo", "Chihuahua", "Blanco", 1, 1, 25, 15);
        System.out.println(p2.toString());
        p2.ladrar();
        p2.darAmor();
    }
}