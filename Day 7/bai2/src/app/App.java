package app;
import common.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //To get and print
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        Moto moto = new Moto();

        System.out.println("Nhap thong tin cho o to:");
        System.out.print("Nhap nhan hieu: ");
        car.setBrand(sc.nextLine());
        System.out.print("Nhap nam san xuat: ");
        car.setRelease(sc.nextInt());
        System.out.print("Nhap hang: ");
        sc.nextLine();
        car.setManufacturer(sc.nextLine());
        System.out.print("Nhap so cho ngoi: ");
        car.setSeatCnt(sc.nextInt());
        System.out.print("Nhap dung tich: ");
        car.setCc(sc.nextInt());

        System.out.println("Nhap thong tin cho mo to:");
        System.out.print("Nhap nhan hieu: ");
        sc.nextLine();
        moto.setBrand(sc.nextLine());
        System.out.print("Nhap nam san xuat: ");
        moto.setRelease(sc.nextInt());
        System.out.print("Nhap hang: ");
        sc.nextLine();
        moto.setManufacturer(sc.nextLine());
        System.out.print("Nhap phan khoi: ");
        moto.setCc(sc.nextInt());

        System.out.println("Thong tin o to:");
        System.out.println("Nhan hieu: "+car.getBrand()
                        +", Nam SX: "+car.getRelease()
                        +", Hang: "+car.getManufacturer()
                        +", So cho ngoi: "+car.getSeatCnt()
                        +", Dung tich: "+car.getCc());

        System.out.println("Thong tin mo to:");
        System.out.println("Nhan hieu: "+moto.getBrand()
                        +", Nam SX: "+moto.getRelease()
                        +", Hang: "+moto.getManufacturer()
                        +", Phan khoi: "+moto.getCc());
        sc.close();
    }
}