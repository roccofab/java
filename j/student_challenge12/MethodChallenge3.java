//check if a number is a prime number or not a prime number: a prime number is a number that only has two divisor: 0 and itself
class MethodChallenge3{
 static boolean isPrime(int num){
    if (num <= 1) {
            return false;
        }
   for(int i = 2; i < num; i++){
     if(num % i == 0){
      return false;
   }
  }
   return true;
 }
 public static void main(String[] args){
   int num = 91;
   System.out.println(isPrime(num));
 }
}