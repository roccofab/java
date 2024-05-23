//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      SubClass s = new SubClass();  //the call to the constructor from SubClass automatically call the constructor from the SuperClass and the constructor from the SubClass
      SuperClass su = new SubClass();  //the reference is to the SuperClass while the created object refers to the subclass so both methods are executed
      //SubClass sc = new SuperClass();  ERROR
    }
}