package com.company;

import static java.lang.Math.*;

public class PosSat {
    public static void main(String[] args) {
        double liczba;
        String napis;
        int r;
        double m;
        int d;
        int h;
        int min;
        double s;
        int b3, b4, b5, b6, b7, b8, b9; //daty
        double b10, b11;// pozycje geogr
        double d4, d5, d6, d7, d8, d9, d10, d11, d12, d13; //dane satelity
        double d15; //OBLICZENIA
        double d16;
        double d17;
        double d18;
        double d19;
        double d20;
        double d21;
        double d22;
        double d23;
        double d24;
        double d25;
        double d26;
        double d27;
        double d28;
        double d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40;//OBLICZENIA
        double d41, d42, d43, d44, d45, d47, d48, d49, d50;//OBLICZENIA
        double erdradius = 6378.13649;

        b3 = 2007; //{rok}
        b4 = 2;   //{miesiac}
        b5 = 22;  //{dzien}
        b6 = 16;  //{godzina}
        b7 = 38;  //{minuta}
        b8 = 11;  //{sek}
        b9 = 1;   //{strefa}


        d4 = 0.00020498; //przykładowe dla iSS - więcej http//cybermoon.w.interia.pl
        d5 = 7052.33212;
        d6 = 51.6376;
        d7 = 342.7142;
        d8 = 0.002094;
        d9 = 231.8013;
        d10 = 274.4852;
        d11 = 15.78561427;
        d12 = 47247;



        int ept = (int) (d5);
        int eptj = (int) (ept / 1000);
        int year = (int) floor(2000 + eptj);  //trunc(2000+eptj)  trunc(x):={⌊x⌋ if x≥0 (Math.floor) ⌈x⌉ if x<0 (Math.ceil)
        int day = ept - eptj * 1000;


        double A, b;
        int month1 = 1, day1 = 1;
        A = 10000 * year + 100 * month1 + day1;
        if (month1 <= 2) {
            month1 = month1 + 12;
            year = year - 1;
        }
        b = (int) (year / 400) - (int) (year / 100) + (int) (year / 4);
        A = 365 * year - 730548.5;
        int hour1 = 12, min1 = 0;
        double sec1 = 0.0;
        double day2000 = A + b + (int) (30.6001 * (month1 + 1)) + day1 + (hour1 + min1 / 60 + sec1 / 3600) / 24;

        double dateSerial = 36526 + day2000;
        double date = dateSerial + day - 1;
        d15 = date;
        System.out.println(d15);



        ept = (int) (d5);
        eptj = (int) (ept / 1000);
        year = (int) round(2000 + eptj);
        day = ept - eptj * 1000;

        A = 10000 * year + 100 * month1 + day1;
        if (month1 <= 2) {
            month1 = month1 + 12;
            year = year - 1;
        }
        b = (int) (year / 400) - (int) (year / 100) + (int) (year / 4);
        A = 365 * year - 730548.5;


        double date1 = dateSerial + day - 1;
        double UT = d5 - ept;
        d16 = UT;



        /*{d17}*/

        int ept1 = (int) (d5);
        int eptj1 = (int) (ept / 1000);
        int year1 = (int) floor(2000 + eptj);  //trunc(2000+eptj)  trunc(x):={⌊x⌋ if x≥0 (Math.floor) ⌈x⌉ if x<0 (Math.ceil)
        int day11 = ept - eptj * 1000;


        int month11 = 1, day111 = 1;
        A = 10000 * year1 + 100 * month11 + day11;
        if (month1 <= 2) {
            month1 = month1 + 12;
            year1 = year1 - 1;
        }
        double b1 = (int) (year1 / 400) - (int) (year1 / 100) + (int) (year1 / 4);
        double A1 = 365 * year1 - 730548.5;
        int hour11 = 12, min11 = 0;
        double sec11 = 0.0;
        double day20001 = A1 + b1 + (int) (30.6001 * (month1 + 1)) + day111 + (hour11 + min11 / 60 + sec11 / 3600) / 24;

        double dateSerial1 = 36526 + day2000;
        double date11 = dateSerial1 + day11 - 1;
        double ed = date11;


        ept = (int) (d5);
        eptj = (int) (ept / 1000);
        year = (int) round(2000 + eptj);
        day = ept - eptj * 1000;

        A = 10000 * year + 100 * month1 + day1;
        if (month1 <= 2) {
            month1 = month1 + 12;
            year = year - 1;
        }
        b = (int) (year / 400) - (int) (year / 100) + (int) (year / 4);
        A = 365 * year - 730548.5;


        double date2 = dateSerial + day - 1;
        double UT1 = d5 - ept;
        double ez = UT1;


        double j = ed + ez + 2415018.5;

        JD_KG jdkg = new JD_KG(j);
        double a = j + 0.5;
        int b2 = (int) a;
        double c = a - b2;
        d = (int) ((b2 - 1867216.25) / 36524.25);
        double e = b2 + 1 + d - (int) (d / 4);
        double f;
        if (b2 < 2299161) {
            f = b2;
        } else {
            f = e;
        }

        double g = 1524 + f;
        int h1 = (int) ((g - 122.1) / 365.25);
        int i = (int) (365.25 * h1);
        int j1 = (int) ((g - i) / 30.6001);
        double k = g - i + c - (int) (30.6001 * j1);
        int dzien = round((int) (k));
        int mies, rok;
        if (j1 < 14) {
            mies = round(j1 - 1);
        } else {
            mies = round(j1 - 13);
        }
        if (mies > 2) {
            rok = round(h1 - 4716);
        } else {
            rok = round(h1 - 4715);
        }
        double o = k - (int) (k);
        double p = 24 * o;
        int godz = round((int) (p));
        s = 60 * (p - (int) (p));
        min = round((int) (s));
        int sek = round((int) ((s - (int) (s)) * 60));
        double l = ((s - (int) (s)) * 60);


        int timezone = 0;
        if (mies > 2) {
            mies = mies;
            rok = rok;
        }
        if (mies <= 2) {
            mies = mies + 12;
            rok = rok - 1;
        }
        int A2 = (int) (rok / 100);
        double b0 = 2 - A2 + (int) (A2 / 4);
        d17 = ((int) (365.25 * (rok + 4716)) + (int) (30.6001 * (mies + 1)) + dzien + b0 + ((godz + min / 60 + sek / 3600) / 24) - 1524.5) - (timezone / 24);


        if (b4 > 2) {
            b4 = b4;
            b3 = b3;
        }
        if (b4 <= 2) {
            b4 = b4 + 12;
            b3 = b3 - 1;
        }
        int A3 = (int) (b3 / 100);
        double b03 = 2 - A3 + (int) (A3 / 4);
        d18 = ((int) (365.25 * (b3 + 4716)) + (int) (30.6001 * (b4 + 1)) + b5 + b03 + ((b6 + b7 / 60 + b8 / 3600) / 24) - 1524.5) - (b9 / 24);



        double d01 = (d18 - 2451545) / 36525;


        double x = 280.46061837 + 360.98564736629 * (d18 - 2451545) + 0.000387933 * d01 * d01 - d01 * d01 * d01 / 38710000;
        double b00 = x / 360;
        double A00 = 360 * (b00 - (int) b00);
        if (A00 < 0) {
            A00 = A00 + 360;
        }
        double gst = A00;


        double y = (gst / 15) * 15;
        double b01 = y / 360;
        double A01 = 360 * (b00 - (int) b01);
        if (A01 < 0) {
            A01 = A01 + 360;
        }
        double gmst1 = A01;

        d20 = gmst1;


        d21 = d18 - d17; //{delta T}



        double s1 = (d11 / 13750.98708) * (d11 / 13750.98708);
        double Potega1, Potega2;
        if (398601.2 / s1 > 0) {
            Potega1 = Math.exp((1 / 3) * Math.log(398601.2 / s1));
        } else {
            Potega1 = 0;
        }
        double A21 = Potega1;


        if (A21 / erdradius > 0) {
            Potega2 = Math.exp(3.5 * Math.log(A21 / erdradius));
        } else {
            Potega2 = 0;
        }

        d22 = (-9.98 / (Potega2 * (1 - d8) * (1 - d8))) * Math.cos(d6 * 3.14159265358979 / 180);
        d23 = d7 + d21 * d22; //{RAAN neu}


        double s22= (d11 / 13750.98708) * (d11 / 13750.98708);
        double Potega3, Potega4;
        if ((398601.2 / s22) > 0) {
            Potega3 = Math.exp((1 / 3) * Math.log(398601.2 / s22));
        } else {
            Potega3 = 0;
        }

        if ((Potega3 / erdradius) > 0) {
            Potega4 = Math.exp(3.5 * Math.log(Potega3 / erdradius));
        } else {
            Potega4 = 0;
        }


        d24= (5 / Potega4 * (1 - d8) * (1 - d8)) * (5 * Math.cos(d6 * 3.14159265358979 / 180) * Math.cos(d6 * 3.14159265358979 / 180) - 1);





        d25 = d9 + d24 * d21;//Ap neu}
        d26 = 1440 / d11;
        d27 = -2 * d4 * 360 / (d11 * 360) / 3 * d21 / 2; //{dk  }
        d28 = 1 - 3 * d27; //{mdrag}
        d29 = 1 + 4 * d27; //{adrag }
        d30 = 1 - 7 * d27;//{apdrag}



        double z=d10 + (d11 * 360 * d21 * d28);
        double b31= z / 360;
        double A31= 360 * (b31 - (int)b31);
        if (A31<0) {
            A31= A31 + 360;
        }
        d31=A31;

        d32 = d30 * (d7 + d21 * d22);
        d33 = d29 * (d9 + d24 * d21);


        double s34= (d11 / 13750.98708) * (d11 / 13750.98708);
        double Potega5;
        if ((398601.2 / s34) > 0) {
            Potega5 = Math.exp((1 / 3) * Math.log(398601.2 / s34));
        } else {
            Potega5 = 0;
        }
        double gha=Potega5;

        d34=d29*gha;

        d35 = d29 * d34 * sqrt(1 - d8 * d8);
        if (d21 * d11 >= 0) {
            d36 = d12 + Math.floor(d21 * d11);
        } else {
            d36 = d12 + Math.ceil(d21 * d11);
        }


        double b37= (d31 / 256 * 360) / 360;
        double A37= 360 * (b37 - (int)b37);
        if (A37<0) {
            A37= A37 + 360;
        }
        d37 = A37;


        m=d31;
        e=d8;

       double A38 = m + e * (180 / 3.14159265358979) * sin(m * 3.14159265358979 / 180) * (1 + e * cos(m * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 + e * (180 / 3.14159265358979) * sin(0 * 3.14159265358979 / 180) * (1 + e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 - (A38 - e * (180 / 3.14159265358979) * sin(A38 * 3.14159265358979 / 180) - m) / (1 - e * cos(A38 * 3.14159265358979 / 180));
        A38 = A38 / 360;
        A38= 360 * A38 - (int)A38;
        if (A38 < 0){
            A38= 360 + A38;
        }
        d38 = A38;


        double A39= m + e * (180 / 3.14159265358979) * sin(m * 3.14159265358979 / 180) * (1 + e * cos(m * 3.14159265358979 / 180));
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

        d39= 360 * (A39 - (int)A39);
        if (d39 < 0) { d39= 360 + d39;}

        k= Math.sqrt((1 + e) / (1 - e));
        double L39= Math.tan((d39 / 2) * 3.14159265358979 / 180);
        double N39= (L39 * k);
        double o39= Math.atan2(1, N39) * 180 / 3.14159265358979;
        o39= 2 * o39;
        if (o39 < 0){  o39= 360 + o39;}

       d49=o39;


        d40 = d34 * (1 - d8 * Math.cos(d38 * PI / 180));
        d41 = d40 - erdradius;//{Hohe u.NN}
        d42 = 631.35 / sqrt(d40);//{Sat-Geschw.   Km/h}

        double b43= (d33 + d39) / 360;
        double A43= 360 * (b43 - (int)b43);
        if (A43<0) {
            A43= A43 + 360;
        }
        d43 = A43;


        d44 = Math.asin(Math.sin(d6 * PI / 180) * Math.sin(d43 * PI / 180)) * 180 / PI;//{geoz. Breite}

        d45= d44 + 0.1924 * sin(2 * d44 * 3.14159265358979 / 180);

        d47 = Math.atan(Math.cos(d6 * PI / 180) * Math.tan(d43 * PI / 180)) * 180 / PI;

        d48 = (360 - (d32 + d47) + d20);
        /*{d49}*/
        if (Math.cos(d43 * PI / 180) < 0) {
            double b49= (d48 - 180) / 360;
            double A49= 360 * (b49 - (int)b49);
            if (A49<0) {
                A49= A49 + 360;
            }
            d49 = A49;
        } else {
            double b49= (d48) / 360;
            double A49= 360 * (b49 - (int)b49);
            if (A49<0) {
                A49= A49 + 360;
            }
            d49 = A49;

        }
        /*{d50}*/
        if (d49 < 180) {
            d50 = -d49;
        } else {
            d50 = 360 - d49;
        }

        System.out.println(d41); //wysokosc satelity
        System.out.println(d42);//predkosc satelity[km/s]
        System.out.println(d45); //szerokosc geograficzna satelity
        System.out.println(d50); //dlugosc geograficzna satelity


    }
}
