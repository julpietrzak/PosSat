package com.company;

public class DateSerial {
    int year, month, day;

    public DateSerial(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

        day2000 day2000 = new day2000(year, month, day, 12, 0, 0);
        double DateSerial = 36526 + Double.parseDouble(day2000.toString());


        return;
    }
}
