
package _04_ejercico;

import java.util.Comparator;


public class ComparatorDirector implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        return o1.getDirector().compareTo(o2.getDirector());
    }

}
