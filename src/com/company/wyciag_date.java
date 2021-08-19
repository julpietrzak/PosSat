package com.company;

public class wyciag_date {
    double jd;

    public wyciag_date(double jd) {
        this.jd = jd;

        int r;
        double ed, ez, j;
        double liczba;
        String napis;

        ed = Double.parseDouble(String.valueOf(new Epochdate(jd)));
        ez = Double.parseDouble(String.valueOf(new Epochtime(jd)));
        j = ed + ez + 2415018.5;
        JD_KG jdkg= new JD_KG(j);

    }
}
