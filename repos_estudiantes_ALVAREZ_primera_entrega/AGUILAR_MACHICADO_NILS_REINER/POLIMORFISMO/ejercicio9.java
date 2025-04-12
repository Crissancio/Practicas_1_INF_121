class Bloque {
    public void accion() {
        System.out.println("Bloque genérico: sin acción definida");
    }

    public void colocar() {
        System.out.println("Colocado en el suelo");
    }

    public void colocar(String lugar) {
        System.out.println("Colocado en la " + lugar);
    }

    public void romper() {
        System.out.println("Bloque roto sin efectos");
    }
}

class BloqueCofre extends Bloque {
    @Override
    public void accion() {
        System.out.println("Se abre el cofre: puedes guardar objetos");
    }

    @Override
    public void romper() {
        System.out.println("¡Cofre destruido! Todo su contenido se pierde");
    }
}

class BloqueTnt extends Bloque {
    @Override
    public void accion() {
        System.out.println("¡La TNT está activa! Se encenderá en 3... 2... 1... 💥");
    }

    @Override
    public void romper() {
        System.out.println("¡Boom! Rompiste la TNT y explotó");
    }
}

class BloqueHorno extends Bloque {
    @Override
    public void accion() {
        System.out.println("Se puede cocinar o fundir minerales");
    }

    @Override
    public void romper() {
        System.out.println("El horno se destruyó, se pierde su progreso de cocción");
    }
}

public class Minecraft {
    public static void main(String[] args) {
        Bloque[] bloques = {
            new BloqueCofre(), new BloqueCofre(),
            new BloqueTnt(), new BloqueTnt(),
            new BloqueHorno(), new BloqueHorno()
        };

        for (Bloque b : bloques) {
            b.accion();
            b.colocar();
            b.colocar("pared");
            b.romper();
            System.out.println();
        }
    }
}
