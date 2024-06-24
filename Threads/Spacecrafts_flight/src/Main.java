//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Object lock = new Object(); // Shared object for synchronization
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft(lock);
        Airplane airplane = new Airplane(lock);
        Helicopter helicopter = new Helicopter(lock);
        Thread spacecraftThread = new Thread(spacecraft);
        Thread AirplaneThread = new Thread(airplane);
        Thread HelicopterThread = new Thread(helicopter);
        spacecraftThread.start();
        AirplaneThread.start();
        HelicopterThread.start();
    }
}