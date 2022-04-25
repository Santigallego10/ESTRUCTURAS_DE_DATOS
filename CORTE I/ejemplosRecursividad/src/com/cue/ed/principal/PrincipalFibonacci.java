package com.cue.ed.principal;

import com.cue.ed.clases.Fibonacci;

import java.util.Scanner;

public class PrincipalFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Fibonacci fi = new Fibonacci();
        System.out.println("Maximo : ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++){
            int fibonacciNumber = fi.printFibonacci(i);
            System.out.print(" " + fibonacciNumber);
        }


    }




}
