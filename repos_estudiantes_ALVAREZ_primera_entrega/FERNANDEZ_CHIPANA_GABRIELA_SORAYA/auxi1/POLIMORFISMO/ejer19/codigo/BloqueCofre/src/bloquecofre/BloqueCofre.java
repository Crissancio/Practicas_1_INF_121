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
public class BloqueCofre {
     private int capacidad;
    private int resistencia;
    private String tipo;
public  BloqueCofre(int capacidad,int resistencia,String tipo){
    this.capacidad=capacidad;
    this.resistencia=resistencia;
    this.tipo=tipo;
    
}
public void accion(){
    System.out.println("El cofre en Minecraft sirve para guardar objetos, herramientas, bloques y cualquier ítem del juego que quieras conservar sin tenerlo en tu inventario.");
}
public void colocar(String orientacion){
    System.out.println("el tipo "+tipo+" secoloca "+orientacion);
}
public void romper(){
    System.out.println("Cuando se rompe un cofre, se destruye y cae como ítem, y todo lo que tenía dentro se derrama al suelo, permitiéndote recogerlo. Si es un cofre doble, solo se rompe la mitad que golpeaste.");
}
}
