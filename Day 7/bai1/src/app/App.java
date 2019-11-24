package app;
import common.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong ky su: ");
        int n=sc.nextInt();
        System.out.println("Nhap danh sach ky su:");
        Engineer [] engineers = new Engineer[n];
        for(int i=0 ; i<n ; i++){
            engineers[i]=new Engineer();
            engineers[i].NHAP();
        }
        sc.close();

        System.out.println("Danh sach ky su vua nhap:");
        for(int i=0 ; i<n ; i++){
            engineers[i].XUAT();
        }

        // There are only NHAP() and XUAT() so I can't get the graduation year of an engineer.
        // Or maybe all the attributes are public?
    }
}