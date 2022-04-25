package com.cue.ed.clases;

public class Factorial {

    public long calcularFactorial( int n){

        if(n <= 1)
            return 1;
        else {
            long resultado = n * calcularFactorial(n - 1);
            return  resultado;
        }
    }
}
