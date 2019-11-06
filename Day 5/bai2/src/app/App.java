package app;
import common.Knight;

public class App {
    public static void main(String[] args) throws Exception {
        Knight nam=new Knight();
        nam.setName("Huhu");
        nam.setHP(0);
        nam.setMP(305);

        do{
            nam.Heal();
            System.out.println("HP: "+nam.getHP()+",MP: "+nam.getMP());
        }while(nam.getMP()>50);
    }
}