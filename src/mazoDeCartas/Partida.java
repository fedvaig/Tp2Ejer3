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
        //Empieza la partida
        do {
            //Se reparten las cartas
            m = new Mazo();
            croupier = new Mano("croupier");
            jugador = new Mano("Jugador1");
            croupier.recibirCartas(m.darCarta());
            jugador.recibirCartas(m.darCarta());
            //Se ponen en la mesa
            croupier.mostrarMano();
            jugador.mostrarMano();
            //Comeinza el jugador a solicitar cartas mientras no pierda
            boolean masCartas = false;
            while (jugador.puntosDeLaMano() < 21 && masCartas == true) {

            }
        } while (true);

    }
}
