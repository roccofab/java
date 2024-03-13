import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Call implements Serializable {
    private LocalTime startTime;
    private LocalTime endTime;

    private String targetNumber;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");  //The main date-time classes provide two methods - one for formatting, format(DateTimeFormatter formatter), and one for parsing, parse(CharSequence text, DateTimeFormatter formatter).


    public Call(String startTime, String endTime, String targetNumber) {   //constructor of the class Call with attributes startTime(for example: 17:00), endTime(for example 17:20), and the targetNumber(for example: +39 3789865432)
        this.startTime = LocalTime.parse(startTime, formatter);
        this.endTime = LocalTime.parse(endTime, formatter);
        this.targetNumber = targetNumber;
    }

    public String getStartTime() {    //This time will be passed to the formatter to produce a string
        return startTime.format(formatter);
    }
    public String getEndTime() {    //This time will be passed to the formatter to produce a string
        return endTime.format(formatter);
    }

    public String getTargetNumber() {
        return targetNumber;
    }
    public int getTimeCallInMinutes() {  //the java localtime class allows you to manage time without having to convert it to an integer
        return (int) startTime.until(endTime, java.time.temporal.ChronoUnit.MINUTES);  //subtract startTime from endTime and then convert the result to an integer
    }
}
