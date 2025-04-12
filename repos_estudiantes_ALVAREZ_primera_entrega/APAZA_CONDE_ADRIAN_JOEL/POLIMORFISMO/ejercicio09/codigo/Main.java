/* Ejercicio9 polimorfismo: Para los bloques del juego Minecraft se usará los siguientes objetos:
   BloqueCofre,BloqueTNT,BloqueHorno.
   a) Crear e instanciar al menos 2 bloques de cada tipo
   b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
   c) Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
   d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
 */
public class Main {
    public static void main(String[] args) {
        // a) Instanciando al menos 2 bloques de cada tipo. 
        BloqueCofre cofre1 = new BloqueCofre(10, 5, "abeto");
        BloqueCofre cofre2 = new BloqueCofre(4, 5, "roble");
        
        BloqueTNT tnt1 = new BloqueTNT("explosivo", 12);
        BloqueTNT tnt2 = new BloqueTNT("explosivo2", 20);
        
        BloqueHorno horno1 = new BloqueHorno("rojo", 2);
        BloqueHorno horno2 = new BloqueHorno("blanco", 2);
        
        // b)Metodo accion() Sobreescrito en en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
        System.out.println("\nAccion de bloques:");
        cofre1.accion();
        tnt1.accion();
        horno1.accion();
        cofre2.accion();
        tnt2.accion();
        horno2.accion();
        // c) Metodo colocar() Sobrecargado para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
        System.out.println("\nColocando los bloques:");
        cofre1.colocar();
        cofre1.colocar("cueva");
        tnt1.colocar();
        tnt1.colocar("agua");
        cofre2.colocar();
        cofre2.colocar("pared");
        tnt2.colocar();
        tnt2.colocar("techo");
        // d)Metodo romper() Sobreescrito en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
        System.out.println("\nRompiendo los bloques:");
        cofre1.romper();
        tnt1.romper();
        horno1.romper();
        cofre2.romper();
        tnt2.romper();
        horno2.romper();
    }
}

