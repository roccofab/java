class Test implements Runnable{
 public void run(){
   int i = 0;
   while(i < 15){
    System.out.println(i+ " Hello");
    i++;
  }
 }
}