/* Ejercicio7 introduccion a POO: Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
           a) Crea un método para instalar una nueva aplicación
           b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza un 1% cada 10 minutos de uso)
           c) Muestra el porcentaje de batería restante
           d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el mensaje de celular apagado */
        
class Main {
    public static void main(String[] args) {
        // a) instanciamos aplicaciones
        Celular c1 = new Celular();
        c1.instalandoApp("telegram", 10);
        c1.instalandoApp("Facebook", 30);
        c1.instalandoApp("Call of duty", 15);
        // b) Uso de apps.
        // c) Muestra el porcentaje de batería restante.
        // d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el  mensaje de celular apagado en este caso no se muestra xq aún hay bateria
        c1.usandoApp("telegram", 23, 12);  
        c1.usandoApp("telegram", 30, 7);   
        c1.usandoApp("Call of duty", 19, 40); 
        c1.usandoApp("Facebook", 50, 100); 
    }
}