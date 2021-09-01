package com.company;

import static java.lang.Math.floor;


public class Epochdate {

    double epoch;

    public Epochdate(double epoch) {
        this.epoch = epoch;
        double ept, eptj, day, date;
        int year;
        int month;

        ept = (int) (epoch);
        eptj = (int) (ept / 1000);
        year = (int) floor(2000 + eptj);  //trunc(2000+eptj)  trunc(x):={⌊x⌋ if x≥0 (Math.floor) ⌈x⌉ if x<0 (Math.ceil)
        day = ept - eptj * 1000;





        DateSerial dateserial = new DateSerial(year, 1, 1);
     //   day2000 day2000 = new day2000(year, month, day, 12, 0, 0);
    //    double DateSerial = 36526 + Double.parseDouble(day2000.toString());




    //    date = dateserial + day - 1;

    }

}

