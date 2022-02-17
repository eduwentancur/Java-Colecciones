package _04_ejercico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class ServicePelicula {

    private ArrayList<Pelicula> listaDePeliculas;

    public ServicePelicula() {
        this.listaDePeliculas = new ArrayList<>();
    }

    public ServicePelicula(ArrayList<Pelicula> listaDePeliculas) {
        this.listaDePeliculas = listaDePeliculas;
    }

    public void crearPelicula() {
        Pelicula pelicula = new Pelicula();
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("INGRESE EL TITULO DE LA PELICULA");
        pelicula.setTitulo(teclado.next());
        System.out.println("INGRESE EL DIRECTOR DE LA PELICULA");
        pelicula.setDirector(teclado.next());
        System.out.println("INGRESE LA CANTIDAD QUE DURA LA PELICULA EN HORAS");
        pelicula.setDuracionDeLaPelicula(teclado.nextInt());

        agregarPelicula(pelicula);

    }

    public void agregarPelicula(Pelicula pelicula) {

        this.listaDePeliculas.add(pelicula);

    }

    public void mostrarPeliculas() {
        System.out.println("----LISTA DE LAS PELICULAS----");
        for (Pelicula lista : listaDePeliculas) {
            System.out.println(lista);
        }
        System.out.println("\n");

    }

    public void peliculasMasDe1Hora() {
        System.out.println("---PELICULAS CON DURACION MAYOR A 1 HORA---");
        for (Pelicula lista : listaDePeliculas) {
            if (lista.getDuracionDeLaPelicula() > 1) {
                System.out.println(lista);
            }

        }
        System.out.println("\n");

    }
    // Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
    //en pantalla.

    public void ordenarDuracionDescendente() {

        Collections.sort(listaDePeliculas);
        System.out.println("LISTA ORDENADA POR DURACION DE [MAYOR A MENOR]");
        for (Pelicula lista : listaDePeliculas) {
            System.out.println(lista);
        }
        System.out.println(" ");

    }

    /**
     * Ordenar las películas de acuerdo a su duración (de menor a mayor) y
     * mostrarlo en pantalla
     */
    
    
    public void ordenaDuracionMenorAMayor(){
        Collections.sort(listaDePeliculas, new ComparatorDuracionAscendente());
        System.out.println("--LISTA ORDENADA POR DURACION [MENOR A MAYOR]");
        for (Pelicula lista : listaDePeliculas) {
            System.out.println(lista);
        }
        System.out.println("");
    }
    /**
     * Ordenar las películas por titulo, alfabéticamente y mostrarlo en
     * pantalla.
     */
    public void ordenaPorTitulo() {

        Collections.sort(listaDePeliculas, new ComparatorTitle());
        System.out.println("--LISTA ORDENADA POR TITULO ALFABETICAMENTE---");
        for (Pelicula lista : listaDePeliculas) {
            System.out.println(lista);
        }
        System.out.println("");
    }
//    Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla

    
    public void ordenaPorDirector(){
    
        Collections.sort(listaDePeliculas, new ComparatorDirector());
        System.out.println("--LISTA ORDENADA POR DIRECTOR ALFABETICAMENTE---");
        for (Pelicula lista : listaDePeliculas) {
            System.out.println(lista);
        }
    
    }
    
}
