package tablaHash;

import java.util.Hashtable;

public class EjericicioBasicoDosMetodos {

    public static void main(String[] args) {

            Hashtable<Integer, String> hashTable =
                    new Hashtable<Integer, String>();

            Hashtable<Integer, String> hashTableCopy =
                    new Hashtable<Integer, String>();

            hashTable.put(1, "javatutorial");
            hashTable.put(2, "dot");
            hashTable.put(3, "net");

            // create a clone of hashtable 'hashTable'
            hashTableCopy= (Hashtable<Integer, String>)hashTable.clone();

            System.out.println("values in clone: " + hashTableCopy);

            hashTable.clear();

            System.out.println("after clearing: " + hashTable);
        }

    }









