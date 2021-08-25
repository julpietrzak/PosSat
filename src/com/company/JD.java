package com.company;

public class JD {
    int year,month,day,hour,min;
    double sec;
    int timezone;
    
    public JD(int year, int month,int day, int hour,int min,double sec, int timezone){
this.year=year;
this.month=month;
this.day=day;
this.hour=hour;
this.min=min;
this.sec=sec;
this.timezone=timezone;

        double A, b;
        double JD;
        if(month  >2) {
            month=month;
            year=year;
        }
       if (month  <=2) {
           month=month + 12;
           year=year - 1;
       }
        A= (int)(year / 100);
        b=2 - A + (int)(A / 4);
        JD=( (int)(365.25 * (year + 4716)) + (int)(30.6001 * (month  + 1)) + day + b + ((hour + min / 60 + sec / 3600) / 24) - 1524.5)-(timezone / 24);
     return;
    }
}
