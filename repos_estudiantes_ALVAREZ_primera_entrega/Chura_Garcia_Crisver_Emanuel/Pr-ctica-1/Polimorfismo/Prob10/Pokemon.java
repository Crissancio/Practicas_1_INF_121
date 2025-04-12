//10. Se desarrolla un Pokedex donde se usarán las siguientes clases:
abstract class Pokemon {
    String nombre;
    int puntosDeVida;

    Pokemon(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }

    abstract void atacar();

    void recibirAtaque(int daño) {
        puntosDeVida -= daño;
    }

    void recibirAtaque() {
        puntosDeVida -= 5;
    }

    @Override
    public String toString() {
        return nombre + " - Puntos de Vida: " + puntosDeVida;
    }
}