package common;

public class Person{
  private String name;
  private int age;
  private String hobby;
  private String sex;

  void setname(String x){
    name=x;
  }

  void setage(int x){
    age=x;
  }

  void sethobby(String x){
    hobby=x;
  }

  void setsex(String x){
    sex=x;
  }

  String getname(){
    return name;
  }

  int getage(){
    return age;
  }

  String gethobby(){
    return hobby;
  }

  String getsex(){
    return sex;
  }
}