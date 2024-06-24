class SumThreads implements Runnable{
 int[] arr;
 public SumThreads(int[] arr){
  this.arr = arr;
 }
 public void run(){
  int sum = 0;
  for(int i = 0; i < arr.length; i++){
   sum += arr[i];
  }
   System.out.println(Thread.currentThread().getName()+ " sum: " +sum);
 }
}