public class Operaciones {
    private double primerValor;
    private double segundoValor;
    private double resultado;
    private String seleccionUsuario;
    
    public Operaciones(double primerValor, double segundoValor, String seleccionUsuario) {
        this.primerValor = primerValor;
        this.segundoValor = segundoValor;
        this.seleccionUsuario = seleccionUsuario;
    }
    
    private void suma() {
        resultado = primerValor + segundoValor;
    }
    
    private void resta() {
        resultado = primerValor - segundoValor;
    }
    
    private void multiplicacion() {
        resultado = primerValor * segundoValor;
    }
    
    private void division() {
        if (segundoValor == 0) {
            System.out.println("No es posible dividir entre 0");
            System.exit(0);
            
        } else {
            resultado = primerValor / segundoValor;
        }
    }
    
    public void mostrarResultado() {
        switch(seleccionUsuario) {
            case "1":
                suma();
                System.out.println("El resultado es: " + resultado);
                break;
            case "2":
                resta();
                System.out.println("El resultado es: " + resultado);
                break;
            case "3":
                multiplicacion();
                System.out.println("El resultado es: " + resultado);
                break;
            case "4":
                division();
                System.out.println("El resultado es: " + resultado);
                break;
            default:
                System.out.println("Eleccion Incorrecta");
        }
    }
}

