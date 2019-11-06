package common;

public class Knight{
    private String name;
    private int HP;
    private int MP;

    public void setName(String x){
        this.name=x;
    }
    public void setHP(int x){
        this.HP=x;
    }
    public void setMP(int x){
        this.MP=x;
    }

    public String getName(){
        return this.name;
    }
    public int getHP(){
        return this.HP;
    }
    public int getMP(){
        return this.MP;
    }

    public void Heal(){
        if(this.MP>50){
            HP+=30;
            MP-=50;
        }
    }
}