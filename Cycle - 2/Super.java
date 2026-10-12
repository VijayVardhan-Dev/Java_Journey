class SuperPower{
    String name = "Super Hero";
    SuperPower(){
        System.out.println("Super power is given to heros");
    }
    void power(){
        System.out.println("I have Super powers!");
    }
}

class Hero extends SuperPower{
    Hero(){
        super(); // Invoking parent class constructer
        System.out.println("I'll save the world");
    }
    void display(){
        System.out.println("parent Name: "+ super.name); // accessing parent class variable 
        super.power(); // accessing parent class method
    }
}

public class Super{
    public static void main(String[] args){
        Hero h = new Hero();
        h.display();
      
    }
}
