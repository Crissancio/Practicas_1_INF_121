/*
9.Para los bloques del juego Minecraft se usará los siguientes objetos:
 
a)Crear e instanciar al menos 2 bloques de cada tipo

b)Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, 
mostrando distintos mensajes según el tipo de bloque.

c)Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones 
(por ejemplo, en el suelo o en la pared).

d)Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, 
mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.

*/
package Ejercicios.Ejercicio_9;


public class Main {
     public static void main(String[] args) {
        // Crear e instanciar bloques de cada tipo
        BloqueCofre cofre1 = new BloqueCofre(50, 100, "Madera");
        BloqueCofre cofre2 = new BloqueCofre(75, 150, "Hierro");
        
        BloqueTnt tnt1 = new BloqueTnt("Explosivo", 200);
        BloqueTnt tnt2 = new BloqueTnt("Radioactivo", 500);
        
        BloqueHorno horno1 = new BloqueHorno("Rojo", 30);
        BloqueHorno horno2 = new BloqueHorno("Negro", 50);

        // Llamar a los métodos de acción
        cofre1.accion();
        cofre2.accion();
        tnt1.accion();
        tnt2.accion();
        horno1.accion();
        horno2.accion();

        // Sobrecargar el método colocar
        cofre1.colocar("suelo");
        cofre2.colocar("pared");
        tnt1.colocar("suelo");
        tnt2.colocar("pared");
        horno1.colocar("suelo");
        horno2.colocar("pared");

        // Llamar a los métodos romper
        cofre1.romper();
        cofre2.romper();
        tnt1.romper();
        tnt2.romper();
        horno1.romper();
        horno2.romper();
    }
}
