import java.util.Arrays;
public class Main{
 public static int CompareAge(int[] age) throws InvalidAgeException{
  int maxAge = Integer.MIN_VALUE;
  for(int i = 0; i < age.length; i++){
    if(age[i] > maxAge){
     maxAge = age[i];
   }
    if(age[i] < 0 || age[i] > 120){
      throw new InvalidAgeException();
   }
  }
   return maxAge;
 }
 public static void main(String[] args) throws InvalidAgeException{
   int[] age = {20, 30, 75, -10, 50};
   System.out.println(CompareAge(age));
 }
}