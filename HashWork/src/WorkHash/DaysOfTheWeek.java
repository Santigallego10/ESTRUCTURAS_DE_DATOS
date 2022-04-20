package WorkHash;

import java.util.Date;
import java.util.Hashtable;

public class DaysOfTheWeek {
    public static void main(String[] args) {

        Hashtable<String, Integer> daysOf = new Hashtable<>();

        daysOf.put("Monday",1);
        daysOf.put("Tuesday",2);
        daysOf.put( "Wednesday",3);
        daysOf.put( "Thursday",4);
        daysOf.put( "Friday",5);
        daysOf.put( "Saturday",6);
        daysOf.put( "Sunday",8);
        daysOf.put( "Domingo",9);

        System.out.println("This is how a kid wrote the days of the week: " +daysOf);
        //Esto imprime el listado original


        //En este metodo reemplazamos la informacion de uno de los dias de la semana
        int rep = daysOf.replace("Sunday",7);
        boolean removeMistake = daysOf.remove("Domingo", 9);
        System.out.println("pls correct this position: " +rep +" "+"and we removed something wrong in your list. Please check it out " );
        System.out.println("This is the correction of the student: "+daysOf);

        //evaluacion
        boolean removeEv = daysOf.remove("Friday", 5);
        System.out.println("the list without the element that student has to write : " +daysOf);
        daysOf.putIfAbsent("Friday",5);
        System.out.println("now, the student did it too well. Good job!" +daysOf);

    }
}