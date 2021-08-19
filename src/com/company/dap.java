package com.company;

public class dap {
    double mm, i , e;
    public dap(double mm, double i , double e){
        this.mm=mm;
        this.i=i;
        this.e=e;
        double s,A;
        double erdradius=6378.13649;
        s= (mm / 13750.98708) * (mm / 13750.98708);
        A= Double.parseDouble(String.valueOf(new Potega((398601.2 / s),(1 / 3))));
        double dap= (5 / (Double.parseDouble(String.valueOf(new Potega((A / erdradius),3.5))) * (1 - e) * (1 - e))) * (5 * Math.cos(i * 3.14159265358979 / 180) * Math.cos(i * 3.14159265358979 / 180) - 1);
    }
}
