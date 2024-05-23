class Cylinder{
  double radius;
  double height;

  public Cylinder(double radius, double height){
    this.radius = radius;
    this.height = height;
  }
  public double baseArea(){
   return Math.PI*radius*radius;
 }
  public double LateralSurfaceArea() {
    return 2 * Math.PI * radius * height;
  }
  public double totalSurfaceArea(){
    return 2 * baseArea() * LateralSurfaceArea(); 
  }
}