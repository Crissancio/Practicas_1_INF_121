/*Para los bloques del juego Minecraft se usará los siguientes objetos:
a) Crear e instanciar al menos 2 bloques de cada tipo
b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
distintos mensajes según el tipo de bloque.
c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
orientaciones (por ejemplo, en el suelo o en la pared).
d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
*/
package bloquecofre;
public class Main {
    public static void main(String[] args) {
        BloqueCofre cofre =new BloqueCofre (15,5,"madera");
        BloqueTnt tnt=new BloqueTnt("mediano",7);
        BloqueHorno horno=new BloqueHorno("azul",12);
        BloqueCofre cofre1 =new BloqueCofre (10,8,"piedra");
        BloqueTnt tnt1=new BloqueTnt("ladrillo",15);
        BloqueHorno horno1=new BloqueHorno("verde",10);
        cofre.accion();
        cofre.colocar("suelo");
        cofre.romper();
        cofre1.accion();
        cofre1.colocar("pared");
        cofre1.romper();
        horno.accion();
        horno.romper();
        horno1.accion();
        horno1.romper();
        tnt.accion();
        tnt.colocar("agua");
        tnt.romper();
        tnt1.accion();
        tnt1.colocar("agua");
        tnt1.romper();
    }
    
}
