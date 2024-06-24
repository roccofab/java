//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void exc(){
        String s = null;
        try{
            int l = s.length();
            System.out.println("String length is: " +l);
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("END");

        }
    }
    public static void main(String[] args) {
        exc();
    }
}