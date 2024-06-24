class Counter{
 private int valore;

 public synchronized void increment(){
   valore++;
 }
 public int getValue(){
   return valore;
 }
}