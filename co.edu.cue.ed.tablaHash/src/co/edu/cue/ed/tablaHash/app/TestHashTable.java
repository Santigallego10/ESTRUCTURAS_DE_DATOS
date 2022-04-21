package co.edu.cue.ed.tablaHash.app;

import java.util.Scanner;

import co.edu.cue.ed.tablaHash.model.HashTable;


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
		         Scanner sc= new Scanner(System.in);
		         int TextIO= sc.nextInt();
		         
		         Scanner sc2= new Scanner(System.in);
		         switch (TextIO) {
		            case 1:
		               System.out.print("\n   Key = ");
		               key = sc2.next();
		               System.out.print("   Value = ");
		               value = sc2.next();
		               table.put(key,value);
		               break;         
		            case 2:
		               System.out.print("\n   Key = ");
		               key = sc2.next();
		               System.out.println("   Value is " + table.get(key));
		               break;         
		            case 3:
		               System.out.print("\n   Key = ");
		               key = sc2.next();
		               System.out.println("   containsKey(" + key + ") is " 
		                                            + table.containsKey(key));
		               break;         
		            case 4:
		               System.out.print("\n   Key = ");
		               key = sc2.next();
		               table.remove(key);
		               break;         
		            case 5:
		               table.dump();
		               break;
		            case 6:
		               return;  // End program by returning from main()         
		            default:
		               System.out.println("   Illegal command.");
		               break;
		         }
		         System.out.println("\nHash table size is " + table.size());
		      }
		   }
		   
		} // end class TestHashTable
