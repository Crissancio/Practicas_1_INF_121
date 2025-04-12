public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Usuario u1 = new Usuario("Ana", 100);
        Usuario u2 = new Usuario("Luis", 200);
        banco.agregarUsuario(u1);
        banco.agregarUsuario(u2);
        banco.depositar("Ana", 50);
        banco.retirar("Luis", 30);
        banco.darBonos();
        banco.totalBanco();
    }
}