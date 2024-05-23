
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Home home = new Home(2, 4);   //stance of the class Home
        home.printAppliances();
        double totalEnergy = home.calculateMantainanceAppliance();
        System.out.println(STR."Total Energy Consumed: \{totalEnergy}");
    }
}