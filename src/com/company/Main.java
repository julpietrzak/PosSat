package com.company;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
//        double liczba;
//        String napis;
//        int r, m, d, h, min;
//        double s;
//        int b3, b4, b5, b6, b7, b8, b9; //daty
//        double b10, b11;// pozycje geogr
//        double d4, d5, d6, d7, d8, d9, d10, d11, d12, d13; //dane satelity
//        Epochdate d15; //OBLICZENIA
//        double d16;
//        double d17;
//        double d18;
//        double d19;
//        double d20;
//        double d21;
//        double d22;
//        double d23;
//        double d24;
//        double d25;
//        double d26;
//        double d27;
//        double d28;
//        double d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40;//OBLICZENIA
//        double d41, d42, d43, d44, d45, d47, d48, d49, d50;//OBLICZENIA
//        double erdradius = 6378.13649;
//
//        b3 = 2007; //{rok}
//        b4 = 2;   //{miesiac}
//        b5 = 22;  //{dzien}
//        b6 = 16;  //{godzina}
//        b7 = 38;  //{minuta}
//        b8 = 11;  //{sek}
//        b9 = 1;   //{strefa}
//
//
//        d4 = 0.00020498; //przykładowe dla iSS - więcej http//cybermoon.w.interia.pl
//        d5 = 7052.33212;
//        d6 = 51.6376;
//        d7 = 342.7142;
//        d8 = 0.002094;
//        d9 = 231.8013;
//        d10 = 274.4852;
//        d11 = 15.78561427;
//        d12 = 47247;
//
//
//        d15 = new Epochdate(d5); //{Epoch datum}
//        System.out.println(d15);
//        d16 = Double.parseDouble(String.valueOf(new Epochtime(d5))); //{Epoch zeit - czas}
//
//
//        /*{d17}*/
//        Double.parseDouble(String.valueOf(new wyciag_date(d5)));
//
//        d17 = Double.parseDouble(String.valueOf(new JD(y, m, d, h, min, s, 0))); //{EpochJd - UT}
//
//        d18 = Double.parseDouble(String.valueOf(new JD(b3, b4, b5, b6, b7, b8, b9))); //{jetz Jd}
//        d20 = Double.parseDouble(String.valueOf(new CzasGwiazdGre(d18))); //{GMST}
//        d21 = d18 - d17; //{delta T    }
//        d22 = Double.parseDouble(String.valueOf(new draan(d11, d6, d8))); //{delta RAAN}
//        d23 = d7 + d21 * d22; //{RAAN neu}
//        d24 = Double.parseDouble(String.valueOf(new dap(d11, d6, d8))); //{delta Ap}
//        d25 = d9 + d24 * d21;//Ap neu}
//        d26 = 1440 / d11;
//        d27 = -2 * d4 * 360 / (d11 * 360) / 3 * d21 / 2; //{dk  }
//        d28 = 1 - 3 * d27; //{mdrag}
//        d29 = 1 + 4 * d27; //{adrag }
//        d30 = 1 - 7 * d27;//{apdrag}
//        d31 = Double.parseDouble(String.valueOf(new Rang(d10 + (d11 * 360 * d21 * d28))));
//        d32 = d30 * (d7 + d21 * d22);
//        d33 = d29 * (d9 + d24 * d21);
//        d34 = d29 * Double.parseDouble(String.valueOf(new gha(d11)));
//        d35 = d29 * d34 * sqrt(1 - d8 * d8);
//        if (d21 * d11 >= 0) {
//            d36 = d12 + Math.floor(d21 * d11);
//        } else {
//            d36 = d12 + Math.ceil(d21 * d11);
//        }
//
//        d37 = Double.parseDouble(String.valueOf(new Rang(d31 / 256 * 360)));
//        d38 = Double.parseDouble(String.valueOf(new AnomalyEE(d31, d8)));
//        d39 = Double.parseDouble(String.valueOf(new TrueAnomaly(d31, d8)));
//        d40 = d34 * (1 - d8 * Math.cos(d38 * PI / 180));
//        d41 = d40 - erdradius;//{Hohe u.NN}
//        d42 = 631.35 / sqrt(d40);//{Sat-Geschw.   Km/h}
//        d43 = Double.parseDouble(String.valueOf(new Rang(d33 + d39)));//{u}{zamiast RFwinkelpos dalem funkcje rang}
//        d44 = Math.asin(Math.sin(d6 * PI / 180) * Math.sin(d43 * PI / 180)) * 180 / PI;//{geoz. Breite}
//        d45 = Double.parseDouble(String.valueOf(new SzerGeogr(d44)));
//        d47 = Math.atan(Math.cos(d6 * PI / 180) * Math.tan(d43 * PI / 180)) * 180 / PI;
//        d48 = (360 - (d32 + d47) + d20);
//        /*{d49}*/
//        if (Math.cos(d43 * PI / 180) < 0) {
//            d49 = Double.parseDouble(String.valueOf(new Rang(d48 - 180)));
//        } else {
//            d49 = Double.parseDouble(String.valueOf(new Rang(d48)));
//        }
//        /*{d50}*/
//        if (d49 < 180) {
//            d50 = -d49;
//        } else {
//            d50 = 360 - d49;
//        }
//
//        System.out.println(d41); //wysokosc satelity
//
//        System.out.println(d42);//predkosc satelity[km/s]
//        System.out.println(d45); //szerokosc geograficzna satelity
//        System.out.println(d50); //dlugosc geograficzna satelity
    }
}
