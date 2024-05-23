//methods on String
import java.util.*;
import java.util.Scanner;
class MethodsString{
 public static void main(String[] args){ 
 Scanner sc = new Scanner(System.in);
  String str = "welcome";
  System.out.println(str.length());
  System.out.println(str.toUpperCase());
  System.out.println(str.substring(3));  //return string that start from index 3 to end
  System.out.println(str.substring(3, 6));  //return string that start from index 3 to index 6 - 1
  System.out.println(str.replace('e', 'k'));  //replace the character e with the character k
  System.out.println("Enter a string with empty spaces: ");
  String str2 = sc.nextLine();
  System.out.println(str2.trim());

  String str3 = "www.programming.org";
  System.out.println(str3.indexOf("."));  //restituisce il primo punto trovato in str3
  System.out.println(str3.indexOf("gr"));  //restituisce l'indice del primo carattere della stringa gr trovato quindi g
  System.out.println(str3.indexOf(".", 4));  //restituisce il secondo punto in str3
  System.out.println(str3.lastIndexOf("."));  //restituisce l'indice del secondo punto in str3
  System.out.println(str3.lastIndexOf(".", 7));  //restituisce l'indice del primo punto in str3
  System.out.println(str3.indexOf("?"));  //restituisce -1 perchè non è presente il carattere ? in str3

  String str4 = "programming";
  String str5 = "with java";
  System.out.println(str4 + str5);   //concatena due stringhe
 }
}