import java.util.Random;
/**
 * The TrafficLight class represents a traffic light that cycles through different colors:
 * Red, Green, and Yellow. It allows querying the current color, getting the duration for each color,
 * and changing the color in a cyclic manner.
 *
 * <p>
 * Example usage:
 * <pre>
 *     TrafficLight trafficLight = new TrafficLight(10); // Create a traffic light with 10 seconds duration per color
 *     String currentColor = trafficLight.getColor(); // Get the current color of the traffic light
 *     int duration = trafficLight.getDuration(); // Get the duration of each color in seconds
 *     trafficLight.changeColor(); // Change the traffic light to the next color in sequence
 * </pre>
 * </p>
 *
 */

public class TrafficLight {
    private final int duration;
    private String[] colors = {"Red", "Green", "Yellow"};
    private int colorIndex;
    /**
     * Constructs a TrafficLight object with the specified duration for each color.
     *
     * @param duration the duration of each color in seconds
     */

    public TrafficLight(int duration) {
        this.colorIndex = 0;
        this.duration = duration;
    }
    /**
     * Gets the current color of the traffic light.
     *
     * @return the current color (one of "Red", "Green", "Yellow")
     */

    public String getColor() {
        return colors[colorIndex];
    }
    public int getDuration(){
        return duration;
    }
    /**
     * Changes the current color of the traffic light to the next color in sequence:
     * Red -> Green -> Yellow -> Red, and so on.
     * Prints the newly changed color to the console.
     */
    public void changeColor(){
        colorIndex = (colorIndex + 1) % colors.length;
        System.out.println("Traffic Light Color: " +colors[colorIndex]);
    }
}
