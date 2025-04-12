public class Laboratorio {
    private String nombre;
    private int capacidad ;
    private int nroSillas;
    private int nromesas;
    public Laboratorio(String nombre, int capacidad, int nroSillas, int nromesas){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroSillas = nroSillas;
        this.nromesas = nromesas;

    }
    public String cantidaddeMuebles(){
        int cantidad =  nroSillas + nromesas;
        return "hay en total " + cantidad + " muebles en el laboratorio" ;
    }
    public String mostrar(){
        return String.format("El laboratorio %s tiene %d mesas  y %d sillas los cuales dan una capacidad de %d alumnos",nombre,nromesas,nroSillas, capacidad);
    }

}
