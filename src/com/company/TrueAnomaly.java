package com.company;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class TrueAnomaly {
    double m , e;
    public TrueAnomaly(double m ,double e){
        this.m=m;
        this.e=e;
        double d,A39,k, L, o ,N;

        A39= m + e * (180 / 3.14159265358979) * sin(m * 3.14159265358979 / 180) * (1 + e * cos(m * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 - (A39 - e * (180 / 3.14159265358979) * sin(A39 * 3.14159265358979 / 180) - m) / (1 - e * cos(A39 * 3.14159265358979 / 180));
        A39= A39 / 360;

        d= 360 * (A39 - (int)A39);
        if (d < 0) { d= 360 + d;}

        k= Math.sqrt((1 + e) / (1 - e));
        L= Math.tan((d / 2) * 3.14159265358979 / 180);
        N= (L * k);
        o= Math.atan2(1, N) * 180 / 3.14159265358979;
        o= 2 * o;
        if (o < 0){  o= 360 + o;}
        double TrueAnomaly= o;
    }
}
