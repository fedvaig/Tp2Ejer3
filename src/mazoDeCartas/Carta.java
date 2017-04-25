package mazoDeCartas;

/**
 *
 * @author Federico
 */
public class Carta {

    private String palo;
    private int puntos;
    private boolean bocaAbajo;

    public String getPalo() {
        return palo;
    }

    public int getPuntos() {
        return puntos;
    }

    public Carta(String palo, int puntos) {
        this.palo = palo;
        this.puntos = puntos;
        this.bocaAbajo = true;
    }

    public void mostrar() {
        this.bocaAbajo = false;
    }

    public void ocultar() {
        this.bocaAbajo = true;
    }

    @Override
    public String toString() {
        String x;
        switch (puntos) {
            case 11:
                x = "J de " + palo;
                break;
            case 12:
                x = "Q de " + palo;
                break;
            case 13:
                x = "K de " + palo;
                break;
            default:
                x = puntos + " de " + palo;
                break;
        }
        if (bocaAbajo) {
            x = "CARTA";
        }
        return x;
    }
}
