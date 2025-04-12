public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida){
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion(){
        System.out.println("El horno de capacidad de comida de "+ this.capacidadComida + " y color " + this.color + " está cocinando la comida");
    }

    public void colocar(String lugar){
        if(lugar != null){
            System.out.println("Bloque horno colocado en " + lugar);
        }
    }

    public void romper(){
        System.out.println("El horno se rompe y deja caer su contenido");
    }
}
