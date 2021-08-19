package com.company;

import static java.lang.Math.atan;

public class atan2 {
  double a, b;

  public atan2(double a, double b) {
    this.a = a;
    this.b = b;
    double pom = 0;
    if (a==0 && b<0){ pom=-Math.PI/2;}
    if (a==0 && b>0) { pom =Math.PI/2;}
    if (a<0 &&b <0) { pom =atan(b/a)-Math.PI;}
    if (a==0 && b==0) { pom =0;}// - tutaj dzielenie przez zero - zabezpieczenie
    if (a<0 && b>=0) { pom =atan(b/a)+Math.PI;}
    if (a>0 && b==0) { pom =0;}
    if (a>0 && b<0 || b>0){  pom =atan(b/a);}
    double atan2 =pom;


  }
}
