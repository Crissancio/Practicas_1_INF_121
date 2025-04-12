//Clase(s)

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    public Coche(String marca , String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }
    public void acelerar(){
        this.velocidad += 10;
    }
    public void frenar(){
        this.velocidad -=5;
        if(this.velocidad < 0 ){
            this.velocidad = 0;
        }
    }
    
    public void mostrarVelocidad(){
        System.out.println(this.marca + " - " + this.modelo + " Velocidad:" + this.velocidad + "km/h" );
    }
}
