public class Pajaro {
    private String nombre, tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println("Pio, pio!!");
    }

    public void moverse() {
        if (tipo.equals("Gallina") || tipo.equals("Gallo") || tipo.equals("Pinguino") || tipo.equals("Kiwi")
                || tipo.equals("Pollito")) {
            System.out.println(nombre + " camina");
        } else {
            if (tipo.equals("Avestruz")) {
                System.out.println(nombre + " corre");
            } else {
                System.err.println(nombre + " vuela");
            }
        }

    }
}
