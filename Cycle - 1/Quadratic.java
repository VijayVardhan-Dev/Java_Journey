import java.util.*;
class RootsNature{

    static void calculate(double D,double a,double b){
        if (D > 0){
            double root1 = (-b + Math.sqrt(D))/(2 * a);
            double root2 = (-b - Math.sqrt(D))/(2 * a);
            System.out.println("Roots are real and Distinct" + "Root1 = " + root1 + "Root 2 = " + root2);
        }
        else if (D == 0){
            double root = -b/2*a;
            System.out.println("Roots are real and Equal" + "Root = " + root);
        }
        else {
            System.out.println("Roots are imaginary");
        }
    }
}


public class Quadratic {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        double D = (b * b) - (4 * a * c);
        RootsNature.calculate(D,a,b);

    }
}
