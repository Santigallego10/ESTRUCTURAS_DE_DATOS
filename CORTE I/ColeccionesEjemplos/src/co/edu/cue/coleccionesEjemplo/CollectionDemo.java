package co.edu.cue.coleccionesEjemplo;

// Java program to demonstrate
// why collection framework was needed
import java.io.*;
import java.util.*;

class CollectionDemo {

    public static void main(String[] args)
    {
        // Creating instances of the array,
        // vector and hashtable
        int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();

        // Adding the elements into the
        // vector
        v.addElement(1);
        v.addElement(2);

        // Adding the element into the
        // hashtable
        h.put(1, "geeks");
        h.put(2, "4geeks");

        // Array instance creation requires [],
        // while Vector and hastable require ()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()

        // Accessing the first element of the
        // array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        // Array elements are accessed using [],
        // vector elements using elementAt()
        // and hashtable elements using get()
    }
}

/**********************************************************************************************/


// Java program to demonstrate the
// working of ArrayList
import java.io.*;
        import java.util.*;

class GFG {

    // Main Method
    public static void main(String[] args)
    {

        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);

        // Printing elements
        System.out.println(al);

        // Remove element at index 3
        al.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(al);

        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
    }
}

/****************************************************************************************************************/

// Java program to demonstrate the
// working of LinkedList
import java.io.*;
import java.util.*;

class GFG {

    // Main Method
    public static void main(String[] args)
    {

        // Declaring the LinkedList
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            ll.add(i);

        // Printing elements
        System.out.println(ll);

        // Remove element at index 3
        ll.remove(3);

        // Displaying the List
        // after deletion
        System.out.println(ll);

        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}

/*******************************************************************************************************************************************/

// Java program to demonstrate the
// working of Vector
import java.io.*;
import java.util.*;

class GFG {

    // Main Method
    public static void main(String[] args)
    {

        // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the Vector
        // after deletion
        System.out.println(v);

        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}

/**********************************************************************************************************************/

// Java program to demonstrate the
// working of a stack
import java.util.*;
public class GFG {

    // Main Method
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

/*******************************************************************************************************/

// Java program to demonstrate the working of
// priority queue in Java
import java.util.*;

class GfG {

    // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
    }
}

/********************************************************************************************************/

// Java program to demonstrate the
// working of a HashSet
import java.util.*;

public class HashSetDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
/**********************************************************************************************************************/

// Java program to demonstrate the
// working of a LinkedHashSet
import java.util.*;

public class LinkedHashSetDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

/********************************************************************************************************/

// Java program to demonstrate the
// working of a TreeSet
import java.util.*;

public class TreeSetDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating TreeSet and
        // adding elements
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

/*******************************************************************************************************************/

// Java program to demonstrate the
// working of a HashMap
import java.util.*;

public class HashMapDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating HashMap and
        // adding elements
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
/*******************************************************************************************************************************/

 // metodos ArrayList


ArrayList<String> al = new ArrayList<String>();
al.add("Victor");
        al.add("Luis");
        al.add("Elena");

 //

// ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

        Vector<String> vector = new Vector<String>();
        vector.add("Irene");
        vector.add("María");

// Añadir elementos al final del ArrayList
// Es una colección
        al.addAll(vector);

//

        ArrayList<String> al = new ArrayList<String>();
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

        System.out.println("La lista contiene "+al.size()+" elementos");

// Eliminamos todos los elementos
        al.clear();

        System.out.println("La lista contiene "+al.size()+" elementos");

//

        ArrayList<Integer> misnumeros = new ArrayList<Integer>(10);
        Scanner reader = new Scanner(System.in);

        for (int x=0;x<10;x++) {
        System.out.println("Inserte un número");
        misnumeros.add(reader.nextInt());
        }

        System.out.println("Has cargado los siguientes números");

        for (int x=0;x<misnumeros.size();x++){
        System.out.println(misnumeros.get(x));
        }

        System.out.println("Busca un número, 0 para salir");

        int numeroBuscar = reader.nextInt();

        while (numeroBuscar!=0) {
        if (misnumeros.contains(numeroBuscar)) {
        System.out.println("Contiene el número " + numeroBuscar);
        } else {
        System.out.println("No contiene el número " + numeroBuscar);
        }

        System.out.println("Busca un número, 0 para salir");

        numeroBuscar = reader.nextInt();
        }

        System.out.println("Fin del juego");

        reader.close();
//

        / ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

// Recorremos el Array
        for(int x=0;x<al.size();x++) {
        System.out.println(al.get(x));
        }

//

// ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

        Iterator<String> it = al.iterator();
        while(it.hasNext())
        System.out.println(it.next());

//

// ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

// Recorrer un ArrayList con un Iterador
        Iterator<String> it = al.iterator();
        while(it.hasNext())
        System.out.println(it.next());

// Eliminamos el segundo elemento
        al.remove(1);

        it = al.iterator();
        while(it.hasNext())
        System.out.println(it.next());
//

        ArrayList<String> al = new ArrayList<String>();
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

        Iterator<String> it = al.iterator();
        while(it.hasNext())
        System.out.println(it.next());

// Eliminamos el primer elemento
        al.set(2,"Teresa");

        it = al.iterator();
        while(it.hasNext())
        System.out.println(it.next());

//

// ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");

// Recorremos el Array
        for(int x=0;x<al.size();x++) {
        System.out.println(al.get(x));
        }

//

metodos Hashmap

        / Java program to add elements
// to the HashMap

        import java.io.*;
        import java.util.*;

class AddElementsToHashMap {
    public static void main(String args[])
    {
        // No need to mention the
        // Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> hm2
                = new HashMap<Integer, String>();

        // Add Elements using put method
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        hm2.put(1, "Geeks");
        hm2.put(2, "For");
        hm2.put(3, "Geeks");

        System.out.println("Mappings of HashMap hm1 are : "
                + hm1);
        System.out.println("Mapping of HashMap hm2 are : "
                + hm2);
    }
}

//

// Java program to change
// elements of HashMap

import java.io.*;
        import java.util.*;
class ChangeElementsOfHashMap {
    public static void main(String args[])
    {

        // Initialization of a HashMap
        HashMap<Integer, String> hm
                = new HashMap<Integer, String>();

        // Change Value using put method
        hm.put(1, "Geeks");
        hm.put(2, "Geeks");
        hm.put(3, "Geeks");

        System.out.println("Initial Map " + hm);

        hm.put(2, "For");

        System.out.println("Updated Map " + hm);
    }
}

//

// Java program to remove
// elements from HashMap

import java.io.*;
        import java.util.*;
class RemoveElementsOfHashMap{
    public static void main(String args[])
    {
        // Initialization of a HashMap
        Map<Integer, String> hm
                = new HashMap<Integer, String>();

        // Add elements using put method
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
        hm.put(4, "For");

        // Initial HashMap
        System.out.println("Mappings of HashMap are : "
                + hm);

        // remove element with a key
        // using remove method
        hm.remove(4);

        // Final HashMap
        System.out.println("Mappings after removal are : "
                + hm);
    }
}

//

// Java program to traversal a
// Java.util.HashMap

import java.util.HashMap;
        import java.util.Map;

public class TraversalTheHashMap {
    public static void main(String[] args)
    {
        // initialize a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Iterate the map using
        // for-each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }
}

//

// metodos HashMap

    // Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
    Map<Integer, String> nombreMap = new HashMap<Integer, String>();
nombreMap.size(); // Devuelve el numero de elementos del Map
        nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.put(K clave, V valor); // Añade un elemento al Map
        nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
        nombreMap.clear(); // Borra todos los componentes del Map
        nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
        nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
        nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
        nombreMap.values(); // Devuelve una "Collection" con los valores del Map

//

// hashmap

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Casillas");		map.put(15, "Ramos");
        map.put(3, "Pique");		map.put(5, "Puyol");
        map.put(11, "Capdevila");	map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");	map.put(8, "Xavi Hernandez");
        map.put(18, "Pedrito");		map.put(6, "Iniesta");
        map.put(7, "Villa");

// Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
        Integer key = it.next();
        System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }

//

// Treemap


        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1, "Casillas");	treeMap.put(15, "Ramos");
        treeMap.put(3, "Pique");	treeMap.put(5, "Puyol");
        treeMap.put(11, "Capdevila");	treeMap.put(14, "Xabi Alonso");
        treeMap.put(16, "Busquets");	treeMap.put(8, "Xavi Hernandez");
        treeMap.put(18, "Pedrito");	treeMap.put(6, "Iniesta");
        treeMap.put(7, "Villa");

// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        it = treeMap.keySet().iterator();
        while(it.hasNext()){
        Integer key = it.next();
        System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
        }

 //

// LinkedHashMap

        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "Casillas");	linkedHashMap.put(15, "Ramos");
        linkedHashMap.put(3, "Pique");		linkedHashMap.put(5, "Puyol");
        linkedHashMap.put(11, "Capdevila");	linkedHashMap.put(14, "Xabi Alonso");
        linkedHashMap.put(16, "Busquets");	linkedHashMap.put(8, "Xavi Hernandez");
        linkedHashMap.put(18, "Pedrito");	linkedHashMap.put(6, "Iniesta");
        linkedHashMap.put(7, "Villa");

// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        it = linkedHashMap.keySet().iterator();
        while(it.hasNext()){
        Integer key = it.next();
        System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
        }

