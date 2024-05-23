public class Circle {
    public double raggio;

    public Circle() {
        this.raggio = 1.0;
    }
    public Circle(double raggio) {
        this.raggio = raggio;
    }
    public double getRaggio() {
        return raggio;
    }
    public double getArea() {
        return Math.PI * raggio * raggio;
    }
}
