
package clllab2;
public class Landmark {
    String LandmarkName;
    int ScheduledTime;

    public Landmark(String name,int time) {
        this.LandmarkName = name;
        this.ScheduledTime= time;
    }

    public String getLandmarkName() {
        return LandmarkName;
    }

    public void setLandmarkName(String name) {
        this.LandmarkName = name;
    }

    public int getScheduledTime() {
        return ScheduledTime;
    }

    public void setScheduledTime(int time) {
        this.ScheduledTime = time;
    }

    @Override
    public String toString() {
        return String.format("LandmarkName: %s, ScheduledTime: %d", LandmarkName, ScheduledTime);
    }


    
}
