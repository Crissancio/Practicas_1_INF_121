package coche;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public void acelerar(){
        velocidad+=10;
       
    }
    public void frenar(){
        velocidad-=5;
        
        
    }
    public void mostrar(){
        System.out.println("El coche de marca "+marca+" de modelo "+modelo+" esta en la velocidad de "+velocidad);
    }
    public static void main(String[] args) {
        Coche c1=new Coche("Toyota","Z-100", 0);
        Coche c2=new Coche("Suzuki","X200", 15);
        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        c2.acelerar();
        c2.frenar();
        c1.mostrar();
        c2.mostrar();
                
    }
    
}
