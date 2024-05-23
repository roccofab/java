class MethodChallenge8{
 static void show(int...x){   //pass more arguments in a single integer variable
  for(int i : x){
    System.out.print(i+ " ");  //pass more arguments in a single string variable
  }
 }
 static void show(String...s){
   for(int i = 0; i < s.length; i++){
    System.out.println(s[i]);
  }
 }
 public static void main(String[] args){
   show(1,2,3,4);
   System.out.println();
   show(new int[]{3,10,6,7,8,9,12});
   System.out.println();
   show("john", "paul", "mark", "frank");
 }
}
