package org.homework2;

public class Dog {

  private String name;
  private  int age;

  private String breed;

  public Dog(String name,int age,String breed){
    this.name=name;
    this.age=age;
    this.breed=breed;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name=name;
  }

  public int getAge(){
    return age;
  }
  public  void setAge(int age){
    this.age=age;
  }

  public String getBreed(){
    return breed;
  }
  public void setBreed(String breed){
    this.breed=breed;
  }

  public boolean run(int age,String name){
    if (age<=10){
      return true;
    }else {
      return false;
    }
  }
  public static void main(String[] args) {
      Dog dog=new Dog("Name",5,"Doberman");

    System.out.println("Name -> "+dog.getName());
    System.out.println("Age -> "+dog.getAge());
    System.out.println("Breed -> "+dog.getBreed());
  }



}
