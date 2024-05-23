class Cylinder extends Circle{
 private double height;

 public Cylinder(double radius, double height){
   super(radius);
   this.height = height;
 }
 public double Volume(){
  return Area() * height;
 }
}