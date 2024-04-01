public class Player {
    public String name;
    public String age;

    public Player(String name, int age) {   //constructor of the main class Player
        this.name = name;
        this.age = String.valueOf(age);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return Integer.parseInt(age);
    }
}
