package Ejercicio3;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ServiceAlumno {

    private ArrayList<Alumno> listaAlumnos;

    public ServiceAlumno() {
        this.listaAlumnos = new ArrayList<>();
    }

    public void crearAlumno() {
        Alumno alumno1 = new Alumno();
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese nombre del alumno");
        alumno1.setNombreDelAlumno(teclado.next());
        System.out.println("Ingrese nota 1");
        int nota1 = teclado.nextInt();
        System.out.println("Ingrese nota 2");
        int nota2 = teclado.nextInt();
        System.out.println("Ingrese nota 3");
        int nota3 = teclado.nextInt();

        
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno1.setNotas(notas);

        agregarAlumno(alumno1);

        mostrarLista();

    }

    public void agregarAlumno(Alumno alumno) {

        this.listaAlumnos.add(alumno);

    }

    public void mostrarLista() {

        for (Alumno lista : listaAlumnos) {
            System.out.println(lista);
        }

    }

    public void notaFinal() {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int contador = 0;
        System.out.println("INGRESE NOMBRE DEL ALUMNO QUE DESEA CALCULAR LA NOTA FINAL");
        String nom = teclado.next();
        for (Alumno lista : listaAlumnos) {
            double promedio = 0;
            if (lista.getNombreDelAlumno().equals(nom)) {

                for (int i = 0; i < lista.getNotas().size(); i++) {
                    promedio += lista.getNotas().get(i);

                }
                System.out.printf("El promedio final de %s es de %.2f ", nom, promedio / 3);
                System.out.println("");
                contador++;

            }

        }

        if (contador == 0) {
            System.out.println("NO SE ENCONTRO EN LA LISTA EL ALUMNO INGRESADO");
        }

    }

}

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el main deberemos tener un bucle
 * que crea un objeto Alumno. Se pide toda la información al usuario y ese
 * Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si
 * quiere crear otro Alumno o no.
 *
 *
 * Después de ese bluce tendremos el siguiente método en la clase Alumno: Método
 * notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
 * nota final y se lo busca en la lista de Alumnos. Si está en la lista, se
 * llama al método. Dentro del método se usará la lista notas para calcular el
 * promedio final de alumno. Siendo este promedio final, devuelto por el método
 * y mostrado en el main
 */
