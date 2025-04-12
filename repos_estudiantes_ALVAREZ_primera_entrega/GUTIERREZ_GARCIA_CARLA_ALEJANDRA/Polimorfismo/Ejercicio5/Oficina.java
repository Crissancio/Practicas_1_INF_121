package Ejercicio5;

public class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;

    public Oficina (int nroSillas, int nroEscritorios, int nroEstanterias){
        this.nroSillas=nroSillas;
        this.nroEscritorios=nroEscritorios;
        this.nroEstanterias=nroEstanterias;
    }
    //b) Crear un método mostrar() para mostrar los datos de cada objeto
    public void mostrar(){
        System.out.println("Numero de sillas: " + nroSillas);
        System.out.println("Numero de escritorios: " + nroEscritorios);
        System.out.println("Numero de estanterias: " + nroEstanterias);
    }
    //c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
    //muebles dentro de cada ambiente
    
    public void cantidadMuebles(){
        int m=nroSillas+nroEscritorios+nroEstanterias;
        System.out.println("Cantidad de muebles Oficina es: "+m);
    } 
    public void cantidadMuebles(int nroArmarios) {
        int total =nroSillas+nroEscritorios+nroEstanterias+nroArmarios;
        System.out.println("Cantidad de muebles en el Oficina  (incluyendo armarios) es: " + total);
    }
    
}
