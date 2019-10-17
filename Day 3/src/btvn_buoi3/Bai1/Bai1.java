package btvn_buoi3.Bai1;

import java.util.Scanner;

public class Bai1{
  public static void main(String[] args) {
    int [] a=new int[100000];
    int n;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    for(int i=0 ; i<n ; i++){
      a[i]=sc.nextInt();
    }
    int max=0x3f3f3f3f;
    int ans=0;
    for(int iter=0 ; iter<3 ; iter++){
      ans=a[0];
      for(int i=1 ; i<n ; i++){
        if(ans<a[i]&&a[i]<max){
          ans=a[i];
        }
      }
      max=ans;
    }
    System.out.println(ans);
  }
}