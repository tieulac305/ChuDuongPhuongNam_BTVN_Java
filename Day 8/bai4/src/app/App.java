package app;
//dung de y su lam mau nay, sai thoi anh nhe :3
import common.CustomerPhone;
import common.PhoneBook;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        PhoneBook myPhoneBook = new PhoneBook();
        CustomerPhone newContact;
        newContact = new CustomerPhone("Chanh", 23, "0373 801 051");
        myPhoneBook.AddCustomerPhone(newContact);
        newContact = new CustomerPhone("Skyyy", 17, "0963 245 867");
        myPhoneBook.AddCustomerPhone(newContact);
        newContact = new CustomerPhone("Asas", 57, "0345 778 692");
        myPhoneBook.AddCustomerPhone(newContact);
        newContact = new CustomerPhone("Crush", 20, "0987 305 xxx");
        myPhoneBook.AddCustomerPhone(newContact);
        //thoi luu the thoi
        showMenu();

        int num=0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Nhap yeu cau (0 de hien thi lai menu, -1 de thoat): ");
            num=sc.nextInt();
            if(num==-1){
                break;
            }
            else if(num==0){
                showMenu();
            }
            else if(num==1){
                myPhoneBook.ShowAllPhoneBook();
            }
            else if(num==2){
                myPhoneBook.ShowCustomerPhoneBookByName();
            }
            else if(num==3){
                myPhoneBook.ShowCustomerPhoneBookByAge();
            }
            else{
                System.out.println("Yeu cau khong phu hop.");
            }
        }
    }

    public static void showMenu(){
        System.out.println("MENU:");
        System.out.println("1. Hien thi tat ca lien lac.");
        System.out.println("2. Tim kiem lien lac theo ten.");
        System.out.println("3. Tim kiem lien lac theo tuoi.");
    }
}