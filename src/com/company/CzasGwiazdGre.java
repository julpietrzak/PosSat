package com.company;

public class CzasGwiazdGre {
    double JD;

    public CzasGwiazdGre(double JD) {
        this.JD = JD;
        //gmst = Greenwich Sternzeit'  West =  negativ   East = positiv
        double gst,d,gmst;
        d= (JD - 2451545) / 36525;
        gst= Double.parseDouble(String.valueOf(new Rang(280.46061837 + 360.98564736629 * (JD - 2451545) + 0.000387933 * d * d - d * d * d / 38710000)));
        gmst= Double.parseDouble(String.valueOf(new Rang((gst / 15)*15)));
    }
}
