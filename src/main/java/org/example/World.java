package org.example;

public class World {

  public static void main(String[] args) {
    Frog frog=new Frog();
    Tree tree=new Tree();
    Sun sun=new Sun();
    sun.setDay(12);
    sun.setNight(0);

    System.out.println(sun.bright());
  }
}