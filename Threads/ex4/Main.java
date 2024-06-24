//showing methods of the class Thread
public class Main{
 public static void main(String[] args){
  MyThread mt1 = new MyThread("Thread1");
  System.out.println("Thread ID: " +mt1.getId());
  System.out.println("Thread Name: " +mt1.getName());
  System.out.println("Thread Priority: " +mt1.getPriority()); 
  System.out.println("Thread State: " +mt1.getState());
  System.out.println("Thread isAlive: " +mt1.isAlive());
  mt1.start();
  System.out.println("Thread State after start(): " +mt1.getState());
  System.out.println("Thread isAlive after start(): " +mt1.isAlive());
 }
}