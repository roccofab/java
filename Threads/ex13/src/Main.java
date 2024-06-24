import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Threads: ");
        int NumberOfThreads = sc.nextInt();
        IncrementerThread[] threads = new IncrementerThread[NumberOfThreads];
        for (int i = 0; i < NumberOfThreads; i++) {
            System.out.println("Enter Number of Increments: ");
            int NumberOfIncrements = sc.nextInt();
            threads[i] = new IncrementerThread(NumberOfIncrements);
            threads[i].start();
        }
        for(int i = 0; i < NumberOfThreads; i++){
            try{
                threads[i].join();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        for(int i = 0; i < NumberOfThreads; i++){
            System.out.println(threads[i].getName()+ " count: " +threads[i].getCount());
        }
    }
}