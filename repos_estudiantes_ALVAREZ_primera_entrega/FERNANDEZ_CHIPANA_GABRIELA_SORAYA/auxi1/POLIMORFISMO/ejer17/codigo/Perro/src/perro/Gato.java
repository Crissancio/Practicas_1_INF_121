/*Se hace referencia a algunos animales mediante las siguientes clases:
a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
característico.
c) Implementar un método moverse() que indique cómo se mueve cada animal
(correr, saltar, volar, etc.).
*/
package perro;
public class Gato {
      private String nombre;
      private String color;
    public Gato(String nombre,String color){
        this.nombre=nombre;
        this.color=color;
    }
        public void hacerSonido(){
        System.out.println("el sonido que emite"+nombre+"es: mmiau miau miau");
    }
        public void moverse(){
        System.out.println("el gato se mueve de forma terrestre caminan, tambien pueden correr y echarse ");
    }
}
