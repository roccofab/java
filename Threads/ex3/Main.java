public class Main{
 public static void main(String[] args){
   Test t = new Test();
   Test2 t2 = new Test2();
   Thread tr = new Thread(t);
   Thread tr2 = new Thread(t2);
   tr.start();
   tr2.start();
   int i = 0;
   while(i < 10){
   System.out.println(i+ " Word");
   i++;
  }
 }
}