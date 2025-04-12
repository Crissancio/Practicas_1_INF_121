/*Se hace referencia a algunos animales mediante las siguientes clases:
a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
característico.
c) Implementar un método moverse() que indique cómo se mueve cada animal
(correr, saltar, volar, etc.).
*/
package perro;
public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    public Perro(String nombre,int edad,String raza){
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
    }
    public void hacerSonido(){
        System.out.println("el sonido que emite"+nombre+"es: aua aua aaua");
    }
    public void moverse(){
        System.out.println("el perro se mueve de forma terrestre caminan, tambien pueden correr y echarse ");
    }
}
