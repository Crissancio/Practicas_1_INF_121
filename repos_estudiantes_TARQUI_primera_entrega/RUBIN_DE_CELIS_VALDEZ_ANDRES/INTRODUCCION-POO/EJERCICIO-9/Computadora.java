public class Computadora 
{
    private String marca;
    private String procesador;
    private int ram; 
    private boolean encendida;

    public Computadora(String marca, String procesador, int ram) 
    {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.encendida = false;
    }
    
    public void encender() 
    {
        if (encendida) 
        {
            System.out.println("La computadora ya está encendida.");
        } 
        else 
        {
            encendida = true;
            System.out.println("La computadora se ha encendido.");
        }
    }
    
    public void apagar() 
    {
        if (!encendida) 
        {
            System.out.println("La computadora ya está apagada.");
        } 
        else 
        {
            encendida = false;
            System.out.println("La computadora se ha apagado.");
        }
    }
    
    public void mostrarComponentes() 
    {
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
    }

    public void mostrarEstado() 
    {
        String estado = encendida ? "Encendida" : "Apagada";
        System.out.println("Estado de la computadora: " + estado);
    }
    
    public static void main(String[] args) 
    {
        Computadora miComputadora = new Computadora("Dell", "Intel i7", 16);

        
        System.out.println("Componentes de la computadora:");
        miComputadora.mostrarComponentes();
        System.out.println("-----------------------------");

        
        miComputadora.mostrarEstado();
        System.out.println("-----------------------------");

        
        miComputadora.encender();
        miComputadora.mostrarEstado();
        System.out.println("-----------------------------");

        
        miComputadora.apagar();
        miComputadora.mostrarEstado();
    }
}
