public abstract class Perro {
    // Atributos
    protected String nombre;
    protected String raza;
    protected String color;
    protected int edad;
    protected int peso;
    protected int altura;
    protected int esperanzaVida;

    // Constructor vacio
    public Perro() {
    }

    // Constructor con parametros
    public Perro(String nombre, String raza, String color, int edad, int peso, int altura, int esperanzaVida) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.esperanzaVida = esperanzaVida;
    }

    // Metodos comunes
    protected void comer() {
        System.out.println("El perro esta comiendo!");
    }

    protected void dormir() {
        System.out.println("El perro esta durmiendo!: Zzzz");
    }

    protected void jugar() {
        System.out.println("El perro esta jugando!");
    }

    // Metodo Abstracto
    public abstract void ladrar();

    // Sobreescritura del metodo toString(), para obtener una representacion de nuestro objeto.
    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n" +
                "Raza: " + raza + "\n" +
                "Color: " + color + "\n" +
                "Edad: " + edad + " año(s)" + "\n" +
                "Peso: " + peso + " Kg" + "\n" +
                "Altura: " + altura + " Cm" + "\n" +
                "Esperanza de vida: " + esperanzaVida + " año(s)";
    }
}
