package mazoDeCartas;

import java.util.ArrayList;

/**
 *
 * @author Federico
 */
public class Mano {
    private ArrayList<Carta> cartas;
    
    public void recibirCartas(Carta x){
        cartas.add(x);
    }
    
    public int puntosDeLaMano(){
        int total=0;
        for (Carta carta : cartas) {
            total+=carta.getPuntos();
        }
        return total;
    }
}
