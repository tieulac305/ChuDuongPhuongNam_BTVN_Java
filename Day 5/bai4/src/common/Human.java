package common;

public class Human{
    private String name;
    private int HP;
    private int dmg;

    public void setName(String x){
        this.name=x;
    }
    public void setHP(int x){
        this.HP=x;
    }
    public void setDmg(int x){
        this.dmg=x;
    }

    public String getName(){
        return this.name;
    }
    public int getHP(){
        return this.HP;
    }
    public int getDmg(){
        return this.dmg;
    }

    public void Attack(Human x){
        int q=x.getHP();
        q-=this.dmg;
        x.setHP(q);
    }

    public void showStatus(){
        System.out.println("Ten: "+this.name+",DMG:"+this.dmg+",HP: "+this.HP);
    }
}