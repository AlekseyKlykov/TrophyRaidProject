package hw06_TrophyRaidProject.ControlPoint;

public class ObligatoryControlPoint  implements ControlPoint {
    private String name;
    private float   latitude;
    private float longitude;

    private boolean parkingForRecreation;
    private boolean parkingForRepairs;
    private float kmToCheckpoint;

    public ObligatoryControlPoint(String name, float latitude, float longitude,
                                  boolean parkingForRecreation, boolean parkingForRepairs, float kmToCheckpoint) {

        this.name = name;
        this.parkingForRecreation = parkingForRecreation;
        this.parkingForRepairs = parkingForRepairs;
        this.kmToCheckpoint = kmToCheckpoint;

        if(latitude >= -90 & latitude <= 90) {
            this.latitude = latitude;
        }
        else {
            this.latitude = 0.0F;
        }
        if(longitude >= -180 & longitude <= 180) {
            this.longitude = longitude;
        }
        else {
            this.longitude = 0.0F;

        }
    }
    private ObligatoryControlPoint(){};
    private ObligatoryControlPoint(ObligatoryControlPoint clone){
        this.name = clone.getName();
        this.latitude = clone.getLatitude();
        this.longitude = clone.getLongitude();
        this.parkingForRecreation = clone.isParkingForRecreation();
        this.parkingForRepairs = clone.isParkingForRepairs();
        this.kmToCheckpoint = clone.kmToCheckpoint;

    };

@Override
    public String getName() {
        return name;
    }
    @Override
    public float getLatitude() {
        return latitude;
    }
    @Override
    public float getLongitude() {
        return longitude;
    }

    @Override
    public boolean isParkingForRecreation() {
        return parkingForRecreation;
    }
    @Override
    public boolean isParkingForRepairs() {
        return parkingForRepairs;
    }
    @Override
    public void setName(String value){

        this.name = value;

    }
    @Override
    public void setLatitude(float value){
        if(value >= -90 & value <= 90) {
            this.latitude = value;
        }
    }
    @Override
    public void setLongitude(float  value){
        if(value >= -180 & value <= 180) {
            this.longitude = value;
        }
    }
    @Override
    public void setParkingForRecreation(boolean value){

        this.parkingForRecreation = value;

    }
    @Override
    public void setParkingForRepairs(boolean value){

        this.parkingForRepairs = value;

    }

    @Override
    public ControlPoint clone() {
        return new ObligatoryControlPoint(this);
    }
    @Override
    public float getKmToCheckpoint() {
        return this.kmToCheckpoint;
    }

    @Override
    public void SetKmToCheckpoint(float value) {
        this.kmToCheckpoint = value;

    }

    @Override
    public String toString() {
        return "наименование: " + this.name
                + "\nдолгота: " + this.longitude
                + "\nширота: " + this.latitude
                + "\nместа для отдыха: " + this.parkingForRecreation
                + "\nместа для ремонта: " + this.parkingForRepairs;
    }



}
