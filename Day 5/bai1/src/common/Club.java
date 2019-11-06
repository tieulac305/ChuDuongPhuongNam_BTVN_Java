package common;
import java.util.Scanner;

public class Club{
    private String tenclub;
    private int sothanhvien;
    private Mem [] thanhvien=new Mem[1000];

    public void init(){
        String x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten club: ");
        x=sc.nextLine();
        this.tenclub=x;
        System.out.print("Nhap so thanh vien cho club: ");
        this.sothanhvien=sc.nextInt();
        for(int i=0 ; i<sothanhvien ; i++){
            thanhvien[i]=new Mem();
            System.out.println("Nhap thong tin cho thanh vien "+(i+1)+":");
            thanhvien[i].init();
        }
        sc.close();
    }

    public void show(){
        System.out.println("Ten CLB: "+this.tenclub);
        System.out.println("So thanh vien: "+this.sothanhvien);
        for(int i=0 ; i<sothanhvien ; i++){
            thanhvien[i].show();
        }
    }
}