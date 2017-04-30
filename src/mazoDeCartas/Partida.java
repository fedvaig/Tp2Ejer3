package mazoDeCartas;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Partida {

    private Mazo m;
    private Mano croupier;
    private Mano jugador;

    public Partida() {

    }

    public void jugar() {
        Scanner c = new Scanner(System.in);
        String op;

        do {
            //Empieza la partida
            m = new Mazo();
            croupier = new Mano("croupier");
            croupier.setCartasVolteadas(false);
            jugador = new Mano("Jugador1");
            jugador.setCartasVolteadas(true);
            //Se reparten las cartas
            croupier.recibirCartas(m.darCarta());
            jugador.recibirCartas(m.darCarta());
            //Se ponen en la mesa
            croupier.mostrarMano();
            jugador.mostrarMano();
            //Comeinza el jugador a solicitar cartas mientras no pierda
            boolean masCartas = false;
            System.out.print("Otra carta? (S/N): ");
            op = c.next();
            masCartas = op.equals("S") || op.equals("s");
            int contador = 0;
            while (jugador.puntosDeLaMano() < 21 && masCartas == true && contador < 3) {
                jugador.recibirCartas(m.darCarta());
                contador++;
                croupier.mostrarMano();
                jugador.mostrarMano();
                if (jugador.puntosDeLaMano() < 21 && contador < 3) {
                    System.out.print("Otra carta? (S/N): ");
                    op = c.next();
                    masCartas = op.equals("S") || op.equals("s");
                }
            }
            if (jugador.puntosDeLaMano() > 21) {
                System.out.println("----------------------------");
                System.out.println("Tienes " + jugador.puntosDeLaMano() + " puntos.");
                System.out.println("Has PERDIDO.");
            } else {
                contador = 0;
                croupier.setCartasVolteadas(true);
                croupier.voltearCartas();
                while (croupier.puntosDeLaMano() < 21 && contador < 3 && croupier.puntosDeLaMano() < 17) {
                    croupier.recibirCartas(m.darCarta());
                    contador++;
                    croupier.mostrarMano();
                    jugador.mostrarMano();
                }
                System.out.println("----------------------------");
                System.out.println(croupier.getNombre() + ": " + croupier.puntosDeLaMano() + " puntos.");
                System.out.println(jugador.getNombre() + ":" + jugador.puntosDeLaMano() + " puntos.");
                if (jugador.puntosDeLaMano() == croupier.puntosDeLaMano()) {
                    System.out.println("TABLAS");
                } else if (jugador.puntosDeLaMano() > croupier.puntosDeLaMano() || croupier.puntosDeLaMano() > 21) {
                    System.out.println("GANASTE!!!!!!");
                } else {
                    System.out.println("Has PERDIDO.");
                }
            }
            System.out.println("----------------------------");
            System.out.println("FIN DE PARTIDA");
            System.out.print("Jugar de nuevo? (S/N): ");
            op = c.next();
        } while (op.equals("S") || op.equals("s"));

    }
}
