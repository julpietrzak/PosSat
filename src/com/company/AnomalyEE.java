package com.company;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class AnomalyEE {
    double m, e;

    public AnomalyEE(double m, double e) {
        this.m = m;
        this.e = e;
double A;

        A = m + e * (180 / 3.14159265358979) * sin(m * 3.14159265358979 / 180) * (1 + e * cos(m * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A = A - (A - e * (180 / 3.14159265358979) * sin(A * 3.14159265358979 / 180) - m) / (1 - e * cos(A * 3.14159265358979 / 180));
        A = A / 360;
        A= 360 * A - (int)A;
        if (A < 0){
            A= 360 + A;
        }

       double AnomalyEE= A;



    }
}
