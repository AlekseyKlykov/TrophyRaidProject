package hw06_TrophyRaidProject.ControlPoint;

public class OptionalControlPoint implements ControlPointPenalty {

    private String name;
    private float   latitude;
    private float longitude;
    private float penalty;
    private boolean parkingForRecreation;
    private boolean parkingForRepairs;
    private float kmToCheckpoint;

    public OptionalControlPoint(String name, float latitude, float longitude, float penalty,
                                boolean parkingForRecreation, boolean parkingForRepairs,float kmToCheckpoint) {
        this.name = name;
        this.penalty = penalty;
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
    private OptionalControlPoint(OptionalControlPoint clone){
        this.name = clone.getName();
        this.latitude = clone.getLatitude();
        this.longitude = clone.getLongitude();
        this.parkingForRecreation = clone.isParkingForRecreation();
        this.parkingForRepairs = clone.isParkingForRepairs();
        this.penalty = clone.getPenalty();
        this.kmToCheckpoint = clone.kmToCheckpoint;

    };

    private OptionalControlPoint(){};


    public String getName() {
        return name;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getPenalty() {
        return penalty;
    }



    public boolean isParkingForRecreation() {
        return parkingForRecreation;
    }

    public boolean isParkingForRepairs() {
        return parkingForRepairs;
    }

    public void setName(String value){

        this.name = value;

    }

    public void setLatitude(float value){

        if(value >= -90 & value <= 90) {
            this.latitude = value;
        }
    }

    public void setLongitude(float  value){

        if(value >= -180 & value <= 180) {
            this.longitude = value;
        }

    }


    public void setParkingForRecreation(boolean value){

        this.parkingForRecreation = value;

    }

    public void setParkingForRepairs(boolean value){

        this.parkingForRepairs = value;

    }


    public float getKmToCheckpoint() {
        return this.kmToCheckpoint;
    }


    public void SetKmToCheckpoint(float value) {
        this.kmToCheckpoint = value;

    }

    @Override
    public String toString() {
        return "name: " + this.name
               + "\nlongitude: " + this.longitude
                + "\nlatitude: " + this.latitude
                + "\nparkingForRecreation: " + this.parkingForRecreation
                + "\nparkingForRepairs: " + this.parkingForRepairs;
    }




    public float setPenalty(float value) {
      return  this.penalty = value;
    }


    public OptionalControlPoint clone() {
        return new OptionalControlPoint(this);
    }
}
