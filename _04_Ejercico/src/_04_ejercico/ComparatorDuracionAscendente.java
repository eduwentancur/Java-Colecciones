
package _04_ejercico;

import java.util.Comparator;


public class ComparatorDuracionAscendente implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        if (o1.duracionDeLaPelicula > o2.duracionDeLaPelicula) {
            return 1;
        } else if (o1.duracionDeLaPelicula < o2.duracionDeLaPelicula) {
            return -1;
        } else {
            return 0;
        }
        
        
        
        
        
    }

}
