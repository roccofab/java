class MethodChallenge1{
  public static int Max(int x, int y){
    if(x > y){
      return x;
    } else {
      return y;
    }
  }
 public static void main(String[] args){
   int a = 20, b = -20;
   int c = Max(a, b);
   System.out.println("The Max Value is: " +c);
 }
}