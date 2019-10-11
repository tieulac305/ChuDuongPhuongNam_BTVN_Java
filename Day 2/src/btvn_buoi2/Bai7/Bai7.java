package btvn_buoi2.Bai7;

import java.util.Scanner;

public class Bai7{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap a: ");
    float a=sc.nextFloat();
    System.out.print("Nhap b: ");
    float b=sc.nextFloat();
    System.out.println("Max: "+(a>b?a:b));
    System.out.println("Min "+(a<b?a:b));
  }
}
