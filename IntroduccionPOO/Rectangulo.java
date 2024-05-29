/*
 * Introduccion a la Programacion Orientada a Objetos - POO
 * Realizar un programa que calcule el area de un rectangulo.
 * Importante hacerlo con POO
 *
 * Conocimientos adquiridos: Uso de modificadores de acceso(public, private).
 *                           Tipos de retorno(palabra "void").
 *                           Instancia de clases: Cuando hacemos que 2 clases interactuen entre si. 
 *                           Variables de instancia: variables que estan fuera de culaquier metodo o bloque
*/

// Importacion de la libreria Scanner para tomar datos desde teclado
import java.util.Scanner;

// Esta clase toma los datos y los lleva a la clase AreaRectangulo y alli se procesan

public class Rectangulo {
    public static void main(String[] args) {
        // Objeto tipo Scanner
        Scanner entradaUsuario = new Scanner(System.in);
        
        // Especie de menu
        System.out.print("Ingresa la longitud de la base del rectangulo: ");
        int base = entradaUsuario.nextInt(); // Declarando la variable base
        
        System.out.print("Ingresa la longitud de la altura del rectangulo: ");
        int altura = entradaUsuario.nextInt(); // Declarando la variable altura
        
        // Objeto que lleva los datos ingresados hacia la clase AreaRectangulo
        AreaRectangulo objeto = new AreaRectangulo(base, altura);
        
        // Llamamos el metodo que creamos, mostrarResultado()
        objeto.mostrarResultado();
    }
}
