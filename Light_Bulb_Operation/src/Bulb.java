public class Bulb {
    private String isOn;
    public int maxClick;
    private boolean electricCurrent;
    private boolean broken = false;

    public Bulb(String isOn, int maxClick, boolean electricCurrent,boolean broken) {
        this.isOn = isOn;
        this.maxClick = maxClick;
        this.electricCurrent = electricCurrent;
        this.broken = false;
    }
    public Bulb(int maxClick){
        this.maxClick = maxClick;
        this.isOn = "off";
        this.electricCurrent = false;
        this.broken = false;
    }
    public Bulb(){
        this.isOn = "off";
        this.maxClick = 100;
        this.electricCurrent = false;
        this.broken = false;
    }
    public String getState(){
        if(!electricCurrent) {
            return "OFF";
        }
        if(broken){
            return "OFF";
        }
        return isOn;
    }
    public void setElectricCurrent(boolean current) {
        this.electricCurrent = current;
    }
    public int getMaxClick(){
        return maxClick;
    }
    public void click(){
        if(!electricCurrent){
            System.out.println("Electric Current is off");
            return;
        }
        if(broken){
            System.out.println("The Light Bulb is broken");
            return;
        }
        if(isOn.equalsIgnoreCase("OFF")){
            isOn = "ON";
        } else if(isOn.equalsIgnoreCase("ON")){
            isOn = "OFF";
        } else if(!electricCurrent){
            setElectricCurrent(true);
            isOn = "ON";
        }
        maxClick--;
        if(maxClick == 0){
            System.out.println("The Light Bulb is broken");
            broken = true;
        }

    }
}
