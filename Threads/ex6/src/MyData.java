public class MyData {
    int value;
    boolean flag = true;

    synchronized void set(int v) {
        while (!flag) {
            try {
                wait( );
            } catch (InterruptedException e) {
                e.printStackTrace( );
            }
        }
        value = v;
        flag = false;
        notify();
    }
    synchronized int get(){
        int x = 0;
        while(flag){
            try {
                wait( );
            } catch (InterruptedException e) {
                e.printStackTrace( );
            }
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}
