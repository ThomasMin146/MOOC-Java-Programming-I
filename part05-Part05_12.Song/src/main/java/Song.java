
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object song){
        
        Song csong = (Song)song;
        
        if(this.artist.equals(csong.artist) && this.name.equals(csong.name) && this.durationInSeconds == csong.durationInSeconds){
           return true; 
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
