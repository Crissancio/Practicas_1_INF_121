/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

/**
 *
 * @author CINTHIA
 */
public class Estudiante {
    private String nombre;
    private int nota_1,nota_2;
    Estudiante(String nombre,int nota_1,int nota_2){
        this.nombre=nombre;
        this.nota_1=nota_1;
        this.nota_2=nota_2;
    }
    void promedio(){
        double promedio=(nota_1+nota_2)/2;
        System.out.println("Promedio : "+promedio);
    }
    void aprobado(){
        double promedio=(nota_1+nota_2)/2;
        if (promedio>=6){
            System.out.println("Aprobo");
        }
        else{
            System.out.println("Reprobo");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1=new Estudiante("Ana",7,6);
        Estudiante e2=new Estudiante("Pedro",3,5);
        Estudiante e3=new Estudiante("Miguel",8,4);
        System.out.println(e1.nombre);
        e1.promedio();
        e1.aprobado();
        System.out.println(e2.nombre);
        e2.promedio();
        e2.aprobado();
        System.out.println(e3.nombre);
        e3.promedio();
        e3.aprobado();
        
    }
    
}
