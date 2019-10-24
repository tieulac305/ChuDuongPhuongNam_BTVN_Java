package common;
import java.util.Scanner;

public class JavaClass{
  private Student stdList[];
  private int ratingStar;
  private String leader;//em nghi la nen co?

  private void InputStudent(){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.print("Nhap so thanh vien: ");
    n=sc.nextInt();
    stdList=new Student[n];
    for(int i=0 ; i<n ; i++){
      System.out.println("Nhap thong tin cho sv thu "+(i+1)+":");
      stdList[i]=new Student();
      stdList[i].InputInfo();
    }
  }

  private void ShowStudent(){
    for(Student x:stdList){
      x.ShowInfo();
    }
  }

  public void InputClassInfo(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap ten leader: ");
    leader=sc.nextLine();
    System.out.print("Rate: ");
    ratingStar=sc.nextInt();
    InputStudent();
  }

  public void ShowClassInfo(){
    System.out.println("Leader: "+leader);
    System.out.println("Rate: "+ratingStar);
    ShowStudent();
  }
}