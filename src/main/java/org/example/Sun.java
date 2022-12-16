package org.example;

import java.util.Random;

public class Sun {

  int now = 0;
  private int day;
  private int night;

  public boolean  bright() {


    if (now > day) {
      return true;
    }else
      return false;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getNight() {
    return night;
  }

  public void setNight(int night) {
    this.night = night;
  }
}
