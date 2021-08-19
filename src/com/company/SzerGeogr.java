package com.company;

import static java.lang.Math.sin;

public class SzerGeogr {
    double dek;
    public SzerGeogr(double dek){
        this.dek=dek;
        double SzerGeogr= dek + 0.1924 * sin(2 * dek * 3.14159265358979 / 180);
    }
}
