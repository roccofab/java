//overloaded method to calculate area
class MethodChallenge6{
 static int RectangleArea(int b, int h){
   return b * h;
 }
 static float RectangleArea(float b, float h){
   return b * h;
 }
 static double RectangleArea(double b, double h){
   return b * h;
 }
 public static void main(String[] args){
   System.out.println("Area is(integer type): " +RectangleArea(20, 12));
   System.out.println("Area is(float type): " +RectangleArea(10.5f, 5.2f));
   System.out.println("Area is(double type): " +RectangleArea(15.0, 7.25));
 }
}

