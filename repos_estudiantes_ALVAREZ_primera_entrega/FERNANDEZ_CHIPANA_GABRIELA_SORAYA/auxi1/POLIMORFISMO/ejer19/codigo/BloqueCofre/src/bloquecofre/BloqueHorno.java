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
public class BloqueHorno {
    private String color;
    private int capacidadComida;
public  BloqueHorno(String color,int capacidadComida){
    this.color=color;
    this.capacidadComida=capacidadComida;
}
public void accion(){
    System.out.println(" Uno de los bloques más "
            + "esenciales en Minecraft, especialmente si jugás en modo supervivencia.");
}
public void romper(){
    System.out.println("Al romper un horno, este se convierte en un ítem que podés recoger, pero pierde todo lo que tenía dentro, como combustible o alimentos cocinándose. Es recomendable vaciarlo antes de romperlo.");
}
}
