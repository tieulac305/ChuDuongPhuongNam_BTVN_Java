package common;
import java.util.Scanner;

public class Dog{
  private String name;
  private int MP=100;

  public void InputName(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap ten cho cho: ");
    name=sc.nextLine();
  }

  public void ShowMP(){
    System.out.println("MP: "+MP);
  }

  public void Bark (){
    if(name==null){
      System.out.println("Xin lỗi bạn chưa điền tên.");
    }
    else{
      System.out.println(name+" sủa.");
      MP-=20;
    }
  }
}