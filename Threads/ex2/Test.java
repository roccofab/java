/* In this demonstration i achive multithreading using a class Test that inherit from thread class
   but the class Test also contains main method
*/
public class Test extends Thread{
 public void run(){
   int i = 1;
   while(true){
    System.out.println(i+ " Hello");
    i++;
  }
 }
 public static void main(String[] args){
  Test t = new Test();
  t.start();
  int i = 1;
  while(true){
   System.out.println(i+ " Word");
   i++;
  }
 }
}