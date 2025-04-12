class Oficina
{
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;
    
    public Oficina()
    {
        this.nroSillas = 10;
        this.nroEscritorios = 5;
        this.nroEstanterias = 20;
    }
    
    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias)
    {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }
    
    public void mostrar()
    {
        System.out.println("Oficina - Sillas: " + nroSillas + ", Escritorios: " + nroEscritorios + ", Estanterias: " + nroEstanterias);
    }
    
    public int cantidadMuebles() 
    {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
}

class Aula
{
    private String nombre;
    private int capacidad;
    private int nroPupitres;
    
    public Aula()
    {
        this.nombre = "A101";
        this.capacidad = 30;
        this.nroPupitres = 25;
    }
    
    public Aula(String nombre, int capacidad, int nroPupitres) 
    {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = nroPupitres;
    }

    public void mostrar() 
    {
        System.out.println("Aula " + nombre + " - Capacidad: " + capacidad + ", Pupitres: " + nroPupitres);
    }

    public int cantidadMuebles() 
    {
        return nroPupitres;                                         
    }
}

class Laboratorio 
{
    private String nombre;
    private int capacidad;
    private int nroMesas;
    private int nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) 
    {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }

    public void mostrar() 
    {
        System.out.println("Laboratorio " + nombre + " - Capacidad: " + capacidad + ", Mesas: " + nroMesas + ", Sillas: " + nroSillas);
    }

    public int cantidadMuebles() 
    {
        return nroMesas + nroSillas;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Oficina of1 = new Oficina();
        Oficina of2 = new Oficina(8, 4, 2);
        Aula a1 = new Aula();
        Aula a2 = new Aula("B202", 40, 35);
        Laboratorio l1 = new Laboratorio("Lab1", 20, 10, 20);
        
        of1.mostrar();
        of2.mostrar();
        a1.mostrar();
        a2.mostrar();
        l1.mostrar();
        
        System.out.println("Total de muebles en Oficina 1: " + of1.cantidadMuebles());
        System.out.println("Total de muebles en Oficina 2: " + of2.cantidadMuebles());
        System.out.println("Total de muebles en Aula 1: " + a1.cantidadMuebles());
        System.out.println("Total de muebles en Aula 2: " + a2.cantidadMuebles());
        System.out.println("Total de muebles en Laboratorio 1: " + l1.cantidadMuebles());
    }
}
