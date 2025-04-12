//8. Para la reserva de habitaciones se guía por las siguientes clases
public class HabitacionDoble {
    private int nroHabitacion, nrodeNoches, capacidad, nrodehabitaciones;
    private float precioxNoche;

    public HabitacionDoble(int nroHabitacion, float precioxNoche, int nrodeNoches, int capacidad,
            int nrodehabitaciones) {
        this.nroHabitacion = nroHabitacion;
        this.nrodeNoches = nrodeNoches;
        this.capacidad = capacidad;
        this.precioxNoche = precioxNoche;
        this.nrodehabitaciones = nrodehabitaciones;
    }

    public void calcularCosto(int noches) {
        if (noches == 0) {
            System.out.println("Por favor ingrese la canitdad de noches deseadas");
        } else {
            this.nrodeNoches = noches;
            System.out.println("Costo por noche: " + ((precioxNoche * nrodehabitaciones) * nrodeNoches));
        }
    }

    public void reservar(int nrodeNoches) {
        if (nrodeNoches == 0) {
            System.out.println("Por favor ingresar una cantidad de noches que desee reservar");
        } else {
            System.out.println("Se ha reservado la habitación nro: " + nroHabitacion + " con capacidad: " + capacidad
                    + " a: " + precioxNoche + " $us. la noche por: " + nrodeNoches + " noche(s)");
            this.nrodeNoches = nrodeNoches;
        }
    }

    public void reservar(int nrodeNoches, int numeroDePersonas) {
        if (nrodeNoches == 0 || numeroDePersonas == 0) {
            System.out.println("Por favor ingresar una cantidad mayor a 0 para poderlo ayudar");
        } else {
            if (numeroDePersonas > capacidad) {
                System.out.println(
                        "Disculpe, el numero de personas supera a la cantidad de la habitación, le sugerimos reservar otro tipo de habitación");
            } else {
                System.out
                        .println("Se ha reservado la habitación nro: " + nroHabitacion + " con capacidad: " + capacidad
                                + " a: " + precioxNoche + " $us. la noche por: " + nrodeNoches + " noche(s)");
                this.nrodeNoches = nrodeNoches;
            }
        }

    }
}
