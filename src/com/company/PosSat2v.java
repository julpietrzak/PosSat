package com.company;

import static java.lang.Math.round;

public class PosSat2v {
    public static void main(String[] args) {
        //dane wejsciowe

        int rok, miesiac, dzien, godzina, minuta, strefaczas, numerorbity;
        double sekunda, ruchsredni, epoka, nachylenie, raan, mimosrod, argperygeum, ansrednia, iloscobiegow;

        rok = 2007; //{rok}
        miesiac = 2;   //{miesiac}
        dzien = 22;  //{dzien}
        godzina = 16;  //{godzina}
        minuta = 38;  //{minuta}
        sekunda = 11;  //{sek}
        strefaczas = 1;   //{strefa}


        ruchsredni = 0.00020498; //przykładowe dla iSS - więcej http//cybermoon.w.interia.pl
        epoka = 7052.33212;
        nachylenie = 51.6376;
        raan = 342.7142;
        mimosrod = 0.002094;
        argperygeum = 231.8013;
        ansrednia = 274.4852;
        iloscobiegow = 15.78561427;
        numerorbity = 47247;

        //Data epoki
        int ept = (int) epoka;
        int eptj = (int) (ept / 1000);
        double rok1 = Math.floor(2000 + eptj);
        double dzien1 = ept - eptj * 1000;

        int m1 = 1;
        int d1 = 1;
        int h1 = 12;
        int min1 = 0;
        double sek1 = 0.0;

        double A1 = 10000 * rok1 + 100 * m1 + d1;
        if (m1 <= 2) {
            m1 = m1 + 12;
            rok1 = rok1 - 1;
        }
        double b1 = (int) (rok1 / 400) - (int) (rok1 / 100) + (int) (rok1 / 4);
        A1 = 365 * rok1 - 730548.5;
        double day20001 = A1 + b1 + (int) (30.6001 * (m1 + 1)) + d1 + (h1 + min1 / 60 + sek1 / 3600) / 24;

        double DateSerial1 = 36526 + day20001;
        double data1 = DateSerial1 + dzien1 - 1;
        double epokadaty1 = data1;
        System.out.println(epokadaty1);

        //Czas epoki
        int ept2 = (int) (epoka);
        int eptj2 = (int) (ept2 / 1000);
        int rok2 = round(2000 + eptj2);
        double dzien2 = ept2 - eptj2 * 1000;

        int m2 = 1;
        int d2 = 1;
        int h2 = 12;
        int min2 = 0;
        double sek2 = 0.0;
        double A2 = 10000 * rok2 + 100 * m2 + d2;
        if (m2 <= 2) {
            m2 = m2 + 12;
            rok2 = rok2 - 1;
        }
        double b2 = (int) (rok2 / 400) - (int) (rok2 / 100) + (int) (rok2 / 4);
        A2 = 365 * rok2 - 730548.5;
        double day20002 = A2 + b2 + (int) (30.6001 * (m2 + 1)) + d2 + (h2 + min2 / 60 + sek2 / 3600) / 24;

        double DateSerial2 = 36526 + day20002;
        double data2 = DateSerial2 + dzien2 - 1;
        double UT = epoka - ept2;
        double czasepoki = UT;
        System.out.println(czasepoki);

        //obliczam date z jd
        double ed = data1;
        double ez = UT;
        double j = ed + ez + 2415018.5;
        System.out.println(j);
//        JD_KG(j, rok, mies, dzien, godz, min, sek);
        double a = j + 0.5;
        int b = (int) (a);
        double c = a - b;
        int d = (int) ((b - 1867216.25) / 36524.25);
        double e = b + 1 + d - (int) (d / 4);
        double f;
        if (b < 2299161) {
            f = b;
        } else {
            f = e;
        }
        double g = 1524 + f;
        int h = (int) ((g - 122.1) / 365.25);
        int i = (int) (365.25 * h);
        int j1 = (int) ((g - i) / 30.6001);
        double k = g - i + c - (int) (30.6001 * j1);
        double dzien3 = round((int) (k));
        double mies3;
        if (j1 < 14) {
            mies3 = round(j1 - 1);
        } else {
            mies3 = round(j1 - 13);
        }
        int rok3;
        if (mies3 > 2) {
            rok3 = round(h - 4716);
        } else {
            rok3 = round(h - 4715);
        }
        double o = k - (int) (k);
        double p = 24 * o;
        int godz3 = round((int) (p));
        double s = 60 * (p - (int) (p));
        int min3 = round((int) (s));
        int sek3 = round((int) ((s - (int) (s)) * 60));
        double l = ((s - (int) (s)) * 60);

        //licze jd dla wyznaczonych z j parametrów
        if (mies3 > 2) {
            mies3 = mies3;
            rok3 = rok3;
        }
        if (mies3 <= 2) {
            mies3 = mies3 + 12;
            rok3 = rok3 - 1;
        }
        int A = (int) (rok3 / 100);
        double b3 = 2 - A + (int) (A / 4);
        int strefaczas1 = 0;
        double JD1 = ((int) (365.25 * (rok3 + 4716)) + (int) (30.6001 * (mies3 + 1)) + dzien3 + b3 + ((godz3 + min3 / 60 + sek3 / 3600) / 24) - 1524.5) - (strefaczas1 / 24);
        System.out.println(JD1);

        //licze jd dla daty

        int rok1d = 2007; //{rok}
        int miesiac1d = 2;   //{miesiac}
        int dzien1d = 22;  //{dzien}
        int godzina1d = 16;  //{godzina}
        int minuta1d = 38;  //{minuta}
        int sekunda1d = 11;  //{sek}
        int strefaczas1d = 1;   //{strefa}
        if (miesiac1d > 2) {
            miesiac1d = miesiac1d;
            rok1d = rok1d;
        }
        if (miesiac1d <= 2) {
            miesiac1d = miesiac1d + 12;
            rok1d = rok1d - 1;
        }
        int A4 = (int) (rok1d / 100);
        double b4 = 2 - A4 + (int) (A4 / 4);

        double JD2 = ((int) (365.25 * (rok1d + 4716)) + (int) (30.6001 * (miesiac1d + 1)) + dzien1d + b4 + ((godzina1d + minuta1d / 60 + sekunda1d / 3600) / 24) - 1524.5) - (strefaczas1d / 24);
        System.out.println(JD2);

        //licze czas gwiazdowy
        double d3 = (JD2 - 2451545) / 36525;
        double x3 = 280.46061837 + 360.98564736629 * (JD2 - 2451545) + 0.000387933 * d3 * d3 - d3 * d3 * d3 / 38710000;
        double b5 = x3 / 360;
        double A5 = 360 * (b5 - (int) (b5));
        if (A5 < 0) {
            A5 = A5 + 360;
        }
        double rang1 = A5;
        double gst = rang1;


        double x4 = (gst / 15) * 15;
        double b6 = x4 / 360;
        double A6 = 360 * (b6 - (int) (b6));
        if (A6 < 0) {
            A6 = A6 + 360;
        }
        double rang2 = A6;
        double czasgwiazd = rang2; //gmst
        System.out.println(czasgwiazd);

        //licze delta T
        double dT=JD2-JD1;
        System.out.println(dT);

        //draan
        double erdradius=6378.13649;
        s= (iloscobiegow / 13750.98708) * (iloscobiegow / 13750.98708);
        double Potega, Potega1;
        if ((398601.2 / s) > 0){
           Potega = Math.exp((1 / 3) * Math.log((398601.2 / s)));
        }
        else {
             Potega = 0;
        }
        double Aa= Potega;

        if ((Aa /erdradius) > 0){
            Potega1 = Math.exp(3.5 * Math.log((Aa /erdradius)));
        }
        else {
            Potega1 = 0;
        }

        double draan= (-9.98 / Potega1 * (1.0 - mimosrod) * (1.0 - mimosrod)) * Math.cos(nachylenie * 3.14159265358979 / 180.0);
        System.out.println(draan);

        //raan new
        double raanNew=raan+dT*draan;
        System.out.println(raanNew);

        //delta Ap
       double s2= (iloscobiegow / 13750.98708) * (iloscobiegow / 13750.98708);
       double Potega2,Potega3;
        if ((398601.2 / s2) > 0){
            Potega2 = Math.exp((1 / 3) * Math.log((398601.2 / s2)));
        }
        else {
            Potega2 = 0;
        }
       double Aa2= Potega2;
        if ((Aa2 /erdradius) > 0){
            Potega3 = Math.exp(3.5 * Math.log((Aa2 /erdradius)));
        }
        else {
            Potega3 = 0;
        }

        double dap= (5.0 / Potega3 * (1.0 - mimosrod) * (1.0 - mimosrod)) * (5.0 * Math.cos(nachylenie * 3.14159265358979 / 180.0) * Math.cos(nachylenie * 3.14159265358979 / 180.0) - 1.0);

        System.out.println(dap);
    }
}
