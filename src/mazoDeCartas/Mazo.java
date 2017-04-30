package mazoDeCartas;

/**
 *
 * @author Federico
 */
public class Mazo {

    private Carta[] mazo;
    //El puntero indica cuantas cartas se han repartido
    private int puntero;

    public Mazo() {
        puntero = 0;
        int pos;
        mazo = new Carta[52];
        for (int i = 1; i <= 13; i++) {
            pos = mezclar();
            while (mazo[pos] != null) {
                pos = mezclar();
            }
            mazo[pos] = new Carta("corazón", i);
        }
        for (int i = 1; i <= 13; i++) {
            pos = mezclar();
            while (mazo[pos] != null) {
                pos = mezclar();
            }
            mazo[pos] = new Carta("trébol", i);
        }
        for (int i = 1; i <= 13; i++) {
            pos = mezclar();
            while (mazo[pos] != null) {
                pos = mezclar();
            }
            mazo[pos] = new Carta("picas", i);
        }
        for (int i = 1; i <= 13; i++) {
            pos = mezclar();
            while (mazo[pos] != null) {
                pos = mezclar();
            }
            mazo[pos] = new Carta("diamante", i);
        }
    }

    private int mezclar() {
        double pos;
        pos = Math.random() * 100;
        if (pos <= 1.9231) {
            return 0;
        }
        if (pos <= 3.8462) {
            return 1;
        }
        if (pos <= 5.7693) {
            return 2;
        }
        if (pos <= 7.6924) {
            return 3;
        }
        if (pos <= 9.6155) {
            return 4;
        }
        if (pos <= 11.5386) {
            return 5;
        }
        if (pos <= 13.4617) {
            return 6;
        }
        if (pos <= 15.3848) {
            return 7;
        }
        if (pos <= 17.3079) {
            return 8;
        }
        if (pos <= 19.231) {
            return 9;
        }
        if (pos <= 21.1541) {
            return 10;
        }
        if (pos <= 23.0772) {
            return 11;
        }
        if (pos <= 25.0003) {
            return 12;
        }
        if (pos <= 26.9234) {
            return 13;
        }
        if (pos <= 28.8465) {
            return 14;
        }
        if (pos <= 30.7696) {
            return 15;
        }
        if (pos <= 32.6927) {
            return 16;
        }
        if (pos <= 34.6158) {
            return 17;
        }
        if (pos <= 36.5389) {
            return 18;
        }
        if (pos <= 38.462) {
            return 19;
        }
        if (pos <= 40.3851) {
            return 20;
        }
        if (pos <= 42.3082) {
            return 21;
        }
        if (pos <= 44.2313) {
            return 22;
        }
        if (pos <= 46.1544) {
            return 23;
        }
        if (pos <= 48.0775) {
            return 24;
        }
        if (pos <= 50.0006) {
            return 25;
        }
        if (pos <= 51.9237) {
            return 26;
        }
        if (pos <= 53.8468) {
            return 27;
        }
        if (pos <= 55.7699) {
            return 28;
        }
        if (pos <= 57.693) {
            return 29;
        }
        if (pos <= 59.6161) {
            return 30;
        }
        if (pos <= 61.5392) {
            return 31;
        }
        if (pos <= 63.4623) {
            return 32;
        }
        if (pos <= 65.3854) {
            return 33;
        }
        if (pos <= 67.3085) {
            return 34;
        }
        if (pos <= 69.2316) {
            return 35;
        }
        if (pos <= 71.1547) {
            return 36;
        }
        if (pos <= 73.0778) {
            return 37;
        }
        if (pos <= 75.0009) {
            return 38;
        }
        if (pos <= 76.924) {
            return 39;
        }
        if (pos <= 78.8471) {
            return 40;
        }
        if (pos <= 80.7702) {
            return 41;
        }
        if (pos <= 82.6933) {
            return 42;
        }
        if (pos <= 84.6164) {
            return 43;
        }
        if (pos <= 86.5395) {
            return 44;
        }
        if (pos <= 88.4626) {
            return 45;
        }
        if (pos <= 90.3857) {
            return 46;
        }
        if (pos <= 92.3088) {
            return 47;
        }
        if (pos <= 94.2319) {
            return 48;
        }
        if (pos <= 96.1550) {
            return 49;
        }
        if (pos <= 98.0781) {
            return 50;
        }
        return 51;
    }

    public boolean isVacio() {
        return puntero == 52;
    }

    public Carta darCarta() {
        Carta x = mazo[puntero];
        puntero++;
        return x;
    }
}
