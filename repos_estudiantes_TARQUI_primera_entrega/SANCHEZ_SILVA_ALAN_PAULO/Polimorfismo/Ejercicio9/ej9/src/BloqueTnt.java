public class BloqueTnt {
    private String tipo;
    private int daño;
    public BloqueTnt(String tipo, int daño){
        this.tipo = tipo;
        this.daño = daño;
    }

    public void accion(){
        System.out.println("La TNT de tipo "+ this.tipo + "está lista para explotar");
    }

    public void colocar(String lugar){
        if(lugar != null){
            System.out.println("Bloque TNT colocado en " + lugar );
        }
    }

    public void romper(){
        System.out.println("La TNT explota causando "+ this.daño + " de daño");
    }
}
