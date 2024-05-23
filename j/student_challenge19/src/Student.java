class Student{
 String rollNo;
 String name;
 String depart;
 Subject[] subs;

  public Student(String rollNo, String name, String depart, Subject[] subs) {
        this.rollNo = rollNo;
        this.name = name;
        this.depart = depart;
        this.subs = subs;
    }
  public void setDepart(String newDepart){
   this.depart = newDepart;
 }
  public void setSubs(Subject[] subs){
   this.subs = subs;
 }
 public String getDepart(){
   return depart;
 }
 public Subject[] getSub(){
  return subs;
 }
}