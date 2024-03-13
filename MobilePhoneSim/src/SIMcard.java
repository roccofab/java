import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class SIMcard implements Serializable {
    private String phoneNumber;
    private double availableCredit;
    private ArrayList<Call> recentCalls;
    private String cardHolder;

    public SIMcard(String phoneNumber, double availableCredit,ArrayList recentCalls, String cardHolder) {  //SIMcard has 4 parameters: phoneNumber as String of characters, available credit, an empty list of recent calls, and the cardHolder(name and surname of the holder)
        this.phoneNumber = phoneNumber;
        this.availableCredit = availableCredit;
        this.recentCalls = new ArrayList<>();
        this.cardHolder = cardHolder;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addRecentCall(String startTime, String endTime, String targetNumber) {  //add a new Call with the same attributes of the constructor of the class Call
        Call newCall = new Call(startTime, endTime, targetNumber);
        recentCalls.add(newCall);
    }

    public int totalMinutesCalls() {   //get the total of minutes spent in calls by iterating over the call list
        int totalMinutes = 0;
        for(Call call : recentCalls) {
            totalMinutes += call.getTimeCallInMinutes();
        }
        return totalMinutes;
    }

    public int countCallsToNumber(String targetNumber) {  //count calls to number by iterating over all recent calls to target numbers
        int count = 0;
        for(Call call : recentCalls) {
            if(call.getTargetNumber().equals(targetNumber)) {
                count++;
            }
        }
        return count;
    }

    public void printCalls() {
        System.out.println("Phone Number: " +getPhoneNumber());
        System.out.println("Recent Calls: ");
        for(Call call : recentCalls) {
            System.out.println(" Time: " +call.getStartTime()+ " - " +call.getEndTime()+ " to: " +call.getTargetNumber());
        }

    }

    public void saveToFile(String dataCard) {  //save details of the object to .txt file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(dataCard))) {  //ObjectOutputStream writes the serialization stream header to the underlying stream
            outputStream.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SIMcard loadFile(String dataCard) {  //read details of the object sim card stored in the .txt file
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(dataCard))) {  //ObjectInputStream initializes the deserialization filter to the filter returned by invoking the serial filter factory returned from ObjectInputFilter
            return (SIMcard) inputStream.readObject();
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }


    }

    public void deleteFile(String dataCard) {
        try {
            // create an instance of path for  dataCard.txt file
            Path path = Paths.get(dataCard);

            // check if the file exists
            if (Files.exists(path)) {
                // delete file
                Files.delete(path);
                System.out.println("File Deleted.");
            } else {
                System.out.println("File not Found.");
            }
        } catch (IOException e) {
            // IOexception management
            System.err.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            // Handle any other exception
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }


}


