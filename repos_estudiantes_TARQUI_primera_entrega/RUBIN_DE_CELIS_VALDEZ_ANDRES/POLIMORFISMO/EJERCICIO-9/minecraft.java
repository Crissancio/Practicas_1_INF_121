class BloqueCofre
{
    private int capacidad;
    private int resistencia;
    private String tipo;
    
    public BloqueCofre()
    {
        this.capacidad = 27;
        this.resistencia = 10;
        this.tipo = "roble";
    }
    
    public BloqueCofre(int capacidad, int resistencia, String tipo)
    {
        this.capacidad = capacidad;
        this.resistencia = resistencia;
        this.tipo = tipo;
    }
    
    public void accion() 
    {
        System.out.println("Abriendo el cofre de tipo " + tipo + " con capacidad " + capacidad + ".");
    }
    
    public void colocar(String orientacion) 
    {
        System.out.println("Colocando el cofre en el " + orientacion + ".");
    }

    public void colocar() 
    {
        colocar("suelo"); 
    }

    public void romper() 
    {
        System.out.println("Rompiendo el cofre de tipo " + tipo + ". Cuidado con los items que caen!");
    }
}

class BloqueTnt
{
    private String tipo;
    private int daño;
    
    public BloqueTnt()
    {
        this.tipo = "normal";
        this.daño = 5;
    }
    
    public BloqueTnt(String tipo, int daño)
    {
        this.tipo = tipo;
        this.daño = daño;
    }
    
    public void accion() 
    {
        System.out.println("Activando la TNT de tipo " + tipo + ". Explosion inminente!");
    }

    public void colocar(String orientacion) 
    {
        System.out.println("Colocando la TNT en la " + orientacion + ".");
    }

    public void colocar() 
    {
        colocar("suelo"); 
    }

    public void romper() 
    {
        System.out.println("Rompiendo la TNT de tipo " + tipo + ". Puede explotar!");
    }
}

class BloqueHorno
{
    private String color;
    private int capacidadComida;
    
    public BloqueHorno()
    {
        this.color = "Gris";
        this.capacidadComida = 3;
    }
    
    public BloqueHorno(String color, int capacidadComida)
    {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }
    
    public void accion() 
    {
        System.out.println("Encendiendo el horno de color " + color + " con capacidad para " + capacidadComida + " comidas.");
    }

    public void colocar(String orientacion) 
    {
        System.out.println("Colocando el horno en el " + orientacion + ".");
    }

    public void colocar() 
    {
        colocar("suelo"); 
    }

    public void romper() 
    {
        System.out.println("Rompiendo el horno de color " + color + ". Cuidado con el calor!");
    }
}
public class main 
{
    public static void main(String[] args) 
    {
        //a)
        BloqueCofre bc1 = new BloqueCofre();
        BloqueCofre bc2 = new BloqueCofre(54, 15, "Abedul");
        BloqueTnt bt1 = new BloqueTnt();
        BloqueTnt bt2 = new BloqueTnt("super", 10);
        BloqueHorno bh1 = new BloqueHorno();
        BloqueHorno bh2 = new BloqueHorno("Negro", 5);
        //b)
        bc1.accion();
        bt1.accion();
        bh1.accion();
        //c)
        bc1.colocar();
        bt1.colocar("pared");
        bh1.colocar("techo");
        //d)
        bc1.romper();
        bt1.romper();
        bh1.romper();
    } 
}
