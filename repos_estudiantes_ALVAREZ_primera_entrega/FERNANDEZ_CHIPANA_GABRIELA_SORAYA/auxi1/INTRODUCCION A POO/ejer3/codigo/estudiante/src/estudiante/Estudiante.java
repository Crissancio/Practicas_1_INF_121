
package producto;
public class Estudiante {
    public
       String nombre;
       double nota1;
       double nota2;
       public Estudiante(String nombre,double nota1,double nota2){
           this.nombre=nombre;
           this.nota1=nota1;
           this.nota2=nota2;
       }     
    public double promedio(){
            return (nota1+nota2)/2;
    }
     public String verificasiaprobo (){
         if(this.promedio()>=5.5){
             return "aprobo";
         }
         else{
             return "no aprobo";
         }
     }
    public static void main(String[] args) {
        Estudiante e1=new Estudiante("elvis", 5.1 ,6);
        Estudiante e2=new Estudiante("ana", 3 ,5);
        System.out.println("promedio: "+e1.promedio());
        System.out.println("promedio: "+e2.promedio());
        System.out.println(e1.nombre+" "+e1.verificasiaprobo());
        System.out.println(e2.nombre+" "+e2.verificasiaprobo());
    }
    
}

