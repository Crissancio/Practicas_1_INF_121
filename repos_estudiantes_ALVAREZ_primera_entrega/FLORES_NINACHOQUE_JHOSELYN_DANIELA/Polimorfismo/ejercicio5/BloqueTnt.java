package ejercicio5;

public class BloqueTnt extends Minecraf{
	public BloqueTnt() {
        nombre = "TNT";
    }
    public void accion() {
        System.out.println("¡La TNT está activada! ¡Explosión inminente!");
    }
    public void romper() {
        System.out.println("¡BOOM! La TNT explotó al ser rota");
    }
}
