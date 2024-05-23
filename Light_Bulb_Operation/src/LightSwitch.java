public class LightSwitch {
    Bulb bulb;

    public LightSwitch(Bulb bulb) {
        this.bulb = bulb;
    }
    public void click(Bulb bulb) {
        bulb.click();
    }
    public String BulbStete(){
        return bulb.getState();
    }
}
