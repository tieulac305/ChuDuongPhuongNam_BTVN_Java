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
        int l=this.first;
        while(!end()){
            if(l==1){
                System.out.println("------>Hero<---------");
                ngchoi.status();
                ngchoi.show_skills();
                System.out.print("Chon ky nang: ");
                int c=sc.nextInt();
                KyNang using=ngchoi.getSkills()[c-1];
                if(ngchoi.canUse(using)){
                    ngchoi.useKN(using);
                    qvat.getDame(using);
                    l=2;
                }
                else{
                    System.out.println("Khong dung duoc ky nang nay!");
                }
            }
            else{
                System.out.println("------>Monster<-------");
                qvat.status();
                qvat.show_skills();
                KyNang using=qvat.getSkills()[0];
                ngchoi.getDame(using);
                System.out.println("Chi co mot ky nang, khoi chon.");
                l=1;
            }
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