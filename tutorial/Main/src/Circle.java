public class Circle extends OverloadClass {
    private double ray;

    public Circle(double ray) {

        this.ray = ray;
    }

    @Override
    public double calculateArea() {

        return Math.PI * ray * ray;
    }
}
