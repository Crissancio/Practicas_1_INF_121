package estudiante;

public class Estudiante {
    private String nombre;
    private int nota_1;
    private int nota_2;

    public Estudiante(String nombre, int nota_1, int nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }
    public int promedio(){
        int  a=(nota_1+nota_2)/2;
        return a;
    }
    public boolean aprobar(){
        return promedio()>=6;
    }
    
    public void mostrar(){
        System.out.print("El estudiante "+nombre+" tiene un promedio de "+promedio());
        if(aprobar()==true) System.out.println(" APROBO");
        else System.out.println(" REPROBO");
    }
    public static void main(String[] args) {
        Estudiante e1=new Estudiante("Carlos",10,0);
        Estudiante e2=new Estudiante("Ernesto",2,10);
        Estudiante e3=new Estudiante("Marcelo",10,9);
        e1.promedio();
        e1.aprobar();
        e2.promedio();
        e2.aprobar();
        e3.promedio();
        e3.aprobar();
        e1.mostrar();
        e2.mostrar();
        e3.mostrar();
    }
    
}
