//define more than one method constructor for the class
class Cylinder{
 private int radius;
 private int height;

 public Cylinder(){  //constructor 1 with any arguments
  radius = 1;
  height = 2;
 }
 public Cylinder(int r){  //constructor 2 with one argument radius
  radius = r;
  height = 1;
 }
 public Cylinder(int r, int h){  //constructor 2 with two arguments
  radius = r;
  height = h;
 }

 public int getRadius(){
  return radius;
 }
 public int getHeight(){
  return height;
 }
 public void setRadius(int r){
  radius = r;
 }
 public void setHeight(int h){
  height = h;
 }
 public double baseArea(){
  return Math.PI*radius*radius;
 }
 public double lateralSurfaceArea(){
  return 2 * Math.PI * radius * height;
 }
 public double totalSurfaceArea(){
  return 2 * baseArea() * lateralSurfaceArea();
 }
}