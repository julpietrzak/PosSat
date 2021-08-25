package com.company;

public class day2000 {
    int year, month, day, hour, min;
    double sec;

    public day2000(int year, int month, int day, int hour, int min, double sec) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.min = min;
        this.sec = sec;

        double A, b;

        A = 10000 * year + 100 * month + day;
        if (month <= 2) {
            month = month + 12;
            year = year - 1;
        }
        b = (int) (year / 400) - (int) (year / 100) + (int) (year / 4);
        A = 365 * year - 730548.5;
        double day2000 = A + b + (int) (30.6001 * (month + 1)) + day + (hour + min / 60 + sec / 3600) / 24;
        return;

    }
}
