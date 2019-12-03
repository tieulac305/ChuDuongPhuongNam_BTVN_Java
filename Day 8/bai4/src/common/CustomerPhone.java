package common;

public class CustomerPhone{
    private String name;
    private int age;
    private String phone;

    public CustomerPhone(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
    }
    
    public void ShowInfo(){
        System.out.println("Ten: "+this.name
                        +", Tuoi: "+this.age
                        +", SDT: "+this.phone);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}