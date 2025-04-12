class Coche {
    public String marca;
    public String modelo;
    public int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        velocidad = 0;
    }
// a) Método acelerar() que aumenta velocidad en 10
    public void acelerar() {
        velocidad = velocidad + 10;
        System.out.println("la marca "+marca + " con " + modelo + " acelero y su velocidad es ahora : " + velocidad);
    }
// b) Método frenar() que reduce velocidad en 5 
    public void frenar() {
        if (velocidad <= 5) {
            velocidad = 0;
        } else {
            velocidad = velocidad - 5;
        }
        System.out.println(" la marca "+marca+ " con modelo " + modelo + " freno y su velocidad es ahora : " + velocidad);
    }
}

