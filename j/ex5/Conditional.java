class Conditional{
 public static void main(String[] args){
   int x = 5, y = -5;
   int n1 = 10, n2 = 200, n3 = -10;
   if(x > y){
    System.out.println(x+ " greater than " +y);
   } else{
     System.out.println(x+ " is not greater than " +y);
   }

  if(n1 > n2 && n1 > n3){
   System.out.println(n1+ " is the greatest number between " +n2+ " and" +n3);
  } else if(n2 > n1 && n2 > n3){
    System.out.println(n2+ " is the greatest number between " +n1+ " and" +n3);
  } else{
    System.out.println(n3+ " is the greatest number between " +n1+ " and" +n2);
  }
 }
}