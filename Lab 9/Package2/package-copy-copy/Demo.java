import geometry.Circle;

public class Demo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5.0);
        System.out.println("Area of the circle: " + c.getArea());
        System.out.println("Perimeter of the circle: " + c.getPerimeter());
    }
}