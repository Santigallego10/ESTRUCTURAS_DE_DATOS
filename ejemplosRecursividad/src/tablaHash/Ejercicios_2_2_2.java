package tablaHash;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ejercicios_2_2_2 {

    public static void main(String[] args)
    {
        Hashtable balance = new Hashtable(); //https://tinchicus.com/2019/06/17/java-hashtable/
        Enumeration nombres;
        String cdn;
        double bal;

        balance.put("Martin", new Double(9999.99));
        balance.put("Marta", new Double(11011.11));
        balance.put("Enzo", new Double(8976.12));
        balance.put("Javier", new Double(7707.55));
        balance.put("Ariel", new Double(9190.90));

        nombres = balance.keys();

        while(nombres.hasMoreElements())
        {
            cdn = (String) nombres.nextElement();
            System.out.println(cdn + ": " + balance.get(cdn));
        }

        System.out.println();

        bal = ((Double) balance.get("Martin")).doubleValue();
        balance.put("Martin", new Double(bal + 1000));
        System.out.println("Nuevo balance de Martin: "
                + balance.get("Martin"));
    }
}





