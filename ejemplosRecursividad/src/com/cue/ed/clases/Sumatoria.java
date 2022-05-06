package com.cue.ed.clases;

public class Sumatoria {

    public long sumaNenteros(int n){
        if (n == 1)
            return 1;
        else
            return n + sumaNenteros(n - 1);


    }




}
