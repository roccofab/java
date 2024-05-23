public class Main{
 public static void main(String[] args){
  Cylinder c = new Cylinder(4, 8);  //call the constructor 3
  System.out.println("Base area: " +c.baseArea());
  System.out.println("Lateral Surface Area: " +c.lateralSurfaceArea());
  System.out.println("Total Area: " +c.totalSurfaceArea());
 }
}