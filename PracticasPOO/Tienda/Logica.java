public class Logica extends Tienda {

    public void iniciador() {
        int contador = 0;

        while (contador == 0) {
            menu();
            seleccionUsuario();

            if (seleccion == 1) {
                int contador2 = 0;

                while (contador2 == 0) {
                    comprar();
                    seleccionUsuario();

                    if (seleccion <= productos.length) {
                        contador2 = 1;
                        contador = 1;

                    } else {
                        System.out.println("Opcion no disponible, intentalo nuevamente!");
                    }
                }

            } else if (seleccion == 0) {
                salir();

            } else {
                System.out.println("Opcion no disponible, intentalo nuevamente!");
            }
        }
        operaciones();
    }

    private void operaciones() {
        int contador = 0;
        int contador2 = 0;

        while (contador == 0) {
            if (seleccion == 1) {
                while (contador2 == 0) {
                    System.out.println("Elige tu equipo:");

                    for (int i = 0; i < celulares.length; i++) {
                        System.out.println(i + 1 + ". " + celulares[i]);
                    }
                    seleccionUsuario();

                    if (seleccion <= celulares.length) {
                        System.out.println("Compraste un celular " + celulares[seleccion - 1] + " por un precio de " + preciosCelulares[seleccion - 1]);
                        contador2 = 1;
                        contador = 1;

                    } else {
                        System.out.println("Opcion no disponible, intentalo nuevamente!");
                    }
                }

            } else if (seleccion == 2) {
                System.out.println("Elige tu laptop:");

                for (int i = 0; i < laptops.length; i++) {
                    System.out.println(i + 1 + ". " + laptops[i]);
                }
                seleccionUsuario();

                if (seleccion <= laptops.length) {
                    System.out.println("Compraste una laptop " + laptops[seleccion - 1] + " por un precio de " + preciosLaptops[seleccion - 1]);
                    contador2 = 1;
                    contador = 1;

                } else {
                    System.out.println("Opcion no disponible, intentalo nuevamente!");
                }

            } else if (seleccion == 3) {
                System.out.println("Elige tu televisor:");

                for (int i = 0; i < televisores.length; i++) {
                    System.out.println(i + 1 + ". " + televisores[i]);
                }
                seleccionUsuario();

                if (seleccion <= televisores.length) {
                    System.out.println("Compraste un televisor " + televisores[seleccion - 1] + " por un precio de " + preciosTelevisores[seleccion - 1]);
                    contador2 = 1;
                    contador = 1;

                } else {
                    System.out.println("Opcion no disponible, intentalo nuevamente!");
                }

            } else if (seleccion == 4) {
                System.out.println("Elige tu nevera:");

                for (int i = 0; i < neveras.length; i++) {
                    System.out.println(i + 1 + ". " + neveras[i]);
                }
                seleccionUsuario();

                if (seleccion <= neveras.length) {
                    System.out.println("Compraste una nevera " + neveras[seleccion - 1] + " por un precio de " + preciosNeveras[seleccion - 1]);
                    contador2 = 1;
                    contador = 1;

                } else {
                    System.out.println("Opcion no disponible, intentalo nuevamente!");
                }

            } else if (seleccion == 5) {
                System.out.println("Elige tu lavadora:");

                for (int i = 0; i < lavadoras.length; i++) {
                    System.out.println(i + 1 + ". " + lavadoras[i]);
                }
                seleccionUsuario();

                if (seleccion <= lavadoras.length) {
                    System.out.println("Compraste un lavadora " + lavadoras[seleccion - 1] + " por un precio de " + preciosLavadoras[seleccion - 1]);
                    contador2 = 1;
                    contador = 1;

                } else {
                    System.out.println("Opcion no disponible, intentalo nuevamente!");
                }
            }
        }
    }
}
