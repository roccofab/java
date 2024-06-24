public class Main{
 public static void main(String[] args){
   int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
   int[] arr2 = {11,12,13,14,15,16,17,18,19,20};
   int[] arr3 = {21,22,23,24,25,26,27,28,29,30};
   SumThreads s1 = new SumThreads(arr1);
   Thread t1 = new Thread(s1);
   SumThreads s2 = new SumThreads(arr2);
   Thread t2 = new Thread(s2);
   SumThreads s3 = new SumThreads(arr3);
   Thread t3 = new Thread(s3);
   t1.start();
        try {
            t1.join(); // Aspetta che il thread t1 finisca
            Thread.sleep(3000); // Attende 3 secondi prima di avviare il prossimo thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t2.join(); // Aspetta che il thread t2 finisca
            Thread.sleep(3000); // Attende 3 secondi prima di avviare il prossimo thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        try {
            t3.join(); // Aspetta che il thread t3 finisca
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
 }
}