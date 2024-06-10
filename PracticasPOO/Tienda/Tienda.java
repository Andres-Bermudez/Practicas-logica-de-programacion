
import java.util.Scanner;

public class Tienda {
    protected int seleccion; // Eleccion del usuario

    // Listado de productos
    protected String[] productos = {"Celulares", "Laptops", "Televisores", "Neveras", "Lavadoras"};

    // Productos por categoria
    protected String[] celulares = {"Samsung", "Iphone", "Motorola"};
    protected String[] laptops = {"Dell", "Lenovo", "Asus"};
    protected String[] televisores = {"Samsung", "Challenger", "Panasonic"};
    protected String[] neveras = {"Haceb", "LG", "Mabe"};
    protected String[] lavadoras = {"Electrolux", "Whirpool", "Siemens"};

    // Precios por categoria
    protected String[] preciosCelulares = {"$900.000", "$5'000,000", "$1'200.000"};
    protected String[] preciosLaptops = {"$2'300.000", "$2'400.000", "$2'500,000"};
    protected String[] preciosTelevisores = {"$2'200.000", "$1'900.000", "$2'600.000"};
    protected String[] preciosNeveras = {"$1'800.000", "$2'000.000", "$2'200.000"};
    protected String[] preciosLavadoras = {"$1'300.000", "$1'400.000", "$1'100.000"};

    Scanner sc = new Scanner(System.in);

    // Menu de bienvenida de la tienda
    public void menu() {
        System.out.println("Bienvenido a la tienda!");
        System.out.println("1. Comprar");
        System.out.println("0. Salir");
    }

    // Catalogo de productos
    public void comprar() {
        System.out.println("Que deseas comprar:");

        for (int i = 0; i < productos.length; i++) {
            System.out.println(i + 1 + ". " + productos[i]);
        }
    }

    // Opcion Salir
    public void salir() {
        System.out.println("Gracias por visitarnos!");
        System.exit(0);
    }

    // Recopilacion de la eleccion del usuario
    public void seleccionUsuario() {
        seleccion = sc.nextInt();
    }
}
