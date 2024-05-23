class Rectangle{
  int length;
  int height;

  public Rectangle(int length, int height){
   this.length = length;
   this.height = height;
 }
  public int area(){
    return length * height;
  }
  public int perimeter(){
    return 2*(length + height);  
  }
  public boolean isSquare(){
   return length == height;
  }
}