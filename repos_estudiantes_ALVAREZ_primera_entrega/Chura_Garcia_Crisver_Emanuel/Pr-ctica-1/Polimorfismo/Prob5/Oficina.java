//5. Se hace referencia a algunos de los diferentes ambientes de la Universidad mediante las siguientes clases:
public class Oficina {
    private int nroSillas, nroEscritorios, nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

    // b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar() {
        if (nroSillas == 0 && nroEscritorios == 0 && nroEstanterias == 0) {
            System.out.println("Oficina sin muebles");
        } else {
            if (nroSillas == 0) {
                System.out.println(
                        "La oficina no cuenta con sillas pero cuenta con: " + nroEscritorios + " escritorios y "
                                + nroEstanterias + " estanterias");
            } else {
                if (nroEscritorios == 0) {
                    System.out.println(
                            "La oficina no cuenta con escritorios pero cuenta con: " + nroSillas + " sillas y "
                                    + nroEstanterias + " estanterias");
                } else {
                    if (nroEstanterias == 0) {
                        System.out.println(
                                "La oficina no cuenta con estanterias pero cuenta con: " + nroSillas + " sillas y "
                                        + nroEscritorios + " escritorios");
                    } else {
                        System.out.println(
                                "Oficina cuenta con: " + nroSillas + " sillas, " + nroEscritorios + " escritorios y "
                                        + nroEstanterias + " estanterias");
                    }
                }
            }
        }

    }

    public void cantidadMuebles() {
        int totalmuebles = nroSillas + nroEscritorios + nroEstanterias;
        if (totalmuebles == 0) {
            System.out.println("Oficina sin muebles");
        } else {
            System.out
                    .println("Oficina cuenta en total con: " + totalmuebles + " muebles a disposición");
        }
    }
}