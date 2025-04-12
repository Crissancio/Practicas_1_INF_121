
public class Estudiante {
    //atributos
    public String nombre;
    public float nota_1;
    public float nota_2;
    //metodos
    public Estudiante(String nombre, float nota_1, float nota_2){
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;

    }
    public float Promedio(){
        return (this.nota_1 + this.nota_2)/2;

    }
    public String verificaciondeAprobado(){
        float promedio = this.Promedio();
        if (promedio >= 6.0){
            return "Aprobado";
        }else{
        return "Reprobado";
        }
    }
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 5.0f, 6.0f);
        Estudiante estudiante2 = new Estudiante("Pedro", 6.0f, 6.0f);

        System.out.println("Nombre: " + estudiante.nombre);
        System.out.println("Nota 1: " + estudiante.nota_1);
        System.out.println("Nota 2: " + estudiante.nota_2);
        System.out.println("Promedio: " + estudiante.Promedio());
        System.out.println("Estado: " + estudiante.verificaciondeAprobado());

        System.out.println("Nombre: " + estudiante2.nombre);
        System.out.println("Nota 1: " + estudiante2.nota_1);
        System.out.println("Nota 2: " + estudiante2.nota_2);
        System.out.println("Promedio: " + estudiante2.Promedio());
        System.out.println("Estado: " + estudiante2.verificaciondeAprobado());
    
    }
    
}
