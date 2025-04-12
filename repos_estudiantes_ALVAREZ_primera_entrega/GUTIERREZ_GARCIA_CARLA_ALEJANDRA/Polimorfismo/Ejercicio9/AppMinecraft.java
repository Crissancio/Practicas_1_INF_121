package Ejercicio9;

public class AppMinecraft {
    public static void main(String[] args) {
        //a) Crear e instanciar al menos 2 bloques de cada tipo
        //System.out.println("-------I N C I S O     A-------");
        BloqueHorno bHorno1 = new BloqueHorno("gris", 64);
        BloqueHorno bHorno2 = new BloqueHorno("rojo",50);
        BloqueCofre bCofre1 = new BloqueCofre(100, 50, "madera");
        BloqueCofre bCofre2 = new BloqueCofre(80, 70, "hierro");
        BloqueTnt bTnt1 = new BloqueTnt("rojo", 10);
        BloqueTnt bTnt2 = new BloqueTnt("amarillo", 30);
        
        //b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
        //distintos mensajes según el tipo de bloque.
        System.out.println("-------I N C I S O     B-------");
        bHorno1.accion();
        bHorno2.accion();
        bCofre1.accion();
        bCofre2.accion();
        bTnt1.accion();
        bTnt2.accion();
        //c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
        //orientaciones (por ejemplo, en el suelo o en la pared).
        System.out.println("-------I N C I S O     C-------");
        bHorno1.colocar("suelo");
        bHorno1.colocar("suelo", 2);        
        
        bCofre1.colocar("suelo");
        bCofre1.colocar("suelo", 4); 

        bTnt1.colocar("suelo");
        bTnt1.colocar("suelo", 6);
        
        //d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
    //distintos mensajes según el tipo de bloque y que puede suceder al romperlos.
    System.out.println("-------I N C I S O     D-------");
        bHorno1.romper();
        bHorno2.romper();
        bCofre1.romper();
        bCofre2.romper();
        bTnt1.romper();
        bTnt2.romper();
        
    
    }
}
