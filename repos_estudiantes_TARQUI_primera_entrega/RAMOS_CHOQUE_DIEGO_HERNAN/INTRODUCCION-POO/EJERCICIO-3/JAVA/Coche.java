// incisa(b)
public class Coche {
    //atributos
    public String marca ;
    public String modelo;
    public int velocidad;
    
    public Coche(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    public int acelerar(){
        System.out.println("Acelerando...");
        return this.velocidad + 10;

    }
    public int frenar(){
        System.out.println("Frenando...");
        return this.velocidad - 5;
    }
    public static void main(String[] args) {
        Coche peta = new Coche("Toyota","Corolla",100);
        Coche ferrari = new Coche("Ferrari","F40",200);
        System.out.println("-------------------------------------------------");
        System.out.println("peta funcionando, velocidad inicial: " + peta.velocidad  + "km/h");
        System.out.println(peta.acelerar());
        System.out.println(peta.frenar());
        System.out.println("-------------------------------------------------");
        System.out.println("ferrari funcionando, velocidad inicial: " + ferrari.velocidad + "km/h");
        System.out.println(ferrari.acelerar());
        System.out.println(ferrari.frenar());

    }


    
}
