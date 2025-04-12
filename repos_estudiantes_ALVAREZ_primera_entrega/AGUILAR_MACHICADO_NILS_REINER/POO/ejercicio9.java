public class Computadora {
    String[] componentes;
    boolean encendida;

    public Computadora(String[] componentes) {
        this.componentes = componentes;
        this.encendida = false;
    }

    public void mostrarComponentes() {
        System.out.println("Componentes:");
        for (String c : componentes) {
            System.out.println("- " + c);
        }
    }

    public void encender() {
        encendida = true;
        System.out.println("Computadora encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Computadora apagada.");
    }

    public void estado() {
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }

    public static void main(String[] args) {
        Computadora pc = new Computadora(new String[]{"Procesador", "Memoria RAM", "Disco Duro", "Placa Madre"});
        pc.mostrarComponentes();
        pc.encender();
        pc.estado();
        pc.apagar();
        pc.estado();
    }
}
