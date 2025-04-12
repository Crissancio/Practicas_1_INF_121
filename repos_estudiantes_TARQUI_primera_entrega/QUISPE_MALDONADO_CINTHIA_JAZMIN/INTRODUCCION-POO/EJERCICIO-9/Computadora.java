/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadora;

/**
 *
 * @author CINTHIA
 */
public class Computadora {
    private String procesador;
    private int memoriaRAM,almacenamiento,encendido;
    
    Computadora(String procesador, int memoriaRAM,int almacenamiento){
        this.procesador=procesador;
        this.memoriaRAM=memoriaRAM;
        this.almacenamiento=almacenamiento;
        this.encendido=0;
    }
    
    public void mostrarEstado(){
        if(encendido==1){
            System.out.println("Estado: ENCENDIDA");
        }
        else{
            System.out.println("Estado: APAGADA");
        }
    }
    public void encender(){
        if(encendido == 0){
            encendido= 1;
            System.out.println("La computadora se a encendido");
        }
       
    }
    public void apagar(){
        if(encendido == 1){
            encendido= 0;
            System.out.println("La computadora se a apagado");
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora pc1=new Computadora("Intel Core i7",16,512);
        System.out.println("PROCESADOR: "+pc1.procesador);
        System.out.println("Memoria RAM: "+pc1.memoriaRAM+"GB");
        System.out.println("ALMACENAMIENTO: "+pc1.almacenamiento+"GB");
        pc1.mostrarEstado();
        System.out.println("-----------------");
        pc1.encender();
        pc1.mostrarEstado();
        System.out.println("-----------------");
        pc1.apagar();
        pc1.mostrarEstado();
    }
    
}
