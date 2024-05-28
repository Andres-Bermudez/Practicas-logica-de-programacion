import java.util.Scanner;
 
public class RegistroUsuarios {
    static String[] usuarios = {"vacio", "vacio", "vacio", "vacio", "vacio"};
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. Registrarse");
            System.out.println("2. Mostrar usuarios registrados");

            String seleccion = sc.nextLine();

            switch(seleccion) {
                case "1":
                    registroUsuario();
                    break;
                    
                case "2":
                    mostrarUsuarios();
                    break;
                    
                default:
                    System.out.println("Seleccion Incorrecta");
            }
        }
    }
    
    static void registroUsuario() {
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre de usuario: ");
        String nombreUsuario = sc2.nextLine();
        
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals("vacio")) {
                usuarios[i] = nombreUsuario;
                System.out.println("Usuario Registrado con exito");
                System.out.println("------------------------------------------------------");
                break;   
            }
        }
    }
    
    static void mostrarUsuarios(){
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Indice " + i + ": " + usuarios[i]);
        }
    }
}
