//9. Para los bloques del juego Minecraft se usará los siguientes objetos:
public class BloqueCofre {
    private int capacidad, resistencia;
    private String tipo;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }

    public void accion() {
        if (tipo.equals("Trampa")) {
            System.out.println(
                    "Puedes guardar hasta: " + capacidad
                            + " objetos en el pudiendo ser como un switch a tus trampas que puedes crear con TNT o dispensadores u observadores");
        } else {
            if (tipo.equals("Nether")) {
                System.out
                        .println(
                                "Si tienes otro cofre igual, puedes guardar objetos y llevarte el otro para sacar los objetos de uno puesto anteriormente");
            } else {
                if (tipo.equals("Shulker")) {
                    System.out.println(
                            "Puedes guardar objetos con la particularidad de poderte llevartelo con todos sus objetos dentro");
                }
            }
        }

    }

    public void colocar(String orientacion) {
        if (orientacion.equals("Aire")) {
            System.out.println(
                    "Necesitas una base donde colocarlo, luego puedes romper ese bloque para el que desea poner este en el aire");
        } else {
            if (orientacion.equals("Suelo")) {
                System.out.println("El cofre de tipo: " + tipo + " fue colocado en el suelo");
            } else {
                if (orientacion.equals("Pared")) {
                    System.out.println("El cofre de tipo: " + tipo + " fue colocado en el suelo");
                } else {
                    if (orientacion.equals("Agua")) {
                        System.out.println("El cofre de tipo: " + tipo + " fue colocado en el agua");
                    } else {
                        if (orientacion.equals("Lava")) {
                            System.out.println("El cofe de tipo: " + tipo + " fue destruido");
                        } else {
                            System.out.println("Por favor ingrese la orientacion que desee poner su bloque");
                        }
                    }
                }
            }
        }
    }

    public void romper() {
        if (tipo.equals("Normal")) {
            System.out.println("Al romper este cofre los objetos guradados en el estaran al aire");
        } else {
            if (tipo.equals("Trampa")) {
                System.out.println(
                        "Al romper este cofre puedes evitar la trampa que se acciona al querer ver su contenido");
            } else {
                if (tipo.equals("Nether")) {
                    System.out
                            .println("A menos que haya otro cofre enlazado, solo podras recuperar el cofe del nether");
                } else {
                    if (tipo.equals("Shulker")) {
                        System.out.println(
                                "Al romper este cofre recuperas la caja Shulker con todos los objetos guardados en él");
                    }
                }
            }
        }
    }
}