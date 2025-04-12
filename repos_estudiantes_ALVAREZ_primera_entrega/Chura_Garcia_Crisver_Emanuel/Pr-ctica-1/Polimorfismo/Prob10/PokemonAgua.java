//10. Se desarrolla un Pokedex donde se usarán las siguientes clases:
public class PokemonAgua extends Pokemon {
    int nivel;

    PokemonAgua(String nombre, int puntosDeVida, int nivel) {
        super(nombre, puntosDeVida);
        this.nivel = nivel;
    }

    @Override
    void atacar() {
        System.out.println(nombre + " usa un ataque de agua. ¡Es muy efectivo!");
    }
}
