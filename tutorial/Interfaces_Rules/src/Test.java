public interface Test {
    final static int X = 10;
    public abstract void meth1();
    public abstract void meth2();

    public static void meth3() {
        System.out.println("Static Methods declared inside interface can have a body");
    }
}
