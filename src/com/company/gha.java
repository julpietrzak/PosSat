package com.company;

public class gha {
    double mm;

    public gha(double mm) {
        this.mm = mm;
        double s,gha;
        s= (mm / 13750.98708) * (mm / 13750.98708);
        gha=Double.parseDouble(String.valueOf(new Potega((398601.2 / s),(1 / 3))));

    }
}
