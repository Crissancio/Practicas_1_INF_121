/* Ejercicio7 polimorfismo: Se hace referencia a algunos animales mediante las siguientes clases:
 Perro,Gato,Pajaro.
   a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
   b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
   c) Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
 */
public class Main {
    public static void main(String[] args) {
        // a) instanciando 1 Perro, 1 Gato y 1 Pájaro
        Perro a = new Perro("hachi", 3, "Labrador");
        Gato b = new Gato("more", "gris");
        Pajaro c = new Pajaro("igor", "paloma");
        a.mostrar();
        b.mostrar();
        c.mostrar();

        // b)Metodo hacerSonido() sobrecargado para que cada animal emita su sonido característico.
        a.hacerSonido();
        b.hacerSonido();
        c.hacerSonido();
        System.out.println("\nel perro haciendo sonidos:");
        a.hacerSonido(3);
        System.out.println("\nel gato haciendo sonidos:");
        b.hacerSonido(2);
        System.out.println("\nel pajaro haciendo sonidos:");
        c.hacerSonido(1);
        // c)Metodo moverse()  implementado para que indique cómo se mueve cada animal.
        System.out.println("\nel movimientos de los Animales es:");
        a.moverse();
        b.moverse();
        c.moverse();
    }
}