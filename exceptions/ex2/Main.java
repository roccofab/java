public class Main{
 static int Area(int l, int b) throws NegativeDimensionException{
  if(l < 0 || b < 0){
    throw new NegativeDimensionException();
  }
  return l * b;
 }
 static int callArea() throws Exception{
   int a = Area(-10, 5);
   return a;
 }
 public static void main(String[] args) throws Exception{
  System.out.println(callArea());
 }
}