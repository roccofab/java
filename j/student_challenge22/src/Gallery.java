public class Gallery {
    private String photo;
    private String video;
    private String videoDuration;
    private static int photoCount = 0;  //static counter to track the total number of photos regardless of how many Gallery instances are created
    private static int videoCount = 0;  //static counter to track the total number of videos regardless of how many Gallery instances are created

    /*When the constructor is called, the photo and video variables are checked.
     If one or both values are null: the constructor will generate name for both photos and videos based
     on the photoCount value and videoCount value, for example photo 1 for the first photo
     */
    public Gallery(String photo, String video) {
        this.photo = (photo == null) ? "photo" + (++photoCount) : photo;  //the ternary operator verify if the photo value is null: if it is null the constructor will generate the name based on the photoCounter value
        this.video = (video == null) ? "video" + (++videoCount) : video;  //the ternary operator verify if the photo value is null: if it is null the constructor will generate the name based on the videoCounter value
    }
    public String getPhoto() {
        return photo;
    }
    public String getVideo() {
        return video;
    }
    public String getDuration() {
        return videoDuration;
    }
    public void setDuration(String duration) {
        this.videoDuration = duration;
    }
}
