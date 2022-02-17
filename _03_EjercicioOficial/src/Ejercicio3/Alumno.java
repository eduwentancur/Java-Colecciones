package Ejercicio3;


import java.util.ArrayList;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
 * 
 */


public class Alumno {

    private String nombreDelAlumno ;
    private ArrayList<Integer> notas ;

    public Alumno() {
        this.notas = new ArrayList<>(); 
    }

    public Alumno(String nombreDelAlumno, ArrayList<Integer> notas) {
        this.nombreDelAlumno = nombreDelAlumno;
        this.notas = notas;
    }

    public String getNombreDelAlumno() {
        return nombreDelAlumno;
    }

    public void setNombreDelAlumno(String nombreDelAlumno) {
        this.nombreDelAlumno = nombreDelAlumno;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreDelAlumno=" + nombreDelAlumno + ", notas=" + notas + '}';
    }
    
    
    
    
    
    
    
}
