public class Aula {
    private String nombre;
    private int capacidad ;
    private int nropupitres;
    public Aula(String nombre, int capacidad, int nropupitres){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nropupitres = nropupitres;

    }
    public String cantidaddeMuebles(){
        return "hay en total " + nropupitres + " muebles en el aula";
    }
    public String mostrar(){
        return String.format("El aula %s tiene %d pupitres los cuales dan una capacidad de %d alumnos",nombre,nropupitres,capacidad);
    }

}
