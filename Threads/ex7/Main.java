public class Main{
 public static void main(String[] args){
  Counter counter = new Counter();
  int valuePerThread = 1000;
  int numThreads = 10;

  Thread[] threads = new Thread[numThreads];
  for(int i = 0; i < numThreads; i++){
   threads[i] = new Thread(() -> {
      for(int j = 0; j < valuePerThread; j++){
       counter.increment();
     }
   });
  }
  for(Thread thread : threads){
   thread.start();
  }
  for(Thread thread : threads){
   try{
    thread.join();
   } catch(InterruptedException e){
     Thread.currentThread().interrupt();
   }
  }
  int finalVal = counter.getValue();
  System.out.println("Final Value: " +finalVal);
  System.out.println("Expected Value: " +(numThreads * valuePerThread));
 }
}