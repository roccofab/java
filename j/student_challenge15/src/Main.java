public class Main{
  public static void main(String[] args){
   Cylinder cylinder = new Cylinder(5, 20);
   System.out.println("Base Area: " +cylinder.baseArea());
   System.out.println("Lateral Surface Area: " +cylinder.LateralSurfaceArea());
   System.out.println("Total Surface Area: " +cylinder.totalSurfaceArea());
 }
}