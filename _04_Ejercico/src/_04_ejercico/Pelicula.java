package _04_ejercico;

public class Pelicula implements Comparable<Pelicula> {

    private String titulo;
    private String director;
    int duracionDeLaPelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracionDeLaPelicula) {
        this.titulo = titulo;
        this.director = director;
        this.duracionDeLaPelicula = duracionDeLaPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracionDeLaPelicula() {
        return duracionDeLaPelicula;
    }

    public void setDuracionDeLaPelicula(int duracionDeLaPelicula) {
        this.duracionDeLaPelicula = duracionDeLaPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionDeLaPelicula=" + duracionDeLaPelicula + '}';
    }

    @Override
    public int compareTo(Pelicula o) {
        if (duracionDeLaPelicula > o.duracionDeLaPelicula) {
            return -1;
        } else if (duracionDeLaPelicula < o.duracionDeLaPelicula) {
            return 1;
        } else {
            return 0;
        }
        

    }

    

}
