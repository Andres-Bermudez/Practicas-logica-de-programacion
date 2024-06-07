package cursojavaintermedio;

public class Depositar extends ClaseUno {
    
    @Override
    public void transaccion() {
        System.out.print("¿Cuanto dinero vas a depositar?: $");
        depositar();
        
        if (dineroDeposito > 0) {
            nuevoSaldo = getSaldo();
            setSaldo(nuevoSaldo + dineroDeposito);
            
            System.out.println("-----------------------------------");
            System.out.println("Despositaste: $" + dineroDeposito);
            System.out.println("Tu saldo actual es: $" + getSaldo());
            System.out.println("-----------------------------------");
            
        } else {
            System.out.println("Debes depositar una cantidad mayor a 0 pesos");
        }
    }
}
