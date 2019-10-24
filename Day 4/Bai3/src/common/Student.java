package common;
import java.util.Scanner;

public class Student{
  private String name;
  private String code;
  private int age;

  public void InputInfo(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap ten sinh vien: ");
    name=sc.nextLine();
    System.out.print("Nhap tuoi sinh vien: ");
    age=sc.nextInt();
    System.out.print("Nhap ma sinh vien: ");
    sc.nextLine();
    code=sc.nextLine();
  }

  public void ShowInfo(){
    System.out.print("Ten sinh vien: "+name);
    System.out.print(",tuoi sinh vien: "+age);
    System.out.println(",ma sinh vien: "+code);
  }
}