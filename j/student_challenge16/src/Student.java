class Student{
  int rollNumber;
  String name;
  String course;
  double m1,m2,m3;

  public double total(){
   return m1+m2+m3;
 }
 public double average(){
   return total()/3;
 }
 public char grade(){
   if(average()>= 70){
     return 'A'; 
   }else if(average() >= 60 && average() <= 69){
     return 'B';
   } else if(average()>= 50 && average() <= 59){
     return 'C';
   } else if(average() >= 40 && average() <= 49){
     return 'D';
   } else{
     return 'F';
   }   
 }

 public String toString(){
   return "Roll no.: " +rollNumber+ "\nName: " +name+ "\nCourse: " +course;
 }
} 