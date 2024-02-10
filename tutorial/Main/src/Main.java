import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter ray of the circle: ");
     double ray = sc.nextDouble();
     Circle c = new Circle(ray);
     System.out.println("Area of the circle is: " + c.calculateArea());


     System.out.println("Enter base of the rectangle: ");
     double base = sc.nextDouble();

     System.out.println("Enter height: ");
     double height = sc.nextDouble();
     rectangle r = new rectangle(base, height);
     System.out.println("Area of the rectangle is: " + r.calculateArea());

System.out.println("Generic Triangle Area(generic), Right Triangle Area(right_triangle), Isosceles Triangle Area(isosceles_triangle), Equilater Triangle Area(equilater_triangle): ");
String symbol = sc.next().toLowerCase();
sc.nextLine();
switch(symbol) {
      case "generic":
      System.out.println("Enter base: ");
      double width = sc.nextDouble();

      System.out.println("Enter height: ");
      double height2 = sc.nextDouble();

      triangle t = new triangle(width, height2);
      System.out.println("Area of the generic Triangle is: " + t.calculateArea());
      break;

 case "right_triangle":
  System.out.println("Enter base: ");
  double width2 = sc.nextDouble();

  System.out.println("Enter height: ");
  double height3 = sc.nextDouble();

  double hypotenuse = Math.sqrt(width2 * width2 + height3 * height3);
  triangle.rightTriangle t2 = new triangle.rightTriangle(width2, height3, hypotenuse);
  System.out.println("Area of the right Triangle is: " + t2.calculateArea() + " and the hypotenuse is: " + hypotenuse);
  break;

    case "isosceles_triangle":
        System.out.println("Enter base: ");
        double width3 = sc.nextDouble();

        System.out.println("Enter heigth: ");
        double height4 = sc.nextDouble();

        double sideLength = Math.sqrt(width3 * width3 + height4 * height4);
        triangle.isoscelesTriangle t3 = new triangle.isoscelesTriangle(width3, height4, sideLength);
        System.out.println("Area of the isosceles Triangle is: " +t3.calculateArea() + "and the side length is: " +sideLength);
        break;

    case "equilater_triangle":
        System.out.println("Enter Side Length: ");
        double sideLength2 = sc.nextDouble();
        triangle.equilaterTriangle t4 = new triangle.equilaterTriangle(sideLength2);
        System.out.println("Area of the equilater Triangle is: " +t4.calculateArea());
        break;
     }
    }
}