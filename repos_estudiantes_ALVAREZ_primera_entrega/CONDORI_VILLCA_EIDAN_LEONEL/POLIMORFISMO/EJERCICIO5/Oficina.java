package POLIMORFISMO.EJERCICIO5;
public class Oficina {
	private int nroSillas,nroEscritorios,nroEstanterias;
	public Oficina(int sillas, int escritorios, int estanterias) {
        this.nroSillas = sillas;
        this.nroEscritorios = escritorios;
        this.nroEstanterias = estanterias;
    }
	public void mostrar() {
            System.out.println("Oficina:");
            System.out.println("Sillas: " + nroSillas);
            System.out.println("Escritorios: " + nroEscritorios);
            System.out.println("Estanterías: " + nroEstanterias);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	    
    } 
        public int cantidadMuebles() {
            return nroSillas + nroEscritorios + nroEstanterias;
            }

        public int cantidadMuebles(boolean cantidad) {
            if (cantidad) {
                System.out.println("Detalle: Sillas(" + nroSillas + ") + Escritorios(" + nroEscritorios + ") + Estanterías(" + nroEstanterias + ")");
                }
                return cantidadMuebles();
            }
        }
