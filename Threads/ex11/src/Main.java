import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumThreads[] st = new SumThreads[4];
        Thread[] threads = new Thread[st.length];
        for (int i = 0; i < threads.length; i++) {
            System.out.println("Enter Number: ");
            int num = sc.nextInt();
            st[i] = new SumThreads(num);
            threads[i] = new Thread(st[i]);
        }
        threads[0].setPriority(9);
        threads[1].setPriority(5);
        threads[2].setPriority(1);
        threads[3].setPriority(10);
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        try{
            for (int i = 0; i < threads.length; i++) {
                threads[i].join();
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i = 0; i < threads.length; i++){
            System.out.println(threads[i].getName()+ " Calculated Sum: " +st[i].getSum());
        }
        for(int i = 0; i < threads.length; i++){
            System.out.println(threads[i].getName()+ " Has priority: " +threads[i].getPriority());
        }
    }
}