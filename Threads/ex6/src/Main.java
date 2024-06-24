//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyData data = new MyData();
        Consumer consumer = new Consumer(data);
        Producer producer = new Producer(data);
        consumer.start();
        producer.start();
    }
}