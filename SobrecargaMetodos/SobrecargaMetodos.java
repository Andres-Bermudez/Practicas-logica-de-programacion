public class SobrecargaMetodos {

    // Atributo
    private String nombreFigura;
    
    // Metodos
    // Declaracion de un metodo vacio;
    public void crearFigura() {
        System.out.println("Creando una figura llamada " + nombreFigura);
    }
    
    // Declaracion del mismo metodo con un parametro de tipo String;
    public void crearFigura(String tipoFigura) {
        System.out.println("Creando una figura de tipo " + tipoFigura);
    }

    // Declaracion del mismo metodo con 3 parametros de tipo "String, int, int";
    public void crearFigura(String tipoFigura, int anchoFigura, int altoFigura) {
        System.out.println("Creando figura de tipo " + tipoFigura + "Con una medida de "
                            + anchoFigura + " X " + altoFigura);
    }
    
    // Setter del atributo nombreFigura;
    public void setNombreFigura(String n) {
        this.nombreFigura = n;
    }
}
