import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bulb bulb = new Bulb(5);
        LightSwitch lightSwitch = new LightSwitch(bulb);
        bulb.setElectricCurrent(true);
        int choice;
        do{
            System.out.println("Switch on(press 1): ");
            System.out.println("Switch off(press 2): ");
            System.out.println("Set Electric current(press 3): ");
            System.out.println("Exit(press 4): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                   lightSwitch.click(bulb);
                   System.out.println(bulb.getState());
                   break;
                case 2:
                    lightSwitch.click(bulb);
                    System.out.println(bulb.getState());
                    break;
                case 3:
                    System.out.println("ON-OFF: ");
                    String select = sc.nextLine();
                    if(select.equalsIgnoreCase("ON")) {
                        bulb.setElectricCurrent(true);
                    } else if(select.equalsIgnoreCase("OFF")){
                        bulb.setElectricCurrent(false);
                    }
                    break;
                case 4:
                    break;
            }
        } while(choice != 4 && bulb.getMaxClick() > 0);
    }
}