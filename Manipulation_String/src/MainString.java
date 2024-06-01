

public class MainString {
    public static void main(String[] args) {
        String str = "Hello World";
        StringManipulator s = new Manipulator(str);
        s.Reverse();
        System.out.println(s.ConvertToUpperCase());
        System.out.println(s.ConvertToLowerCase());
        System.out.println(s.RemoveSpaces());
        System.out.println(s.RemoveVowels());
        System.out.println(s.Concatenate("Hello World"));
    }
}