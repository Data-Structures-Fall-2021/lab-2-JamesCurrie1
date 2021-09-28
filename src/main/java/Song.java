public class Song {
    private String artist;
    private String title;
    private int duration;
    public static String collectionName;
    public Song(String artist, String title, int duration) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }



    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String toString() {
        return title + " ("+ artist + ") - "+ (duration - duration%60)/60 + ":"+ (duration%60);

    }
}
