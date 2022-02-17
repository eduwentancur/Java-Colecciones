/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación
 */

package _04_ejercico;


import java.util.Locale;
import java.util.Scanner;


public class PrincipalMain {

    
    public static void main(String[] args) {
        
        ServicePelicula service = new ServicePelicula();
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        String opcion;
        do {
            
            System.out.println("DESEA AGREGAR UNA PELICULA ???? ");
            System.out.println("SI - [S]");
            System.out.println("NO - [N]");
            opcion =teclado.next().toUpperCase();
            if (opcion.equals("S")) {
                service.crearPelicula();
            }
         
        } while (!opcion.equals("N"));
        
        service.mostrarPeliculas();
        service.peliculasMasDe1Hora();
        service.ordenarDuracionDescendente();
        service.ordenaDuracionMenorAMayor();
        service.ordenaPorTitulo();
        service.ordenaPorDirector();
        
        
        
        
    }

}
