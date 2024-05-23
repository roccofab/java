public class Main{
 public static void main(String[] args){
   Student stu = new Student();
   stu.rollNumber = 601020;
   stu.name = "Mark";
   stu.course = "Math";
   stu.m1 = 70;
   stu.m2 = 40;
   stu.m3 = 81;
   System.out.println(stu.toString());
   System.out.println("\nTotal: " +stu.total());
   System.out.println("\nAverage: " +stu.average());
   System.out.println("\nFinal Grade: " +stu.grade());
 }
}