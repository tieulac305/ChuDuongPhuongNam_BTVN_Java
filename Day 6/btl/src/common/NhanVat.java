package common;
import java.util.Scanner;
public class NhanVat{
    private String name;
    private KyNang skills[];
    private int MP,HP,AR;
    Scanner sc=new Scanner(System.in);
    public NhanVat(String n,int a,int b,int c,KyNang ss[]){
        this.name=n;
        this.HP=a;
        this.MP=b;
        this.AR=c;
        this.skills=ss;
    }

    public KyNang[] getSkills(){
        return this.skills;
    }

    public boolean canUse(KyNang x){
        return this.MP>=x.getMP();
    }

    public void useKN(KyNang x){
        this.MP-=x.getMP();
    }

    public KyNang getKN(){
        this.show_skills();
        System.out.print("Chon ky nang: ");
        int c=sc.nextInt();
        KyNang using=this.getSkills()[c-1];
        while(!this.canUse(using)){
            System.out.println("Khong dung duoc ky nang nay!");
            c=sc.nextInt();
            using=this.getSkills()[c-1];
        }
        return using;
    }

    public void getDame(KyNang x){
        this.AR-=x.getAR();
        if(this.AR<0) this.AR=0;
        this.HP-=(x.getHP()-this.AR);
    }
    public void status(){
        System.out.println(this.name+"(HP: "+this.HP+",MP: "+this.MP+",AR: "+this.AR+")");
    }
    public void show_skills(){
        int i=1;
        for(KyNang skill: this.skills){
            System.out.print(i+". ");
            skill.info();
            i+=1;
        }
    }
    public boolean dead(){
        return this.HP<0;
    }
}