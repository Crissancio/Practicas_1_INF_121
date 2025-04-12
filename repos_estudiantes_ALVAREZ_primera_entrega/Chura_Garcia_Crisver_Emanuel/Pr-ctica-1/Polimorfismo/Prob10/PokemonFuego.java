//10. Se desarrolla un Pokedex donde se usarán las siguientes clases:
public class PokemonFuego extends Pokemon {
    int nivel;
    int quemadura;

    PokemonFuego(String nombre, int puntosDeVida, int nivel, int quemadura) {
        super(nombre, puntosDeVida);
        this.nivel = nivel;
        this.quemadura = quemadura;
    }

    @Override
    void atacar() {
        System.out.println(nombre + " lanza una llamarada intensa. ¡Incendio garantizado!");
    }

    void atacar(String ataque) {
        System.out.println(nombre + " usa el ataque especial: " + ataque);
    }
}
