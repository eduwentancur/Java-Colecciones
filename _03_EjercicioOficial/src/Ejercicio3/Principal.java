package Ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ServiceAlumno servicio = new ServiceAlumno();
        String opcion = "";
        do {
            
            System.out.println("¿Desea agregar un alumno a la lista ?");
            System.out.println("Si:[S] |||| No: [N]");
            opcion = teclado.next().toUpperCase();
            if (opcion.equals("S")) {
                servicio.crearAlumno();
            }
            System.out.println("\n");

        } while (!"N".equals(opcion));
        
        servicio.notaFinal();
        
    }

}


/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
 */
