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

class Avenger extends Hero{
    void fightVillains(){
        System.out.println("I'll fight the villains");
    }
}

public class MultiLevel{
    public static void main(String[] args){
        Avenger a = new Avenger();
        a.power();
        a.saveWorld();
        a.fightVillains();
    }
}
