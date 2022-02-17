/**
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario
 */

package Principal;

import java.util.Locale;
import java.util.Scanner;


public class PrincipalMain {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ServicePais service = new ServicePais();
        String opcion;
        do {
            
            System.out.println("Desea ingresar un pais?");
            System.out.println("SI - [S] / Salir - [N]");
            opcion = teclado.next().toUpperCase();
            if (opcion.equals("S")) {
               service.ingresaPais();
            }
          
        } while (!opcion.equals("N"));
        
        service.mostrarTodosLosPaises(); //MOSTRAMOS LOS PAISES QUE SE INGRESO 
        service.ordenadosLosPaises();   // ORDENAMOS LA LISTA DE PAISES
        service.eliminarPais();         //ELIMINAMOS PAIS
        service.ordenadosLosPaises();   // MOSTRAMOS LA LISTA ORDENADA DE TODOS LOS PAISES
        
    }

}
