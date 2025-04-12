/*
7.Se hace referencia a algunos animales mediante las siguientes clases:

a)Instanciar 1 Perro, 1 Gato y 1 Pájaro.
b)Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
c)Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).

*/
package Ejercicios.Ejercicio_7;


public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Cisco",3,"Pastor Aleman");
        Gato gato1 = new Gato("Toto","Plomo");
        Pajaro pajaro1 = new Pajaro("Poli","Loro");
        
        Perro perro2 = new Perro("Shadow",3,"Pastor Aleman");
        
        perro1.hacerSonido();
        perro1.moverse();
        gato1.hacerSonido();
        gato1.moverse();
        pajaro1.hacerSonido();
        pajaro1.moverse();
        perro2.hacerSonido();
        perro2.moverse();
    }
}
