package com.company;

import static java.lang.Math.floor;


public class Epochdate {
    private final Object Epochdate;
    double epoch;
    public Epochdate(double epoch) {
        this.epoch=epoch;
        double ept, eptj, day, date;
        int year;

        ept = (int) (epoch);
        eptj = (int) (ept / 1000);
        year = (int) floor(2000 + eptj);  //trunc(2000+eptj)  trunc(x):={⌊x⌋ if x≥0 (Math.floor) ⌈x⌉ if x<0 (Math.ceil)
        day = ept - eptj * 1000;
        DateSerial dateserial = new DateSerial(year, 1, 1);
        date = Double.parseDouble(String.valueOf(dateserial)) + day - 1;
        Epochdate = date;
        return;
    }

}

