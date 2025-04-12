/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadora;

/**
 *
 * @author SIVEL
 */
public class Computadora {
private String marca;
String ram;
String almacenamiento;
  boolean estado;
public Computadora(String marca,String ram, String almacenamiento,boolean estado ){
    this.marca=marca;
    this.ram=ram;
    this.almacenamiento=almacenamiento;
    this.estado=estado;
}
public void mostrar(){
        System.out.println("la marca de la computadora es: "+marca+" de RAM: "+ram+ " de prcesador: "+almacenamiento);}
public void verifica(){
    if(estado==false){
        System.out.println("la computadora esta apagada");
    }
    else{
        System.out.println("la computadora esta es prendida");
    }
}
public static void main(String[] args) {
     Computadora computadora= new Computadora("ultra", "8Mb","32Mb", false);
     computadora.verifica();
     computadora.mostrar();
}
    }
    

