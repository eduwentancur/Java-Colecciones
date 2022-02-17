# Java-Colecciones
Una colección representa un grupo de objetos. Esto objetos son conocidos como
elementos. Cuando queremos trabajar con un conjunto de elementos, necesitamos un
almacén donde poder guardarlos. Las colecciones nos dan la opción de almacenar
cualquier tipo de objeto, esto incluye los objetos de tipo de datos. Por lo que, para crear una
colección de un tipo de dato, no podremos usar los datos primitivos, sino sus objetos. Por
ejemplo: en vez de int, hay que utilizar Integer.


## LISTAS

Las listas modelan una colección de objetos ordenados por posición. La principal diferencia
entre las listas y los arreglos tradicionales, es que la lista crece de manera dinámica a
medida que se van agregando objetos. No necesitamos saber de antemano la cantidad de
elementos con la que vamos a trabajar. El framework trae varias implementaciones de
distintos tipos de listas tales como ArrayList, LinkedList

- ArrayList: se implementa como un arreglo de tamaño variable. A medida que se agregan
más elementos, su tamaño aumenta dinámicamente. Es el tipo más común.
Ejemplo de un ArrayList de numeros:

```java
ArrayList<Integer> numeros = new ArrayList();
```
- LinkedList: se implementa como una lista de doble enlace. Su rendimiento al agregar y
quitar es mejor que Arraylist, pero peor en los métodos set y get.
Ejemplo de una LinkedList de numeros:

```java
LinkedList<Integer> numeros = new LinkedList();
```
## CONJUNTOS
Los conjuntos o en ingles Set modelan una colección de objetos de una misma clase donde
cada elemento aparece solo una vez, no puede tener duplicados, a diferencia de una lista
donde los elementos podían repetirse. El framework trae varias implementaciones de
distintos tipos de conjuntos:3
- HashSet, se implementa utilizando una tabla hash para darle un valor único a cada
elemento y de esa manera evitar los duplicados. Los métodos de agregar y eliminar
tienen una complejidad de tiempo constante por lo que tienen mejor rendimiento que el
Treeset.
Ejemplo de un HashSet de cadenas:
```java
HashSet<String> nombres = new HashSet();
```
- TreeSet se implementa utilizando una estructura de árbol (árbol rojo-negro en el libro de
algoritmos). La gran diferencia entre el HashSet y el TreeSet, es que el TreeSet mantiene
todos sus elementos de manera ordenada(forma ascendente), pero los métodos de
agregar, eliminar son más lentos que el HashSet ya que cada vez que le entra un
elemento debe posicionarlo para que quede ordenado.
Ejemplo de un TreeSet de numeros:
TreeSet<Integer> numeros = new TreeSet();
- LinkedHashSet está entre HashSet y TreeSet. Se implementa como una tabla hash con
una lista vinculada que se ejecuta a través de ella, por lo que proporciona el orden de
inserción.
Ejemplo de un LinkedHashSet de cadenas:
```java
LinkedHashSet<String> frases = new LinkedHashSet();
```

