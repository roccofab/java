import java.util.Arrays;
class MethodChallenge5{
 static int MaxNum(int[] array){
  int max = Integer.MIN_VALUE;
  for(int i = 0; i < array.length; i++){
   if(array[i] > max){
    max = array[i];
  }
 }
  return max;
}
 public static void main(String[] args){
  int[] array = {1,5,10, 200, 15, 20, 30, 40, 50};
  System.out.println("The Max Value is: " +MaxNum(array));
 }
}