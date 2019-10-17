package btvn_buoi3.Bai4;

import java.util.Scanner;

public class Bai4{
  public static void main(String[] args) {
    String s;
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    int kq=0;
    char [] q=s.toCharArray();
    char [] hi="hello".toCharArray();
    for(int i=0 ; i<s.length() ; i++){
      if(q[i]==hi[kq]){
        kq++;
      }
      if(kq==5){
        break;
      }
    }
    if(kq==5) System.out.println("YES");
    else System.out.println("NO");
  }
}
