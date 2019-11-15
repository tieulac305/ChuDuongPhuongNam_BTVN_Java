package common;
import java.util.Scanner;

public class TranDau{
    private NhanVat qvat;
    private NhanVat ngchoi;
    private int first;
    Scanner sc=new Scanner(System.in);

    public TranDau(NhanVat x,NhanVat y,int a){
        this.qvat=x;
        this.ngchoi=y;
        this.first=a;
    }

    public void fight(){
        int l=this.first-1;
        while(!end()){
            attack(l);
            l^=1;
        }
        this.ShowResult();
    }

    public void attack(int l){
        if(l==0){
            System.out.println("------>Hero<---------");
            ngchoi.status();
            KyNang using=ngchoi.getKN();
            ngchoi.useKN(using);
            qvat.getDame(using);
        }
        else{
            System.out.println("------>Monster<-------");
            qvat.status();
            KyNang using=qvat.getKN();
            qvat.useKN(using);
            ngchoi.getDame(using);
        }
    }

    public boolean end(){
        return qvat.dead()||ngchoi.dead();
    }
    public void ShowResult(){
        if(qvat.dead()){
            System.out.println("Hero Win :')");
        }
        else System.out.println("Hero Lose :))");
    }
}