//9. Para los bloques del juego Minecraft se usará los siguientes objetos:
public class BloqueTnt {
    private String tipo;
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public void accion() {
        System.out.println("Dependiendo del tipo, este explotará y te hara un daño de: " + daño);
    }

    public void colocar(String orientacion) {
        if (orientacion.equals("Aire")) {
            System.out.println(
                    "Necesitas una base donde colocarlo, luego puedes romper ese bloque para el que desea poner este en el aire");
        } else {
            if (orientacion.equals("Suelo")) {
                System.out.println("La TNT de tipo: " + tipo + " con daño: " + daño + " fue colocado en el suelo");
            } else {
                if (orientacion.equals("Pared")) {
                    System.out.println("La TNT de tipo: " + tipo + " con daño: " + daño + " fue colocado en la pared");
                } else {
                    if (orientacion.equals("Agua")) {
                        System.out.println("La TNT de tipo: " + tipo + " con daño: " + daño
                                + " fue colocado bajo el agua, su efecto de daño se ve anulado");
                    } else {
                        if (orientacion.equals("Lava")) {
                            System.out.println("La TNT explotó haciendo un daño de: " + daño);
                        } else {
                            System.out.println("Por favor ingrese la orientacion que desee poner su bloque");
                        }
                    }
                }
            }
        }
    }

    public void romper() {
        System.out.println(
                "A menos que intentes romper la TNT con un mechero, creeme, estas cometiendo un error, en todo caso explotara; cambiara su efecto si estas usando mods");
    }
}
