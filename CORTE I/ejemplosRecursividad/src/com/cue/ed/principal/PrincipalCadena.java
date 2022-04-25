package com.cue.ed.principal;

import com.cue.ed.clases.String_Revers;

public class PrincipalCadena {
    public static void main(String[] args) {
        String inputcadena = "esto es un testing de software";
        System.out.println("cadena original: " +inputcadena);

        String_Revers obj = new String_Revers();
        System.out.print("cadena invertida: ");
        obj.reverseString(inputcadena);
    }

}
