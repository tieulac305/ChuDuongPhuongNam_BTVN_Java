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
// dinh viet method nhap cho class luon ma thoi nhin the nay cho da dang
// du trong hoi kem sang :v
// va thieu chuyen nghiep .-.
// noi chung bai nay tham qua T^T
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
        imsad.Print();

        int sts11=0;
        Student [] imsadsts = imsad.getStudents();
        for (Student sts : imsadsts){
            if (sts.getYear()==11){
                sts11+=1;
            }
        }
        System.out.println("So sinh vien khoa 11: "+sts11);
        
        for(int i=0 ; i<imsadsts.length ; i++){
            for(int j=i ; j<imsadsts.length ; j++){
                if(imsadsts[i].getYear()>imsadsts[j].getYear()){
                    Student none=imsadsts[i];
                    imsadsts[i]=imsadsts[j];
                    imsadsts[j]=none;
                }
            }
        }

        imsad.setStudents(imsadsts);
        System.out.println("Thong tin lop hoc sau khi sap xep: ");
        imsad.Print();
    }
}