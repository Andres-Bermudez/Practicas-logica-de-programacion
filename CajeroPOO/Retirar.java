package cursojavaintermedio;

public class Retirar extends ClaseUno {
    
    @Override
    public void transaccion() {
        System.out.print("¿Cuanto dinero deseas retirar?: $");
        retirar();
        
        if (dineroRetiro > getSaldo()) {
            System.out.println("-------------------");
            System.out.println("Saldo Insuficiente!");
            System.out.println("-------------------");
            
        } else {
            nuevoSaldo = getSaldo();
            setSaldo(nuevoSaldo - dineroRetiro);
            
            System.out.println("--------------------------------");
            System.out.println("Retiraste: $" + dineroRetiro);
            System.out.println("Tu saldo actual es: $" + getSaldo());
            System.out.println("--------------------------------");
        }
    }
}
