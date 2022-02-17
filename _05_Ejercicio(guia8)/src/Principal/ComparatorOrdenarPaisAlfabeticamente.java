
package Principal;

import java.util.Comparator;


public class ComparatorOrdenarPaisAlfabeticamente implements Comparator<Pais> {

    @Override
    public int compare(Pais o1, Pais o2) {
        return o1.getNombrePais().compareTo(o2.getNombrePais());
    }

}
