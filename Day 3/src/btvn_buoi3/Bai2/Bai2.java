package btvn_buoi3.Bai2;

import java.util.Scanner;

public class Bai2 {
  public static void main(String[] args) {
    String s;
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    //that ra bai nay kieu 135 thi tach lam 1 so se hay hon, chu tinh tong chu so thi de qua anh a
    int kq=0;
    char [] q=s.toCharArray();
    for(int i=0 ; i<s.length() ; i++){
      if('0'<q[i]&&q[i]<='9'){
        kq+=q[i]-'0';
      }
    }
    System.out.println(kq);
  }
}
