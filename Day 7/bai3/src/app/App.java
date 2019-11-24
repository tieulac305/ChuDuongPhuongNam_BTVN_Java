package app;
// WA :(((
import java.util.Scanner;

import common.*;
import common.Class;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class imsad = new Class();
        Student [] students;

        System.out.println("Nhap vao thong tin lop hoc:");
        System.out.print("Nhap ma lop hoc: ");
        imsad.setCode(sc.nextLine());
        System.out.print("Nhap ten lop hoc: ");
        imsad.setName(sc.nextLine());
        System.out.print("Nhap ngay mo: ");
        imsad.setOpDay(sc.nextLine());
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        students = new Student[n];
        imsad.setNum(n);
        for(int i=0 ; i<n ; i++){
            students[i] = new Student();
            students[i].Nhap();
        }
        imsad.setStudents(students);
        System.out.print("Nhap giao vien: ");
        sc.nextLine();
        imsad.setTeacher(sc.nextLine());

        System.out.println("Thong tin lop hoc vua nhap: ");
        System.out.println("Ma lop hoc: "+imsad.getCode());
        System.out.println("Ten lop hoc: "+imsad.getName());
        System.out.println("Ngay mo: "+imsad.getOpDay());
        System.out.println("So luong sinh vien: "+imsad.getNum());
        System.out.println("Thong tin sinh vien: ");
        Student [] imsadsts = imsad.getStudents();
        for(int i=0 ; i<n ; i++){
            imsadsts[i].Xuat();
        }
        System.out.println("Giao vien: "+imsad.getTeacher());
    }
}