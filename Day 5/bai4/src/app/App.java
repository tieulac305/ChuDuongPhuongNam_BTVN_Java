package app;
import common.Human;

public class App {
    public static void main(String[] args) throws Exception {
        Human man1=new Human();
        Human man2=new Human();
        man1.setName("Con cho");
        man2.setName("Con meo");
        man1.setDmg(10);
        man2.setDmg(100);
        man1.setHP(1000);
        man2.setHP(367);
        while(true){
            man1.Attack(man2);
            System.out.println("Tinh hinh:");
            man1.showStatus();
            man2.showStatus();
            if(man2.getHP()<=0){
                break;
            }
            man2.Attack(man1);
            System.out.println("Tinh hinh:");
            man1.showStatus();
            man2.showStatus();
            if(man1.getHP()<=0){
                break;
            }
        }
        if(man1.getHP()>man2.getHP()){
            System.out.println("Chien thang: "+man1.getName());
        }
        else if(man1.getHP()<man2.getHP()){
            System.out.println("Chien thang: "+man2.getName());
        }
        else{
            System.out.println("Hoa nhau :3");
        }
    }
}
