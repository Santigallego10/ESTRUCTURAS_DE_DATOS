package com.cue.ed.principal;

import com.cue.ed.clases.Sumatoria;

import java.util.Scanner;

public class PrincipalSumatoria {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Sumatoria sumatoria = new Sumatoria();


        System.out.print("Ingrese numero de veces :  ");
        System.out.println("Resultado "  + sumatoria.sumaNenteros(sc.nextInt()));


    }
}
