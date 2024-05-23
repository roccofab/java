//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SuperClass sup = new SuperClass();  //I can only call SuperClass Methods
        sup.meth1(); //SuperClass method
        sup.meth2();  //SuperClass method
        System.out.println("\n");
        SubClass sub = new SubClass(); //I can call three methods
        sub.meth1(); //SuperClass method
        sub.meth2(); //SubClass method (Overrided method)
        sub.meth3();  //SubClass method
    }
}