package minecraft;
public class BloqueTnt {
    private String tipo;
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public void accion() {
        System.out.println("TNT tipo " + tipo + " activada, explotara pronto!");
    }

    public void colocar() {
        System.out.println("TNT colocada en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("TNT colocada en la orientacion: " + orientacion);
    }

    public void romper() {
        System.out.println("La TNT se ha roto sin explotar.");
    }
}
