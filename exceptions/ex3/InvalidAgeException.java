class InvalidAgeException extends Exception{
  public String toString(){
   return "Age cannot be negative or greater than 120";
 }
}