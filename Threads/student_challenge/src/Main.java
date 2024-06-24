//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher teacher = new Teacher(wb);
        Student st1 = new Student("1. John",wb);
        Student st2 = new Student("2. Jane",wb);
        Student st3 = new Student("3. Annah", wb);
        Student st4 = new Student("4. Mike", wb);
        teacher.start();
        st1.start();
        st2.start();
        st3.start();
        st4.start();
    }
}