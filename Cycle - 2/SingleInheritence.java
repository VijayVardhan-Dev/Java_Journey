class SuperPower{
    void power(){
        System.out.println("I have Super powers!");
    }
}

class Hero extends SuperPower{
    void saveWorld(){
        System.out.println("I'll save the world");
    }
}

public class SingleInheritence{
    public static void main(String[] args){
        Hero h = new Hero();
        h.power();
        h.saveWorld();
    }
}
