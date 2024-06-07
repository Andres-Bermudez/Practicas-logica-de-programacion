package cursojavaintermedio;

public class ConsultarSaldo extends ClaseUno {
    
    @Override
    public void transaccion() {
        System.out.println("--------------------------------------");
        System.out.println("Tu saldo actual es: $" + getSaldo());
        System.out.println("--------------------------------------");
    }
}
