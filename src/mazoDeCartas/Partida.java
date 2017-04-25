package mazoDeCartas;

/**
 *
 * @author Federico
 */
public class Partida {

    private Mazo m;
    private Mano croupier;
    private Mano jugador;

    public Partida() {
        m = new Mazo();
        croupier = new Mano();
        jugador = new Mano();
        croupier.recibirCartas(m.darCarta());
        jugador.recibirCartas(m.darCarta());
    }
}
