public class GoalKeeper extends Player {
    public int penaltiesSaved;
    public GoalKeeper(String name, int age, int penaltiesSaved) {   //constructor of the subclass GoalKeeper
        super(name, age);
        this.penaltiesSaved = penaltiesSaved;
    }
    public int getPenaltiesSaved() {
        return penaltiesSaved;
    }
    public int calculatePlayerValue() {   //this method estimates the player's commercial value
        return(1000000 * penaltiesSaved) - (1000 * getAge());
    }
}
