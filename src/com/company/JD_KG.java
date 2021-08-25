package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JD_KG {
double MJD;

    public JD_KG(double j) {
    }

    public LocalDate JD_KG(double MJD) {
        this.MJD=MJD;

        double jd;
        int B;
        int y, m, day;
        int MJDay = (int) MJD;
        double time = MJD - MJDay;
        double hour = time * 24;
        int h = (int) hour;
        double minute = (hour - h) * 60;
        int min = (int) minute;
        double sec = Math.round((minute - min) * 60);
        if (sec == 60.0) {
            sec = 0.0;
            min = min + 1;
        }
        jd = MJD + 2400000.5;
        jd = jd + 0.5;
        int I = (int) jd;
        double F = jd - I;

        int A = (int) ((I - 1867216.25) / 36524.25);

        if (I > 2299160) {
            B = I + 1 + A - (int) (A / 4.0);
        } else {
            B = I;
        }

        int C = B + 1524;
        int D = (int) ((C - 122.1) / 365.25);
        int E = (int) (365.25 * D);
        int G = (int) ((C - E) / 30.6001);

        day = (int) (C - E + F - (int) (30.6001 * G));

        if (G < 13.5) {
            m = G - 1;
        } else {
            m = G - 13;
        }

        if (m > 2.5) {
            y = D - 4716;
        } else {
            y = D - 4715;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH mm SS.sss");
        String date = String.valueOf((y +" " + m +" " + day +" " +  h +" " +  min+" " +  sec));
        
        LocalDate parsedDate = LocalDate.parse(date, formatter);

        return parsedDate;
    }
}
