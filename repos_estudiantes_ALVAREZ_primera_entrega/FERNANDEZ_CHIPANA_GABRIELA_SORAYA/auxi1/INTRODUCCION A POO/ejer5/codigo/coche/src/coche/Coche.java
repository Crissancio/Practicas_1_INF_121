
package coche;
public class Coche {
    public 
       String marca;
       String modelo;
       int velocidad;
       public Coche(String marca, String modelo, int velocidad){
           this.marca=marca;
           this.modelo=modelo;
           this.velocidad=velocidad;
       }
       //imprimir directamente dentro del método:programas pequeños
       public void acelerar(){
            int veloaumentada=velocidad+10;
           System.out.println("la velociada aumentada es: "+ veloaumentada);
       }
       //retornar el valor para luego imprimirlo desde otra parte:programas medianos y grandes
       public  float frenar(){
          return velocidad-5;
          
       }
    public static void main(String[] args) {
        Coche c1=new Coche("Nissan","2025", 20);
        Coche c2=new Coche("Suzuki","2023", 100);
        c1.acelerar();
        System.out.println("velociada desminuida"+c1.frenar());
        c2.acelerar();
        System.out.println("velociada desminuida"+c2.frenar());
    }
    
}
