package com.company;

import static java.lang.Math.round;

public class Epochtime {
    double epoch;
   public Epochtime(double epoch) {

       double ept, eptj, day, date, UT;
       int year;
       ept= (int)(epoch);
       eptj= (int)(ept / 1000);
       year= (int) round(2000 + eptj);
       day=ept - eptj * 1000;
      DateSerial dateserial = new DateSerial(year, 1, 1);
       date=Double.parseDouble(String.valueOf(dateserial)) + day - 1;
       UT=epoch - ept;
       double Epochtime=UT;
   }
}
