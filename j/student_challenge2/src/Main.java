import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "a!bc@c1_2#1$2%3";
        String str2 = "abc  dEf  Ghi";
        System.out.println(str.replaceAll("[a-zA-Z0-9]", ""));  //print only special characters of str
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));  //remove special characters from str
        System.out.println(str2.replaceAll(" ", ""));   //remove empty spaces from str2
    }
}