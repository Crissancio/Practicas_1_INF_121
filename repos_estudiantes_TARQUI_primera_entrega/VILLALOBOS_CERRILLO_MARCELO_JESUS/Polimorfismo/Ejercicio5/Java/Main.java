public class Main {
    public static void main(String[] args) {
        Oficina oficina1 = new Oficina(50, 25, 8);
        Oficina oficina2 = new Oficina(35, 65, 15);    
        Aula aula1 = new Aula("A3-210519", 150, 150);
        Aula aula2 = new Aula("A1-210409", 100, 100);
        Laboratorio laboratorio1 = new Laboratorio("A1-Lab1", 150, 75, 150);
        oficina1.mostrar();
        oficina2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        laboratorio1.mostrar();    
        oficina1.cantidadDeMuebles();
        oficina2.cantidadDeMuebles();
        aula1.cantidadDeMuebles();
        aula2.cantidadDeMuebles();
        laboratorio1.cantidadDeMuebles();
    }
}