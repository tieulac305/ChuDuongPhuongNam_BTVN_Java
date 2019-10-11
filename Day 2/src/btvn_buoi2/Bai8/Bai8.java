package btvn_buoi2.Bai8;

import java.util.Scanner;

public class Bai8{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap a: ");
    float a=sc.nextFloat();
    System.out.print("Nhap b: ");
    float b=sc.nextFloat();
    System.out.print("Nhap c: ");
    float c=sc.nextFloat();
    System.out.println("Max: "+(a>b&&a>c?a:(b>c?b:c)));
    System.out.println("Min "+(a<b&&a<c?a:(b<c?b:c)));
  }
}
