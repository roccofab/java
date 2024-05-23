public class Main{
 public static void main(String[] args){
   Outer.Inner oi = new Outer().new Inner();
   oi.InnerDisplay();
 }
}