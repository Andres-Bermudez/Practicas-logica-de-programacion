public class Rottweiler extends Perro {

    public Rottweiler() {
    }

    public Rottweiler(String nombre, String raza, String color, int edad, int peso, int altura, int esperanzaVida) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.esperanzaVida = esperanzaVida;
    }

    // Comportamiento propio de un Rottweiler
    protected void proteger() {
        System.out.println("Perro listo para atacar si es necesario!");
    }

    @Override
    public void ladrar() {
        System.out.println("---------------------------------");
        System.out.println("Ladrando: Grrr Guau Guau Grrrr!");
        System.out.println("---------------------------------");
    }
}
