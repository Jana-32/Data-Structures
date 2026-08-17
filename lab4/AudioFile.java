package lab4;
public class AudioFile {
    
    private String title;
    private String creator;
    private int durationInSeconds;
    
    public AudioFile(String title, String creator, int durationInSeconds) {
        this.title = title;
        this.creator = creator;
        this.durationInSeconds = durationInSeconds;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getCreator() {
        return creator;
    }
    
    public int getDurationInSeconds() {
        return durationInSeconds;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }
    
    @Override
    public String toString() {
        return "Title: " + title + ", Creator: " + creator + ", Duration: " + durationInSeconds + " seconds";
    }
    
}
