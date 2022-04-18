package App;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Hashtable<Integer, House> houses = new Hashtable<>();

        //houses//

        House house1 = new House(101, type.SMALL);
        House house2 = new House(102, type.BIG);
        House house3 = new House(201, type.BIG);
        House house4 = new House(202, type.MEDIUM);

        //Table

        houses.put(house1.getNumber(),house1);
        houses.put(house2.getNumber(),house2);
        houses.put(house3.getNumber(),house3);
        houses.put(house4.getNumber(),house4);

        for (Map.Entry<Integer, House> entry : houses.entrySet()){
            System.out.println(entry.toString());
        }









    }
}
