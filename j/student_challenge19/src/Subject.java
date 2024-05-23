class Subject{
 private String subId;
 private String name;
 private int maxMark;
 private int marksObtained;

 public Subject(String subId, String name, int maxMark){
  this.subId = subId;
  this.name = name;
  this.maxMark = maxMark;
 }
 public String getSubId(){
  return subId; 
 }
 public String getName(){
  return name;
 }
 public int GetMaxMark(){
  return maxMark;
 }
 public int getMarksObtained(){
  return marksObtained;
 }
 public void setMarksObtained(int n){
  marksObtained = n;
 }
 public boolean isQualified(int max){
  return max >= maxMark/10*4; 
 }
 public String toString(){
  return "Subject: " +name+ "\t ID: " +subId+ "\t Max Mark: " +maxMark;
 }
}