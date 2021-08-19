package com.company;

public class Rang {
    double x;
    public Rang(double x){
        this.x=x;
        double A,b;
        b= x / 360;
        A= 360 * (b - (int)b);
        if (A<0) {
            A= A + 360;
        }
        double rang= A;

    }
}
