package com.company;

public class wyciag_date {
    double jd;
    int year,month,day, hour,min;
    double sec;
    public wyciag_date(double jd, int year,int month,int day,int hour,int min,double sec) {
        this.jd=jd;
        this.year=year;
        this.month=month;
        this.day=day;
        this.hour=hour;
        this.min=min;
        this.sec=sec;

        int r;
        double ed, ez, j;
        double liczba;
        String napis;



        ed=Double.parseDouble(String.valueOf(new Epochdate(jd)));
        ez=Double.parseDouble(String.valueOf(new Epochtime(jd)));
        j=ed + ez + 2415018.5;
        new JD_KG(j);
    }
}
