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
public class BloqueTnt {
    private String tipo;
    private int daño;
public BloqueTnt(String tipo,int daño){
    this.tipo=tipo;
    this.daño=daño;
}
public void accion(){
    System.out.println("Destruye bloques en un área alrededor");
}
public void colocar(String orientacion){
    System.out.println("el tipo "+tipo+" secoloca "+orientacion);
}
public void romper(){
    System.out.println("Si rompes la TNT antes de activarla, simplemente desaparece o se recoge como ítem. Pero si ya está activada (encendida), no puedes detenerla: explotará igual, aunque la rompas.");
}
}
