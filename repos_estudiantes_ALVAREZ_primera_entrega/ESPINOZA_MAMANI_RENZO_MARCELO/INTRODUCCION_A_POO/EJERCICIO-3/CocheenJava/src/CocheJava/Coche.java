package CocheJava;

public class Coche {
	 // Atributos
    private String marca;
    private String modelo;
    private int velocidad;
    public Coche(String marca, String modelo , int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    // Metodo para acelerar el coche
    public void acelerar(){
        velocidad += 10;
    }
    // Metodo para frenar el coche
    public void frenar(){
        velocidad -= 5;
        if(velocidad < 0){
            velocidad = 0;
        }
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getVelocidad(){
        return velocidad;
    }
}
