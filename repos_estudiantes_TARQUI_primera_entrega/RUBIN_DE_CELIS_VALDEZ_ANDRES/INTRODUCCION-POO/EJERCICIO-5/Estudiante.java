public class Estudiante 
{
    private String nombre;
    private double nota_1;
    private double nota_2;
    
    public Estudiante(String nombre, double nota_1, double nota_2)
    {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }
    
    public double calcularPromedio() 
    {
        return (nota_1 + nota_2) / 2;
    }
    
    public boolean aprobo() 
    {
        return calcularPromedio() >= 6;
    }
  
    public static void main(String[] args) 
    {
        Estudiante est1 = new Estudiante("Ana", 7.5, 8.0);
        Estudiante est2 = new Estudiante("Luis", 5.0, 6.5);
        Estudiante est3 = new Estudiante("Sofia", 9.0, 9.5);

        System.out.println("Estudiante: " + est1.nombre);
        System.out.println("Promedio: " + est1.calcularPromedio());
        System.out.println("Aprobado: " + (est1.aprobo() ? "Si" : "No"));
        System.out.println();

        System.out.println("Estudiante: " + est2.nombre);
        System.out.println("Promedio: " + est2.calcularPromedio());
        System.out.println("Aprobado: " + (est2.aprobo() ? "Si" : "No"));
        System.out.println();

        System.out.println("Estudiante: " + est3.nombre);
        System.out.println("Promedio: " + est3.calcularPromedio());
        System.out.println("Aprobado: " + (est3.aprobo() ? "Si" : "No"));
    } 
}
