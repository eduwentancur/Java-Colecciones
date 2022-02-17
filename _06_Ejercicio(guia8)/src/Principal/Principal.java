
/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas

 */
package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashMap<String, Double> productos = new HashMap<>();
        String producto;
        double precio$;
        int opcion;
        boolean salida = true;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1 - INGRESAR UN PRODUCTO");
            System.out.println("2 - MODIFICAR EL PRECIO DE UN PRODUCTO");
            System.out.println("3 - ELIMINAR UN PRODUCTO");
            System.out.println("4 - MOSTRAR TODOS LOS PRODUCTOS");
            System.out.println("5 - SALIR !!");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del producto");
                    producto = teclado.next();
                    System.out.println("Ingrese el precio del producto");
                    precio$ = teclado.nextDouble();
                    productos.put(producto, precio$);

                    break;
                case 2:
                    System.out.println("Ingrese el producto que desea cambiar su precio");
                    producto = teclado.next();
                    if (productos.containsKey(producto)) {
                        for (Map.Entry<String, Double> entry : productos.entrySet()) {
                            if (entry.getKey().equals(producto)) {
                                System.out.println("Su precio actual es de");
                                System.out.println(entry.getValue());

                                System.out.println("Ingrese el nuevo precio del producto");
                                precio$ = teclado.nextDouble();
                                productos.put(producto, precio$);
                                System.out.printf("Cambio exitoso ahora el %s tiene el precio de %.2f\n", producto, precio$);
                                break;
                            }
                        }
                    }else{
                        System.out.println("NO SE ENCONTRO ESE PRODUCTO EN LA LISTA");
                        
                    }

                    break;
                case 3:
                    System.out.println("Ingrese el producto que desea eliminar");
                    producto = teclado.next();
                    if (productos.containsKey(producto)) {
                        for (Map.Entry<String, Double> entry : productos.entrySet()) {
                            if (entry.getKey().equals(producto)) {
                                productos.remove(producto);
                                System.out.println("SE ELIMINO CON EXITO");
                                break;
                            }

                        }
                    } else {
                        System.out.println("NO SE ENCONTRO ESE PRODUCTO PARA ELIMINAR");

                    }
                    break;
                case 4:
                    System.out.println("LISTA DE PRODUCTOS");
                    System.out.println(productos.toString());
                    ArrayList<Entry<String, Double>> ordenadoPorPrecios = new ArrayList<>(productos.entrySet());
                    ordenadoPorPrecios.sort(Entry.comparingByValue());
                    System.out.println("--LISTA DE PRODUCTOS ORDENADOS POR PRECIO--");
                    System.out.println(ordenadoPorPrecios.toString());

                    break;

                case 5:
                    System.out.println("CHAU ADIOS");
                    salida = false;
                    break;
                default:
                    System.out.println("INGRESO OPCION INCORRECTA!!!");
                    break;
            }

        } while (salida == true);

    }

}
