package common;
public class KyNang{
    private String name;
    private int HP,MP,AR;
    public KyNang(String n,int a,int b,int c){
        this.name=n;
        this.HP=a;
        this.MP=b;
        this.AR=c;
    }
    public void info(){
        System.out.println("Ky nang: "+this.name);
    }
    public int getMP(){
        return this.MP;
    }
    public int getHP(){
        return this.HP;
    }
    public int getAR(){
        return this.AR;
    }
}