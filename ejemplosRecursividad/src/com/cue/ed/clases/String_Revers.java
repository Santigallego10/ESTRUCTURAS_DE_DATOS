package com.cue.ed.clases;

public class String_Revers {

    public void  reverseString (String cadena) {
        if ((cadena == null)  || (cadena.length() <= 1))
            System.out.println(cadena);
        else {
            System.out.print(cadena.charAt(cadena.length() - 1 ));
            reverseString(cadena.substring(0, cadena.length() - 1));
        }
    }
}
