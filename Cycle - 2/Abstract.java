abstract class Shape{
    abstract void area();
}

class Circle extends Shape{
    int r;
    Circle(int r){
        this.r = r;
    }
    void area(){
        System.out.println("Area: " + 3.14 * r * r);
    }
}

class Rectangle extends Shape{
    int l;
    int w;
    Rectangle(int l , int w){
        this.l = l;
        this.w = w;
    }
    void area(){
        System.out.println("Area: " + l*w);
    }
}


public class Abstract{
    public static void main(String[] args){
        Shape s;
        s = new Circle(5);
        s.area();
        s = new Rectangle(10, 20);
        s.area();
    }
}
