
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        // double x = 3.14;
        // double y = -10;

        // double z = Math.max(x, y);
        // double w = Math.min(x, y);
        // double t = Math.abs(y);
        // double c = Math.sqrt(y);
        // double d = Math.round(x);
        // double e = Math.ceil(x);
        // double f = Math.floor(x);
        

        // System.out.println(z);
        // System.out.println(w);
        // System.out.println(t);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.err.println(f);

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x:  ");
        x = scanner.nextDouble();
        System.out.println("Enter side y:  ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        
        System.out.println("The hypotenuse is : "+ z);
        scanner.close();
    }
}