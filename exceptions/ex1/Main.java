//show examples of runTime Exceptions
public class Main{
 public static void main(String[] args){
   try{  //division by zero causes an arithmetic exception
    int a = 10;
    int b = 0;
    int c = a/b;
    System.out.println(c);
  } catch(ArithmeticException e){
    System.out.println("Division by zero is not allowed");  
  }

  try{  //try to access indexes outside the array causes an ArrayIndexOutOfBounds exception
   int[] arr = {0, 1, 2, 3, 4, 5};
   int n = arr[8];
   System.out.println(n);
  } catch(ArrayIndexOutOfBoundsException e){
    System.out.println("error index: " +e.getMessage());
  }

  try{  //String exception that cannot be converted to a number
   int num = Integer.parseInt("abc");
  } catch(NumberFormatException e){
    System.out.println("String can't be converted to Integer: " +e.getMessage());
  }

  try{  //nullPointer exception
   String str = null;
   int l = str.length();
  } catch(NullPointerException e){
   System.out.println("String is null: " +e.getMessage());
  }

  try{   //ArrayStoreException
   Object[] arr2 = new Integer[5];
   arr2[0] = 10;
   arr2[1] = 5;
   arr2[2] = 15;
   arr2[3] = 20;
   arr2[4] = "hello";   //that's cause an ArrayStoreException because i'm trying to store a string inside Integer array
   arr2[5] = 100;
  } catch(ArrayStoreException e){
    System.out.println("Exception: " +e.getMessage());
  }
 }
}