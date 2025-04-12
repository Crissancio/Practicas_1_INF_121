package ejercicio5;

public class BloqueHorno extends Minecraf{
	public BloqueHorno() {
        nombre = "Horno";
    }
    public void accion() {
        System.out.println("Fundiendo objetos... ¡Proceso en marcha!");
    }
    public void romper() {
        System.out.println("Horno destruido. ¡Recolecta los materiales!");
    }
}
