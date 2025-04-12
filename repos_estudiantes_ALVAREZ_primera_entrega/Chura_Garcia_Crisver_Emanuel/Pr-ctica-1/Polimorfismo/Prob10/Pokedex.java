//10. Se desarrolla un Pokedex donde se usarán las siguientes clases:
public class Pokedex {
    public static void main(String[] args) {
        // a) Crea e instancia al menos 2 pokemones de cada tipo.
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 100, 5);
        PokemonAgua psyduck = new PokemonAgua("Psyduck", 90, 4);

        PokemonFuego charmander = new PokemonFuego("Charmander", 80, 6, 10);
        PokemonFuego vulpix = new PokemonFuego("Vulpix", 85, 5, 8);

        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 95);
        PokemonPlanta oddish = new PokemonPlanta("Oddish", 88);

        // b) Sobrescribe atacar() en PokemonAgua, PokemonFuego y PokemonPlanta,
        // haciendo que el ataque varíe según el tipo de Pokémon.
        squirtle.atacar();
        charmander.atacar();
        // c) Sobrecarga atacar() en PokemonFuego para permitir ataques con y sin nombre
        // específico (por ejemplo, atacar() usa un ataque por defecto, mientras que
        // atacar(String ataque) permite especificar uno).
        charmander.atacar("Llamarada");
        bulbasaur.atacar();

        // d) Sobrecarga recibirAtaque(int daño) y recibirAtaque() en la clase Pokemon y
        // sobrescríbelo en las subclases para reducir puntos de vida según el tipo de
        // ataque recibido(si es el primero, reduces los puntos de vida ingresados, y si
        // es el segundo reduces solo 5 puntos de vida).
        charmander.recibirAtaque(20);
        squirtle.recibirAtaque();

        // Mostrando resultados
        System.out.println(charmander);
        System.out.println(squirtle);
    }
}