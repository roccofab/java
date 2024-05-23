import java.util.ArrayList;
import java.util.Scanner;

public class SmartPhone extends CellPhone{
    private String Model;
    private String MacAdress;
    private ArrayList<Gallery> gallery;
    private ArrayList<Playlist> sounds;
    public SmartPhone(long phoneNo, long Imei, String Model, String MacAdress) {
        super(phoneNo, Imei);
        this.Model = Model;
        this.MacAdress = MacAdress;
        this.gallery = new ArrayList<>();
        this.sounds = new ArrayList<>();
    }
    public Playlist findSongByName(String name) {  //find song name by iteration on List sounds
        for(Playlist song : sounds){
            if(song.getSound().equals(name)){
                return song;
            }
        }
        return null;
    }
    public void PlayMusic(){   //find sound by name and then get a String Playing soundName else Song not Found
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Song Name: ");
        String name = sc.nextLine();
        Playlist song = findSongByName(name);
        if (song != null) {
            System.out.println("Playing " + song.getSound());
        } else {
            System.out.println("Song not Found");
        }
    }
    public Gallery findVideoByName(String name) {   // find video name by iteration on List gallery
        for (Gallery video : gallery) {
            if (video.getVideo().equals(name)) {
                return video;
            }
        }
        return null;
    }
    public void PlayVideo(){  //find video by name and then get a String Playing videoName else Video not Found
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Video Name: ");
        String name = sc.nextLine();
        Gallery video = findVideoByName(name);
        if (video == null) {
            System.out.println("Video not found");
        } else {
            System.out.println("Playing " + video.getVideo());
        }
    }
    public void addSound(Playlist sound) {
        sounds.add(sound);
    }
    public void Click(Gallery photo){
        System.out.println("Taking Photo");
        gallery.add(photo);
    }
    public void capture(String duration) {
        System.out.println("Taking Video");
        String videoName = null;
        Gallery video = new Gallery(null, videoName);
        video.setDuration(duration);
        gallery.add(video);
        System.out.println("Video " + video.getVideo() + " with duration " + duration + " added to gallery.");
    }
    public void printInfo() {
        System.out.println("Model: " + Model);
        System.out.println("MacAdress: " + MacAdress);
        System.out.println("Imei: " + Imei);
        System.out.println("PhoneNo: " + phoneNo);
    }
    public void printGallery() {
        for (Gallery photo : gallery) {
            if(photo != null) {
                System.out.println(photo.getVideo() + "-" + photo.getDuration());
                System.out.println(photo.getPhoto());
            }
        }
    }
    public void printPlayList(){
        for (Playlist sound : sounds) {
            if(!sounds.isEmpty()) {
                System.out.println(sound.getSound());
            }
        }
    }
}
