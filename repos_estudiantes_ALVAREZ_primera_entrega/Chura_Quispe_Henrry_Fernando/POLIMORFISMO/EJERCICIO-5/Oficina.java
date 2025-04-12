package AmbienteUniversidad;

public class Oficina {
		private int nroSillas;
		private int nroEscritorios;
		private int nroEstanterias;
		
		
		public Oficina(int nroSillas,int nroEscritorios,int nroEstanterias) {
			this.nroSillas=nroSillas;
			this.nroEscritorios=nroEscritorios;
			this.nroEstanterias=nroEstanterias;
			
		}
		//b) Crear un método mostrar() para mostrar los datos de cada objeto
		public void mostar() {
		 
			System.out.println("\n nro de sillas en la oficina es  "+nroSillas+" \n el numero de escritorio "+nroEscritorios+" \n y el numero de estanterias es "+nroEstanterias);
		}
		//c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
		//muebles dentro de cada ambiente
		public int canMuebles() {
			return nroSillas+nroEscritorios+nroEstanterias;
		}
}
