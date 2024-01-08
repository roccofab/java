import java.util.Scanner;
public class e5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string: ");
        String str = input.nextLine();
        int vowel = 0;
        int consonant = 0;
        for(int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            vowel++;
        } else {
            consonant++;
        } 
        } 
        
        System.out.println("vowels are: " +vowel);
        System.out.println("Consonants are: " +consonant);
    }
}