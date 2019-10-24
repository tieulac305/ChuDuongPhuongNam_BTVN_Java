package main;
import common.*;

public class RunMain{
  public static void main(String[] args) {
    Person SonNghien= new Person();
    Person TuBueDe=new Person();
    SonNghien.setname("Son");
    SonNghien.setsex("Nam");
    SonNghien.setage(8);
    SonNghien.sethobby("Ta tua");
    TuBueDe.setname("Tu");
    TuBueDe.setsex("Yue");
    TuBueDe.setage(2964);
    TuBueDe.sethobby("SonNghien");

    System.out.println("SonNghien:");
    System.out.println("Name: "+SonNghien.getname());
    System.out.println("Age: "+SonNghien.getage());
    System.out.println("Sex: "+SonNghien.getsex());
    System.out.println("Hobby: "+SonNghien.gethobby());
    System.out.println("TuBueDe:");
    System.out.println("Name: "+TuBueDe.getname());
    System.out.println("Age: "+TuBueDe.getage());
    System.out.println("Sex: "+TuBueDe.getsex());
    System.out.println("Hobby: "+TuBueDe.gethobby());
  }
}