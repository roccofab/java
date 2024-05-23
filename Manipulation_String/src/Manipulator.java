public class Manipulator extends StringManipulator{
    private String s;

    public Manipulator(String s) {
        this.s = s;
    }
    @Override
    void Reverse() {
        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }

    @Override
    String RemoveSpaces() {
        return s.replaceAll("\\s+", "");
    }

    @Override
    String ConvertToUpperCase() {
        return s.toUpperCase();
    }

    @Override
    String ConvertToLowerCase() {
        return s.toLowerCase();
    }

    @Override
    String Concatenate(String str) {
        return s+ " " + str;
    }

    @Override
    String RemoveVowels() {
        String str;
        str = s.replaceAll("[aeiouAEIOU]", "");
        return str;
    }
}
