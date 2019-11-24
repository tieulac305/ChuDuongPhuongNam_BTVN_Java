package common;
import java.util.Scanner;
public class Engineer extends Person{
    private String major;
    private int grad;
    
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin cho ky su:");
        System.out.print("Nhap ho ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.birth = sc.nextLine();
        System.out.print("Nhap que quan: ");
        this.home = sc.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        this.major = sc.nextLine();
        System.out.print("Nhap nam tot nghiep: ");
        this.grad = sc.nextInt();
        // sc.close();
        // If  System.in, a BufferedInputStream from the keyboard, is closed, as happens when the Scanner object is closed, you are closing a System stream that cannot be re-opened. 
        // The program must be exited and then re-run to re-establish  System.in.
        // F**king never close it :) Get a warning and be happy with that warning instead of exception :))))
    }

    public void XUAT() {
        System.out.println("Ten: " + this.name 
                        + ",Ngay sinh: "+this.birth
                        + ",Que quan: "+this.home
                        +",Chuyen nganh: "+this.major
                        +",Nam tot nghiep: "+this.grad);
    }
}