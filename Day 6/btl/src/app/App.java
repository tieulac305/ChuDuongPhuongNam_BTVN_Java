package app;
import common.*;
import java.util.Scanner;
//Sai thi thoi :v copy y tuong :'(

public class App {
    public static void main(String[] args) throws Exception {
        KyNang [] as= new KyNang[1];
        as[0]=new KyNang("Thoi lua", 30, 0, 0);
        NhanVat a=new NhanVat("Con ho", 500, 0, 20, as);
        System.out.println("Nhan vat:");
        System.out.println("1. Cung thu");
        System.out.println("2. Hiep si");
        System.out.print("Chon nhan vat: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Ai danh truoc: ");
        System.out.println("1. Ban");
        System.out.println("2. Quai vat");
        System.out.print("Chon nguoi danh truoc: ");
        int m=sc.nextInt();
        if(n==1){
            KyNang [] bs= new KyNang[2];
            bs[0]= new KyNang("Hit", 30, 0, 0);
            bs[1]= new KyNang("Aim" , 100,30,10);
            NhanVat b=new NhanVat("Cung thu", 200,150,10,bs);
            TranDau hi=new TranDau(a, b, m);
            hi.fight();
            hi.ShowResult();
        }
        else{
            KyNang [] bs= new KyNang[2];
            bs[0]= new KyNang("Hit", 40, 0, 0);
            bs[1]= new KyNang("Shield" , 100,50,30);
            NhanVat b=new NhanVat("Cung thu", 150,100,20,bs);
            TranDau hi=new TranDau(a, b, m);
            hi.fight();
            hi.ShowResult();
        }
        sc.close();
    }
}