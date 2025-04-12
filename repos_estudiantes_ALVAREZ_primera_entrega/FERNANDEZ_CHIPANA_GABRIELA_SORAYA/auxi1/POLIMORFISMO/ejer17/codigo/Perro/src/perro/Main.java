/*Se hace referencia a algunos animales mediante las siguientes clases:
a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
característico.
c) Implementar un método moverse() que indique cómo se mueve cada animal
(correr, saltar, volar, etc.).
*/
package perro;
public class Main {
    public static void main(String[] args) {
        Perro perro=new Perro("tali",3,"Salchicha");
        Gato gato=new Gato("vodoke","blanco");
        Pajaro pajaro=new Pajaro("blue","Zancudas");
        perro.hacerSonido();
        perro.moverse();
        gato.hacerSonido();
        gato.moverse();
        pajaro.hacerSonido();
        pajaro.moverse();
    }
    
}
