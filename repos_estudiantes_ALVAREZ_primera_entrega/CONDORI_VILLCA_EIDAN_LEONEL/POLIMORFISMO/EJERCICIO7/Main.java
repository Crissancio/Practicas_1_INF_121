package POLIMORFISMO.EJERCICIO7;
//Se hace referencia a algunos animales mediante las siguientes clases:
//a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
//b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
//característico.
//c) Implementar un método moverse() que indique cómo se mueve cada animal
//(correr, saltar, volar, etc.).
public class Main {
	public static void main(String[] args) {
        Perro perro = new Perro("Doki", 5, "Pator Aleman");
        Gato gato = new Gato("Pelusa", "Negro");
        Pajaro pajaro = new Pajaro("Mark-16", "Canario");

        perro.hacerSonido();
        perro.moverse();
        gato.hacerSonido();
        gato.moverse();
        pajaro.hacerSonido();
        pajaro.moverse();
    }
}
