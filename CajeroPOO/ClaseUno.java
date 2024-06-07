package cursojavaintermedio;

import java.util.Scanner;

public abstract class ClaseUno {

    protected int dineroRetiro;
    protected int dineroDeposito;
    protected int nuevoSaldo;
    private static int saldo;

    Scanner sc = new Scanner(System.in);

    public void menu() {
        String seleccionUsuario = "";
        int contador = 0;

        do {
            do {
                System.out.println("Por favor selecciona una opcion: ");
                System.out.println("      1. Consulta de saldo");
                System.out.println("      2. Retiro de efectivo");
                System.out.println("      3. Deposito de efectivo");
                System.out.println("      0. Salir");

                seleccionUsuario = sc.nextLine();

                if (seleccionUsuario.equals("1") || seleccionUsuario.equals("2") || 
                    seleccionUsuario.equals("3") || seleccionUsuario.equals("0")) {
                    
                    contador = 1;

                } else {
                    System.out.println("------------------------------------------");
                    System.out.println("Eleccion Incorrecta, intentalo nuevamente!");
                    System.out.println("------------------------------------------");
                }

            } while (contador == 0);

            switch (seleccionUsuario) {
                case "1":
                    ClaseUno objetoTres = new ConsultarSaldo();
                    objetoTres.transaccion();
                    break;

                case "2":
                    ClaseUno objeto = new Retirar();
                    objeto.transaccion();
                    break;

                case "3":
                    ClaseUno objetoDos = new Depositar();
                    objetoDos.transaccion();
                    break;

                case "0":
                    System.out.println("-------------------------------------------------");
                    System.out.println("Gracias por usar nuestros servicios!");
                    System.out.println("-------------------------------------------------");
                    contador = 2;
                    break;
            }

        } while (contador != 2);
    }

    public void retirar() {
        dineroRetiro = sc.nextInt();
    }

    public void depositar() {
        dineroDeposito = sc.nextInt();
    }

    public abstract void transaccion();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
