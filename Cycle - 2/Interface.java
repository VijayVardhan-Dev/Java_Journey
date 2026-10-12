interface Payment{
    void pay(int amount);
}

class Upi implements Payment{
    public void pay(int amount){
        System.out.println(amount + " is paid using UPI");
    }
}

class Card implements Payment{
    public void pay(int amount){
        System.out.println(amount + " is paid using Card");
    }
}

public class Interface {
    public static void main(String[] args){
        Payment p;
        p = new Upi();
        p.pay(1000);
        p = new Card();
        p.pay(1000);
    }
}
