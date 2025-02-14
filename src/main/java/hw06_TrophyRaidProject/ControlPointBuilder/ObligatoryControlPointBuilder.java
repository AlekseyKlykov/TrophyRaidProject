package hw06_TrophyRaidProject.ControlPointBuilder;

import hw06_TrophyRaidProject.ControlPoint.ControlPoint;
import hw06_TrophyRaidProject.ControlPoint.ControlPointPenalty;
import hw06_TrophyRaidProject.ControlPoint.ObligatoryControlPoint;

public class ObligatoryControlPointBuilder {

    private String name = null;
    private float   latitude = 0.0F;
    private float longitude = 0.0F;
    private boolean parkingForRecreation = false;
    private boolean parkingForRepairs = false;
    private float kmToCheckpoint = 0.0F;



    public ObligatoryControlPointBuilder setName(String value){

        this.name = value;
        return this;

    }

    public ObligatoryControlPointBuilder setLatitude(float value){

        this.latitude = value;
        return this;
    }

    public ObligatoryControlPointBuilder setLongitude(float  value){

        this.longitude = value;
        return this;

    }

    public ObligatoryControlPointBuilder setParkingForRecreation(boolean value){

        this.parkingForRecreation = value;
        return this;

    }

    public ObligatoryControlPointBuilder setParkingForRepairs(boolean value){

        this.parkingForRepairs = value;
        return this;

    }


    public ObligatoryControlPointBuilder setKmToCheckpoint(float value) {
        this.kmToCheckpoint = value;
        return this;
    }


    public ObligatoryControlPoint build() {
        return new ObligatoryControlPoint(name,latitude,longitude,
                parkingForRecreation,parkingForRepairs,kmToCheckpoint);
    }


}
