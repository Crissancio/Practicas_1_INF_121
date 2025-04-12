//10. Se desarrolla un Pokedex donde se usarán las siguientes clases:
public class PokemonPlanta extends Pokemon {
    PokemonPlanta(String nombre, int puntosDeVida) {
        super(nombre, puntosDeVida);
    }

    @Override
    void atacar() {
        System.out.println(nombre + " lanza un ataque de hoja afilada. ¡Cuidado con las espinas!");
    }
}