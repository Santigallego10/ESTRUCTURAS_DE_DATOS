package Excercise3;

import java.util.Scanner;

public class TestHashTable {
    public static void main(String[] args){
        HashTable table = new HashTable(2);
        String key,value;
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("   1. test put(key,value)");
            System.out.println("   2. test get(key)");
            System.out.println("   3. test containsKey(key)");
            System.out.println("   4. test remove(key)");
            System.out.println("   5. show complete contents of hash table.");
            System.out.println("   6. EXIT");
            System.out.print("Enter your command:  ");
            Scanner scanner = new Scanner(System.in);
            String TextIO = scanner.next();

            Scanner scanner2 = new Scanner(System.in);


            switch ( TextIO) {
                case "1":
                    System.out.println("Write the new key:");
                    String Text = scanner2.next();
                    System.out.print("\n   Key = ");
                    key = Text;
                    System.out.print("   Value = ");
                    value = Text;
                    table.put(key,value);
                    break;
                case "2":
                    String Text2 = scanner2.next();
                    System.out.print("\n   Key = "+Text2);
                    key = Text2;
                    System.out.println("   Value is " + table.get(key));
                    break;
                case "3":
                    String Text3 = scanner2.next();
                    System.out.print("\n   Key = ");
                    key = Text3;
                    System.out.println("   containsKey(" + key + ") is "
                            + table.containsKey(key));
                    break;
                case "4":
                    String Text4 = scanner2.next();
                    System.out.print("\n   Key = ");
                    key = Text4;
                    table.remove(key);
                    break;
                case "5":
                    table.dump();
                    break;
                case" 6":
                    return;  // End program by returning from main()
                default:
                    System.out.println("   Illegal command.");
                    break;
            }
            System.out.println("\nHash table size is " + table.size());
        }
    }

}