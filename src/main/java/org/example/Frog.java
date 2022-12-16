package org.example;

public class Frog {
    private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean Eats(Grass grass){
    if (Lives()){
      return true;
    }else
      return false;
  }
    public boolean Breath(Tree t,Sun s){
    if (t.oxygen(s)){
      return  true;
    }else
      return false;
    }

    public boolean Moves(){
    if (Lives()){
      return true;
    }else
      return false;
    }

    public boolean Sleep(Sun s){
    if (s.bright()){
      return false;
    }else
      return true;
    }
  public boolean Lives(){
    if (getAge()<=5){
      return true;
    }else
      return false;
  }
}
