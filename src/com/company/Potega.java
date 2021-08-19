package com.company;

public class Potega {
    public Potega(double podst, double wykladnik){
        if (podst > 0){
            double Potega = Math.exp(wykladnik * Math.log(podst));
        }
     else {
         double Potega = 0;
     }
    }
}
