package common;
import java.util.Scanner;

public class Mem{
    private String MSV;
    private String Ten;
    private int Tuoi;
    private String Lop;
    Scanner sc=new Scanner(System.in);

    void setMSV(String x){
        this.MSV=x;
    }
    void setTen(String x){
        this.Ten=x;
    }
    void setTuoi(int x){
        this.Tuoi=x;
    }
    void setLop(String x){
        this.Lop=x;
    }

    String getMSV(){
        return this.MSV;
    }
    String getTen(){
        return this.Ten;
    }
    int getTuoi(){
        return this.Tuoi;
    }
    String getLop(){
        return this.Lop;
    }

    public void init(){
        String x;
        System.out.print("Nhap MSV: ");
        x=sc.nextLine();
        this.setMSV(x);
        System.out.print("Nhap ten sinh vien: ");
        x=sc.nextLine();
        this.setTen(x);
        System.out.print("Nhap tuoi sinh vien: ");
        int t=sc.nextInt();
        this.setTuoi(t);
        sc.nextLine();
        System.out.print("Nhap lop sinh vien: ");
        x=sc.nextLine();
        this.setLop(x);
    }

    public void show(){
        System.out.println("MSV: "+this.MSV+",Ten: "+this.Ten+",Tuoi: "+this.Tuoi+",Lop: "+this.Lop);
    }
}