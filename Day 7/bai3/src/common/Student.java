package common;
import java.util.Scanner;

public class Student extends Person {
    private String code;
    private String major;
    private int year;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getBirth() {
        return super.getBirth();
    }

    @Override
    public String getHome() {
        return super.getHome();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setBirth(String birth) {
        super.setBirth(birth);
    }

    @Override
    public void setHome(String home) {
        super.setHome(home);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void Nhap() {
        System.out.println("Nhap thong tin sinh vien:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.birth = sc.nextLine();
        System.out.print("Nhap que quan: ");
        this.home = sc.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        this.code = sc.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        this.major = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        this.year = sc.nextInt();
    }

    public void Xuat() {
        System.out.println("Ho ten: "+this.name
                        +", Ngay sinh: "+this.birth
                        +", Que quan: "+this.home
                        +", Ma sinh vien: "+this.code
                        +", Chuyen nganh: "+this.major
                        +", Khoa hoc: "+this.year);
    }
}