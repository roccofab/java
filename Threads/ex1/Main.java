/*In this demonstration i achive multithreading using a class Test that inherit from thread class
  the class thread contain a method run() that is like main method so the class is runnable and
I get the printing of "Hello"(from class Test) and printing of Word(from class Main) simultaneously to infinity
*/

public class Main{
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