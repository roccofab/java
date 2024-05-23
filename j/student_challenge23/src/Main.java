//1. I can declare a reference for abstract class however I can't create an object from the abstract class
//2. If the method has not a body it must be declared as abstract
//3. I cannot declare an abstract class as final because a final class cannot be extended while an abstract class is created to be extended by other classes
//4. I cannot declare an abstract method as final because a final method cannot be overrided while an abstract method is created to be overrided
//5. I cannot declare an abstract class as static because a static class is indipendent and cannot be extended
//6. I cannot declare an abstract method as static because the static method belongs to the static class and cannot be overridden by other classes
//7. A subclass that inherit from the Super Abstract Class must inherit the method from the Super Abstract Class
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        Circle c = new Circle();
        c.radius = 5;
        Shape s = r;  //object rectangle with reference to abstract class Shape
        System.out.println("Rectangle Area: " +r.area());
        System.out.println("Rectangle Perimeter: " +r.perimeter());
        System.out.println("Circle Area: " +c.area());
        System.out.println("Circle Perimeter: " +c.perimeter());
        System.out.println("Rectangle Area with Reference to Shape: " +s.area());
    }
}