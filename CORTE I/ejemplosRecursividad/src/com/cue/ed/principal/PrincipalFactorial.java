package com.cue.ed.principal;

import com.cue.ed.clases.Factorial;

import java.util.Scanner;

public class PrincipalFactorial {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Factorial factorial = new Factorial();

        System.out.println("numero factorial : ");
        System.out.println("resultado " + factorial.calcularFactorial(sc.nextInt()));

    }

}
