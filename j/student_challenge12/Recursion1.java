//recursion example
class Recursion1{
 static void fun(int n){
   if(n > 0){
    System.out.println(n);
    fun(n-1);
  }
 }

 static void fun2(int n){
   if(n > 0){
   fun2(n-1);
   System.out.println(n);
  }
 }
 public static void main(String[] args){
   fun(3);
   System.out.println();
   fun2(3);
 }
}