/* Ejercicio9 introduccion a POO: Realiza la abstracción de una Computadora 
   a) Muestra los componentes principales de la computadora
   b) Muestra el estado de la computadora (encendido o apagado)
   c) Crea una instancia y simula encender y apagar la computadora.
*/
class Main {
    public static void main(String[] args) {
       // c) Creaando una instancia
        Computadora c1 = new Computadora("xpx", 8, 512);
            //a) Muestra los componentes principales de la computadora
            c1.componentes();
        // b) Muestra el estado de la computadora (encendido o apagado)
            c1.estado();
            c1.encendiendo();
        //c Simula si esta encendido o apagando
            c1.estado();
            c1.apagando();
            c1.estado();
    }
}