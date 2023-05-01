import java.util.*;

abstract class Figure {
    int l, b;
    Scanner sc = new Scanner (System.in);
    abstract void area();
}


class triangle extends Figure {
    void area(){
        System.out.println("Enter the dimensions for triangle: ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The area is" +(0.5*l*b));

    
    }

    

}


class rectangle extends Figure {
    void area(){
        System.out.println("Enter the dimensions for rectangle: ");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The area is" +(l*b));

    }
    }


public class Fig {
    public static void main(String args[]){
        Figure f1 = new triangle();
        f1.area();
        Figure f2 = new rectangle();
        f2.area();

    }
    
}