public class Main {
    public static void main(String[] args) {
        Agua squirtle = new Agua("Squirtle", 100, 5);
        Agua totodile = new Agua("Totodile", 95, 6);
        Fuego charmander = new Fuego("Charmander", 90, 5, 10);
        Fuego vulpix = new Fuego("Vulpix", 85, 4, 8);
        Planta bulbasaur = new Planta("Bulbasaur", 100, 5);
        Planta chikorita = new Planta("Chikorita", 90, 4);
        squirtle.atacar();
        charmander.atacar("Lanzallamas");
        bulbasaur.recibirAtaque(20);
        vulpix.recibirAtaque();
        System.out.println("Vida de Bulbasaur: " + bulbasaur.puntosdevida);
        System.out.println("Vida de Vulpix: " + vulpix.puntosdevida);
    }
}
