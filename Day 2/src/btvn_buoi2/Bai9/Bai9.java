package btvn_buoi2.Bai9;

import java.util.Scanner;

public class Bai9{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap a: ");
    float a=sc.nextFloat();
    System.out.print("Nhap b: ");
    float b=sc.nextFloat();
    if(a==0){
      if(b==0){
        System.out.println("Pt vo so nghiem");
      }
      else{
        System.out.println("Pt vo nghiem");
      }
    }
    else{
      System.out.println("Phuong trinh co nghiem: "+(-b/a));
    }
  }
}
