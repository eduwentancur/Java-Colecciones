
package _04_ejercico;

import java.util.Comparator;


public class ComparatorTitle implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        
        return o1.getTitulo().compareTo(o2.getTitulo());
        
        
        
        
    }

}
