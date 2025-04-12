package Ejercicio7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Perro pe= new Perro("Rex", 5, "Pastor Alemán");
        Gato ga= new Gato("Misu", "Blanco");
        Pajaro pa= new Pajaro("Kiwi", "Exótico");
        pe.hacerSonido();
        pe.hacerSonido(3);
        ga.hacerSonido();
        ga.hacerSonido(2);
        pa.hacerSonido();
        pa.hacerSonido(4);
        pe.moverse();
        ga.moverse();
        pa.moverse();
	}

}
