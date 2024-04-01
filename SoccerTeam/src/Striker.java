public class Striker extends  Player {
    public int goalScored;
    public Striker(String name, int age, int goalScored) {   //constructor for the subclass Striker
        super(name, age);
        this.goalScored = goalScored;
    }

    public int getGoalScored() {
        return goalScored;
    }
    public int CalculatePlayerValue() {   //this method estimates the striker player's commercial value
        return (5000000 * goalScored) - (5000 * getAge());
    }
}
