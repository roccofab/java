import java.util.Scanner;
public class Smartphone extends Phone implements Camera, MusicPlayer{
    @Override
    public void click() {
      System.out.println("Taking Photo");
    }

    @Override
    public void record() {
     System.out.println("Taking Video");
    }

    @Override
    public void play() {
      System.out.println("Playing Music");
    }

    @Override
    public void pause() {
      System.out.println("Pause");
    }
    void VideoCall(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String user = sc.nextLine();
        System.out.println("Video Calling " +user);
    }
}
