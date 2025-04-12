//9. Para los bloques del juego Minecraft se usará los siguientes objetos:
public class BloqueHorno {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println(
                "Puedes cocinar tus alimentos en el con un material combustible, ya sea carbon, algún objeto de madera o un cubo de lava que este ultimo te permite hasta cocinar 100 elementos seguidos");
    }

    public void colocar(String orientacion) {
        if (orientacion.equals("Aire")) {
            System.out.println(
                    "Necesitas una base donde colocarlo, luego puedes romper ese bloque para el que desea poner este en el aire");
        } else {
            if (orientacion.equals("Suelo")) {
                System.out.println("El horno de color: " + color + " con una capacidad de comida de: " + capacidadComida
                        + " stacks fue colocado en el suelo");
            } else {
                if (orientacion.equals("Pared")) {
                    System.out.println(
                            "El horno de color: " + color + " con una capacidad de comida de: " + capacidadComida
                                    + " stacks fue colocado en la Pared");
                } else {
                    if (orientacion.equals("Agua")) {
                        System.out.println(
                                "El horno de color: " + color + " con una capacidad de comida de: " + capacidadComida
                                        + " stacks fue colocado bajo el agua");
                    } else {
                        if (orientacion.equals("Lava")) {
                            System.out.println("El horno de color: " + color + " con una capacidad de comida de: "
                                    + capacidadComida
                                    + " stacks fue colocado colocado en medio de la lava");
                        } else {
                            System.out.println("Por favor ingrese la orientacion que desee poner su bloque");
                        }
                    }
                }
            }
        }
    }

    public void romper() {
        System.out.println("A menos que estes cocinando algo en el horno, solo recuperas el horno");
    }
}
