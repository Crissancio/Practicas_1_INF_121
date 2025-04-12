/*Se hace referencia a algunos animales mediante las siguientes clases:
a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
característico.
c) Implementar un método moverse() que indique cómo se mueve cada animal
(correr, saltar, volar, etc.).
*/
package perro;
public class Pajaro {
    private String nombre;
    private String tipo;
    public Pajaro(String nombre,String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }  
        public void hacerSonido(){
        System.out.println("el sonido que emite"+nombre+"es: buuu buuu buu");
    }
        public void moverse(){
        System.out.println("el pajaro puede volar ");
    }
}
