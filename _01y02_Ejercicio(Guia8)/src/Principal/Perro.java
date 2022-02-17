/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
 * El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
 * decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Perro {

    private ArrayList<String> razas;

    public Perro() {
        this.razas = new ArrayList<>();
    }

    public Perro(ArrayList<String> razas, String nombreDelPerro) {
        this.razas = razas;

    }

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }

    public void guardarRaza() {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int cantidad;
        System.out.println("Ingrese la cantidad de razas que desea agregar");
        cantidad = teclado.nextInt();
        do {
            for (int i = 0; i < cantidad; i++) {

                System.out.println("Ingrese la RAZA de un perro");
                this.razas.add(teclado.next());

            }

            System.out.println("---------¿DESEA INGRESAR OTRA RAZA?---------");
            do {
                System.out.println("----SOLAMENTE INGRESE UNA DE ESTAS OPCIONES-----");
                System.out.println("1-Si");
                System.out.println("2-No");
                cantidad = teclado.nextInt();
            } while (cantidad != 1 && cantidad != 2);

        } while (cantidad != 2);

        System.out.println("----LISTA DE RAZAS----");
        int i = 1;
        for (String razasCreadas : this.razas) {

            System.out.println(i+ "- "+razasCreadas);
            i++;
        }

    }

    /**
     * Continuando el ejercicio anterior, después de mostrar los perros, al
     * usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se
     * buscará el perro en la lista. Si el perro está en la lista, se eliminará
     * el perro que ingresó el usuario y se mostrará la lista ordenada. Si el
     * perro no se encuentra en la lista, se le informará al usuario y se
     * mostrará la lista ordenada.
     */
    public void eliminarPerro() {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Iterator<String> it = this.razas.iterator();
        System.out.println("INGRESE LA RAZA QUE QUIERA ELIMINAR");
        String razaEliminada = teclado.next();
        int contador = 0;
        while (it.hasNext()) {
            if (it.next().equals(razaEliminada)) {
                it.remove();
                contador++;
            }
        }
        if (contador != 0) {
            System.out.println("RAZA ELIMINADA");
        } else {
            System.out.println("NO SE ENCONTRO LA RAZA");
        }
        System.out.println("----LISTA DE RAZAS----");
        int i = 1;
        for (String raza : this.razas) {
            System.out.println(i + "- " + raza);
            i++;
        }

    }

}
