package ejercicio5;

public class BloqueCofre extends Minecraf {
	public BloqueCofre() {
        nombre = "Cofre";
    }
    public void accion() {
        System.out.println("Abriendo cofre... ¡Inventario disponible!");
    }
    public void romper() {
        System.out.println("¡Cuidado! El cofre soltó sus objetos al romperse");
    }
}
