public class Oficina {
    private int nroSillas ;
    private int nroEscritorios;
    private int nroEstanterias;
    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias){
        this.nroSillas = nroSillas;
        this.nroEscritorios= nroEscritorios;
        this.nroEstanterias = nroEstanterias;

    }
    public String cantidaddeMuebles(){
        int cantidad = nroEscritorios + nroSillas + nroEstanterias;
        return "hay en total " + cantidad + " muebles en la oficina";
    }
    public String mostrar(){
        return String.format("la oficina tiene %d Sillas ,%d Escritorios y %d Estanterias",nroSillas,nroEscritorios,nroEstanterias );
    }

}
