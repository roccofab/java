
import java.util.Scanner;

public class methodsOnString {
    public static int lengthString(String input) {
        return input.length();
    }
    public static String lowerToUpperString(String input2) {
        return input2.toUpperCase();
    }
    
    public static String concatenation(String str1, String str2) {
        return str1+str2;
    }
    public static String reverseString(String str3) {
        return new StringBuilder(str3).reverse().toString();
    }
    public static int counter(String str4) {
        return str4.length();
    }
    public static String subString(String str5) {
        return str5.substring(1, 7).toString();
    }
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[256]; 
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            
            if (!visited[currentChar]) {
                result.append(currentChar);
                visited[currentChar] = true;
            }
        }
        
        return result.toString();
    }
    public static int vowelCounter(String str6) {
        int vowels = 0;
        str6 = str6.toLowerCase();
        
        for(int i = 0; i < str6.length(); i++) {
            char character = str6.charAt(i);
            if(character == 'a' || character == 'e' || character == 'u' || character == 'o' || character == 'u' ) {
                vowels++;
            } 
        }
        return vowels;
    }
    public static boolean compareString(String str7, String str8) {
        return str7.equalsIgnoreCase(str8);
    }
    public static String repeatString(String str9, int n){
        try{
        if(n < 0) {
            throw new IllegalArgumentException("The number can't be < 0");
        }

        StringBuilder str10 = new StringBuilder();
        for(int i = 0; i < n; i++) {
            str10.append(str9);
        }
        return str10.toString();
    } catch(IllegalArgumentException exception) {
        System.out.println("error " +exception.getMessage());
        return "";
    }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Calculate the string's length using the method lengthString   
        System.out.println("Enter word: ");
        String inputUser = input.nextLine();
        int inputLength = lengthString(inputUser);
        System.out.println(inputLength+ " characters");
        
        //Convert string from lowercase to uppercase using the method lowerToUpperString
        System.out.println("Enter word: ");
        String inputUser2 = input.nextLine();
        String inputConverted = lowerToUpperString(inputUser2);
        System.out.println(inputConverted);
        
        
        //Concatenation of strings
        System.out.println("enter string1: ");
        String strin1 = input.nextLine();
        System.out.println("enter string2: ");
        String strin2 = input.nextLine();
        
        String str1Str2 = concatenation(strin1, strin2);
        System.out.println(str1Str2);
        
        
        //printing reverse string
        System.out.println("enter string: ");
        String str3 = input.nextLine();
        String strReverse = reverseString(str3);
        System.out.println(strReverse);
        
        
        //calculate the string length
        System.out.println("enter string: ");
        String str4 = input.nextLine();
        int countString = counter(str4);
        System.out.println("The string length is: " +countString);
        
        
        //extract substring from a paragraph
        System.out.println("enter a phrase(minimum 7 characters): ");
        String str5 = input.nextLine();
        String substring = subString(str5);
        System.out.println("The substring is: " +substring);
        
        
        String original = "programming";
        String withoutDuplicates = removeDuplicates(original);
        
        System.out.println("Stringa originale: " + original);
        System.out.println("Stringa senza duplicati: " + withoutDuplicates);
        
        
        //counting the vowels in a string
        System.out.println("enter string: ");
        String str6 = input.nextLine();
        int counterVowel = vowelCounter(str6);
        System.out.println("The string contain " +counterVowel+ " vowels");



       //compare two strings 
        System.out.println("enter string: ");
        String str7 = input.nextLine();

        System.out.println("enter string: ");
        String str8 = input.nextLine();
        
        boolean isEqual = compareString(str7, str8);
        if(isEqual) {
            System.out.println("Strings are equals");
        } else {
            System.out.println("Strings not equals");
        }


        
        //repeat the string n times
        System.out.println("Enter string: ");
        String str9 = input.nextLine();

        System.out.println("Enter how many times you want to repeat the string: ");
        int n = input.nextInt();

        try{
            String str10 = repeatString(str9, n);
            System.out.println(str10);
        } catch(IllegalArgumentException exception) {
            System.out.println("error" +exception.getMessage());
        }
    }
