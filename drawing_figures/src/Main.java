import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drawable Circle = new Circle();
        Drawable Rectangle = new Rectangle();
        Drawable Triangle = new Triangle();
        System.out.println("Paint Circle(a): ");
        System.out.println("Paint Rectangle(b): ");
        System.out.println("Paint Triangle(c): ");
        String choice = sc.next();
        switch(choice){
            case "a":
                Circle.draw();
                break;
            case "b":
                Rectangle.draw();
                break;
            case "c":
                Triangle.draw();
                break;
                default:
                    System.out.println("Invalid Input");
                    break;
        }
    }
}