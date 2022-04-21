package Ex3;

import java.util.Scanner;

public class TestHashTable {

        public static void main(String[] args){
            WorkHash table = new WorkHash(2);
            String key= null,value;
            while (true) {
                System.out.println("\n Menu:");
                System.out.println("   1. test put(key,value)");
                System.out.println("   2. test get(key)");
                System.out.println("   3. test containsKey(key)");
                System.out.println("   4. test remove(key)");
                System.out.println("   5. show complete contents of hash table.");
                System.out.println("   6. EXIT");
                System.out.print("Enter your command:  ");

                Scanner scanner = new Scanner(System.in);
                String TextIO = scanner.next();

                Scanner scannerA = new Scanner(System.in);

                switch ( TextIO) {
                    case "1":
                        System.out.print("\n   Key = ");
                        String Text = scannerA.next();
                        System.out.print("   Value = ");
                        value = Text;
                        table.put(key,value);
                        break;
                    case "2":
                        String Text2 = scannerA.next();
                        System.out.print("\n   Key = " +Text2);
                        key = Text2;
                        System.out.println("   Value is " + table.get(key));
                        break;
                    case "3":
                        String Text3 = scannerA.next();
                        System.out.print("\n   Key = ");
                        key = Text3;
                        System.out.println("   containsKey(" + key + ") is "
                                + table.containsKey(key));
                        break;
                    case "4":
                        String Text4 = scannerA.next();
                        System.out.print("\n   Key = ");
                        key = Text4;
                        table.remove(key);
                        break;
                    case "5":
                        table.dump();
                        break;
                    case "6":
                        return;  // End program by returning from main()
                    default:
                        System.out.println("   Illegal command.");
                        break;
                }
                System.out.println("\nHash table size is " + table.size());
            }
        }

    }

