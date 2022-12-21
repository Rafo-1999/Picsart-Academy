package org.homework2;

import java.util.ArrayList;
import java.util.List;
import javax.print.Doc;

public class Hospital {

  String floor;
  String doctor;
  List<Patient> patientList=new ArrayList<>();


  void addPatient(Patient p){
    patientList.add(p);
  }

  public List<Patient> showPatients(){
    return patientList;
  }





  public  static class  Doctor{
    private  String doctorName;
    private String doctorSpeciality;

    public Doctor(String doctorName, String doctorSpeciality) {
      this.doctorName = doctorName;
      this.doctorSpeciality = doctorSpeciality;
    }

    public String getDoctorName() {
      return doctorName;
    }

    public void setDoctorName(String doctorName) {
      this.doctorName = doctorName;
    }

    public String getDoctorSpeciality() {
      return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
      this.doctorSpeciality = doctorSpeciality;
    }
  }





  public static class Patient{
    private String name;
    private String surname;

    private String disease;


    public Patient(String name,String surname,String disease){
      this.name=name;
      this.surname=surname;
      this.disease=disease;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getSurname() {
      return surname;
    }

    public void setSurname(String surname) {
      this.surname = surname;
    }

    public String getDisease() {
      return disease;
    }

    public void setDisease(String disease) {
      this.disease = disease;
    }
  }
  public static void main(String[] args) {
      Hospital hospital=new Hospital();

    Doctor doctor=new Doctor("DoctorName1","Speciality1");

      Patient patient1=new Patient("Name1","Surname1","Disease1");




    System.out.println(patient1.getName());
    System.out.println(patient1.getSurname());
    System.out.println(patient1.getDisease());







  }

}
