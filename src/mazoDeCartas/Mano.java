package mazoDeCartas;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class Mano {

    private ArrayList<Carta> cartas;
    private String nombre;
    private boolean cartasVolteadas;

    public Mano(String nombre) {
        this.nombre = nombre;
        cartas = new ArrayList<>();
        cartasVolteadas = false;
    }

    public void recibirCartas(Carta x) {
        if (cartasVolteadas) {
            x.mostrar();
        }
        cartas.add(x);
    }

    public void setCartasVolteadas(boolean cartasVolteadas) {
        this.cartasVolteadas = cartasVolteadas;
    }

    public void voltearCartas() {
        for (Carta carta : cartas) {
            if (cartasVolteadas) {
                carta.mostrar();
            } else {
                carta.ocultar();
            }
        }
    }

    public int puntosDeLaMano() {
        int total = 0;
        for (Carta carta : cartas) {
            if (carta.getPuntos() >= 11 && carta.getPuntos() <= 13) {
                total += 10;
            } else {
                total += carta.getPuntos();
            }
        }
        return total;
    }

    public void mostrarMano() {
        System.out.println("=======================================");
        System.out.println("Mano de " + this.getNombre().toUpperCase());
        for (Carta c : cartas) {
            System.out.print("  " + c + "  ");
        }
        System.out.println("");
        if (cartasVolteadas) {
            System.out.println("Puntos: " + this.puntosDeLaMano());
        }
        System.out.println("=======================================");
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
}
