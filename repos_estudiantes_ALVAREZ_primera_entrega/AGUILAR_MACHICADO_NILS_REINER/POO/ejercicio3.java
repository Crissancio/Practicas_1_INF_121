public class Coche {
    String marca, modelo;
    int velocidad;

    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar(){
        velocidad += 10;
    }

    public void frenar(){
        velocidad -= 5;
    }

    public void mostrar(){
        System.out.println(marca + " " + modelo + " va a " + velocidad + " km/h");
    }

    public static void main(String[] args){
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Ford", "Fiesta");

        c1.acelerar(); c1.acelerar(); c1.frenar();
        c2.acelerar();

        c1.mostrar();
        c2.mostrar();
    }
}
