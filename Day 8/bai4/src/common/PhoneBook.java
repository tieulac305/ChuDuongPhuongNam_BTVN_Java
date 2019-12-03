package common;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook{
    private ArrayList <CustomerPhone> PhoneBook;

    public void AddCustomerPhone(CustomerPhone A){
        this.PhoneBook.add(A);
    }

    ArrayList<CustomerPhone> SearchByName(String name){
        ArrayList<CustomerPhone> sameName = new ArrayList <CustomerPhone>();
        for(CustomerPhone cp: this.PhoneBook){
            if(cp.getName().contains(name)){
                sameName.add(cp);
            }
        }
        return sameName;
    }

    public void ShowCustomerPhoneBookByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("***Tim kiem theo ten. Nhap -1 de ket thuc.");
        while(true){
            String x;
            System.out.print("Nhap ten: ");
            x=sc.nextLine();
            if(x.contains("-1")){
                break;
            }
            else{
                System.out.println("***Cac lien he thoa man:");
                for(CustomerPhone cp: SearchByName(x)){
                    cp.ShowInfo();
                }
            }
        }
    }

    ArrayList<CustomerPhone> SearchByAge(int age1,int age2){
        ArrayList<CustomerPhone> matchAge = new ArrayList <CustomerPhone>();
        for(CustomerPhone cp: this.PhoneBook){
            if(cp.getAge()>=age1&&cp.getAge()<=age2){
                matchAge.add(cp);
            }
        }
        return matchAge;
    }

    public void ShowCustomerPhoneBookByAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("***Tim kiem theo tuoi. Nhap -1 de ket thuc.");
        while(true){
            int x1,x2;
            System.out.print("Nhap tuoi duoi: ");
            x1=sc.nextInt();
            if(x1==-1){
                break;
            }
            else{
                System.out.print("Nhap tuoi tren: ");
                x2=sc.nextInt();
                System.out.println("***Cac lien he thoa man:");
                for(CustomerPhone cp: SearchByAge(x1,x2)){
                    cp.ShowInfo();
                }
            }
        }
    }

    public void ShowAllPhoneBook(){
        System.out.println("***Tat ca lien he:");
        for(CustomerPhone cp: this.PhoneBook){
            cp.ShowInfo();
        }
    }

    public PhoneBook() {
        this.PhoneBook = new ArrayList <CustomerPhone>();
    }
    public PhoneBook(ArrayList<CustomerPhone> phoneBook) {
        PhoneBook = phoneBook;
    }
}