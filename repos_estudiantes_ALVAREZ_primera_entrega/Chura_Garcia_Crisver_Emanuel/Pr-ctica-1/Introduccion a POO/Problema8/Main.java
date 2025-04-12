public class Main {
    public static void main(String[] args) {
        Banco BancoFie = new Banco();
        BancoFie.agregar_Usuario(new Persona("Crisver", 1789.56f));
        BancoFie.agregar_Usuario(new Persona("Grover", 7894.46f));
        BancoFie.agregar_Usuario(new Persona("Crisney", 94462.25f));
        BancoFie.agregar_Usuario(new Persona("Crismar", 2890.67f));
        BancoFie.Adicion("Grover", 25.00f);
        BancoFie.Retiro("Crisney", 800.00f);
        BancoFie.Abono();
        BancoFie.Total();
    }
}