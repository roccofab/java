import java.util.Arrays;
class MyThread extends Thread{
  public MyThread(String name){
    super(name);
    setPriority(Thread.MIN_PRIORITY);
  }
 public void run(){
   int[] arr = {10, 20, 5, 50, 2, 100, 40};
   Arrays.sort(arr);
   for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i]+ " ");
  }
 }
}