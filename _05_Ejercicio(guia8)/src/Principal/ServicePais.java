
package Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;


public class ServicePais {

    private HashSet<Pais> paises ;

    public ServicePais() {
        this.paises = new HashSet<>();
    }

    public ServicePais(HashSet<Pais> paises) {
        this.paises = paises;
    }
    
    public void ingresaPais(){
        Pais pais = new Pais();
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("INGRESE EL NOMBRE DEL PAIS");
        pais.setNombrePais(teclado.next());
     
        guardarPais(pais);
        
    }
    
    public void guardarPais(Pais paisIngresado){
        this.paises.add(paisIngresado);
        
    }
    
    public void mostrarTodosLosPaises(){
        System.out.println("-------LISTA DE PAISES----");
        for (Pais pais : paises) {
            System.out.println(pais);
        }
        
        System.out.println("");
    
    }
    
    public void ordenadosLosPaises(){
        
        ArrayList<Pais> listaPaises = new ArrayList<>(paises);
        
        Collections.sort(listaPaises, new ComparatorOrdenarPaisAlfabeticamente());
        System.out.println("----ORDENANDO LOS PAISES----");
        for (Pais pais : listaPaises) {
            System.out.println(pais);
        }
        System.out.println("");
    
    }
    /**
     * Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario
     */
    
    public void eliminarPais(){
        
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("INGRESE EL PAIS QUE DESEA ELIMINAR DE LA LISTA");
        String nombrePais=teclado.next();
        
        Iterator<Pais> it =paises.iterator();
        int contador=0;
        while (it.hasNext()) {
            if (it.next().getNombrePais().equals(nombrePais)) {
                it.remove();
                contador++;
                System.out.println("EL PAIS FUE ELIMINADO");
            }
          
        }
        
        if (contador == 0) {
            System.out.println("NO SE ENCONTRO ESE PAIS EN LA LISTA!!!!");
        }
    
        
    
    }
    
}
