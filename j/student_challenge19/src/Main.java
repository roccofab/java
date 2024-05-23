public class Main{
 public static void main(String[] args){
  Subject sub[] = new Subject[3];
  sub[0] = new Subject("M100", "Math", 31);
  sub[1] = new Subject("S101", "Operating System", 31);
  sub[2] = new Subject("N102", "Networking", 31);
  for(Subject s : sub)
    System.out.println(s);
 }
}