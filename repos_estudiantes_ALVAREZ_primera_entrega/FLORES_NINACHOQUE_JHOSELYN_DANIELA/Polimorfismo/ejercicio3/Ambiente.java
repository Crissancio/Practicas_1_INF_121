package ejercicio3;

public abstract class Ambiente {
	protected String nombre;
	protected int cantidadMuebles;
	public void cantidadMuebles(int nuevosMuebles) {
        this.cantidadMuebles += nuevosMuebles;
    }

    public int cantidadMuebles() {
        return this.cantidadMuebles;
    }

    public abstract void mostrar();
}
