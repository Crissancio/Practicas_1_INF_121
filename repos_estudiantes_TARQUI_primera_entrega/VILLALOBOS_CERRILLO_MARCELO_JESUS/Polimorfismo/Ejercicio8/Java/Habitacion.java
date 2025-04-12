class HabitacionSimple {
    private int nroHabitacion;
    private float precioxNoche;
    private int nrodeNoches;
    private int capacidad;
    public HabitacionSimple(int nroHabitacion, float precioxNoche, int nrodeNoches, int capacidad) {
        this.nroHabitacion = nroHabitacion;
        this.precioxNoche = precioxNoche;
        this.nrodeNoches = nrodeNoches;
        this.capacidad = capacidad;
    }
    public void reservar(int noches) {
        System.out.println("Habitación reservada por " + noches + " noches");
    }
    public void reservar(int noches, int personas) {
        System.out.println("Habitación reservada por " + noches + " noches para " + personas + " personas.");
    }
    public float calcularCosto(int noches) {
        return noches * 50;
    }
}
class HabitacionDoble {
    private int nroHabitacion;
    private float precioxNoche;
    private int nrodeNoches;
    private int capacidad;
    private int nrodeHabitaciones;
    public HabitacionDoble(int nroHabitacion, float precioxNoche, int nrodeNoches, int capacidad, int nrodeHabitaciones) {
        this.nroHabitacion = nroHabitacion;
        this.precioxNoche = precioxNoche;
        this.nrodeNoches = nrodeNoches;
        this.capacidad = capacidad;
        this.nrodeHabitaciones = nrodeHabitaciones;
    }
    public void reservar(int noches) {
        System.out.println("Habitación reservada por " + noches + " noches");
    }
    public void reservar(int noches, int personas) {
        System.out.println("Habitación reservada por " + noches + " noches para " + personas + " personas.");
    }
    public float calcularCosto(int noches) {
        return noches * 80;
    }
}
class Suite {
    private int nroHabitacion;
    private float precioxNoche;
    private int nrodeNoches;
    private int capacidad;
    private int nrodeHabitaciones;
    public Suite(int nroHabitacion, float precioxNoche, int nrodeNoches, int capacidad, int nrodeHabitaciones) {
        this.nroHabitacion = nroHabitacion;
        this.precioxNoche = precioxNoche;
        this.nrodeNoches = nrodeNoches;
        this.capacidad = capacidad;
        this.nrodeHabitaciones = nrodeHabitaciones;
    }
    public void reservar(int noches) {
        System.out.println("Habitación reservada por " + noches + " noches");
    }
    public void reservar(int noches, int personas) {
        System.out.println("Habitación reservada por " + noches + " noches para " + personas + " personas.");
    }
    public float calcularCosto(int noches) {
        return noches * 150;
    }
}