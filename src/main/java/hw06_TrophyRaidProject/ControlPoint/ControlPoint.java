package hw06_TrophyRaidProject.ControlPoint;

public interface ControlPoint {
    String getName();
    float   getLatitude();
    float getLongitude();
    boolean isParkingForRecreation();
    boolean isParkingForRepairs();
    public void setName(String value);
    public void setLatitude(float value);
    public void setLongitude(float  value);
    public void setParkingForRecreation(boolean value);
    public void setParkingForRepairs(boolean value);
    public float getKmToCheckpoint();
    public void SetKmToCheckpoint( float value);
    ControlPoint clone();


}
