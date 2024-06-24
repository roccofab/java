public class WhiteBoard {
    String text;
    int numStudents = 0;
    int count = 0;
    public void attendance(){
        numStudents++;
    }
    public synchronized void write(String t){
        System.out.println("Teacher Write: " +t);
        while(count != 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        text = t;
        count = numStudents;
        notifyAll();
    }
    public synchronized String read(){
        while(count == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String t = text;
        count--;
        if(count == 0)
            notify();

        return t;
    }
}
