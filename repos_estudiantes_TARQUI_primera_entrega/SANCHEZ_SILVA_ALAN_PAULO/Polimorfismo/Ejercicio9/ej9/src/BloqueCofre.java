public class BloqueCofre {
    private int capacidad, resistencia;
    private String tipo;
    public BloqueCofre(int capacidad, int resistencia , String tipo){
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    public void accion(){
        System.out.println("El cofre de tipo " + this.tipo+" y resistencia de "+ this.resistencia +" puede almacenar hasta "+ this.capacidad +" objetos");
    }

    public void colocar(String lugar){
        if(lugar != null){
            System.out.println("Bloque colocado en "+ lugar);
        }
    }

    public void romper(){
        System.out.println("El cofre se rompe y se caen todos los objetos guardados");
    }

}
