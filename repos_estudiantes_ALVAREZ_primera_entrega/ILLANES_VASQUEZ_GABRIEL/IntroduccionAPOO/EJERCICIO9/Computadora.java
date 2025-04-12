
package Ejercicio9;



public class Computadora {
    private String procesador;
    private int ram ;
    private int almacenamiento;
    private String tarjetaGrafica;
    private boolean encendida;
    private String marca;
    
    public Computadora(String procesador, int ram, int almacenamiento, String tarjetaGrafica, String marca) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tarjetaGrafica = tarjetaGrafica;
        this.encendida = false;
        this.marca= marca;
    }
    
    public void mostrar(){
        System.out.println("el procesador es" + procesador);
        System.out.println("la ram es " +ram);
        System.out.println("el alamcenamiento es " +almacenamiento);
        System.out.println("la tarjata es " + tarjetaGrafica);
        System.out.println("la marca es marca " + marca  );
    }
    
    public void estado(){
        if (encendida){
            System.out.println("esta encendido");
            
        }else {
            System.out.println("apagado");
        }
    }
    
    public void encender(){
        if(!encendida){
            encendida = true;
            System.out.println("prendido");
        }
    }
    public void apagar(){
        if (encendida){
            encendida=false;
            System.out.println("se a apagado");
        }
    }
    
    
public static void main (String[] args){
    Computadora compu = new Computadora("intel core i7", 8, 256,"nvidia gtx 1650","hp");

    compu.mostrar();
    compu.estado();
    compu.encender();
    compu.estado();
    compu.apagar();
    compu.estado();
}
}