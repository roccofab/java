public class ArrayChallenge17{
 public static boolean areEquals(int[] arr1, int[] arr2){
  if(arr1.length != arr2.length){
   return false;
 }
  for(int i = 0; i < arr1.length; i++){
    if(arr1[i] != arr2[i]){
     return false;
   }
  }
  return true;
 }
 public static void main(String[] args){
  int[] arr1 = {1,2,3,4,5};
  int[] arr2 = {1,2,3,4,5};
  int[] arr3 = {0,-10,10, 5, 6,7, 8};
   System.out.println("ArraY1 and Array2 equals: " +areEquals(arr1, arr2));
   System.out.println("Array2 and Array3 equals: " +areEquals(arr2, arr3));
 }
}