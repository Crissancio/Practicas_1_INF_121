public class Main {
    public static void main(String[] args) {
        Celular cel = new Celular();
        Aplicacion app1 = new Aplicacion("Facebook", 300);
        Aplicacion app2 = new Aplicacion("Notas", 50);
        cel.instalar(app1);
        cel.instalar(app2);
        cel.usar("Facebook", 30);
        cel.mostrar();
    }
}
