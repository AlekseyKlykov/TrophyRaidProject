package hw06_TrophyRaidProject.ControlPointBuilder;

import hw06_TrophyRaidProject.ControlPoint.ControlPoint;
import hw06_TrophyRaidProject.ControlPoint.ControlPointPenalty;
import hw06_TrophyRaidProject.ControlPoint.OptionalControlPoint;

public class OptionalControlPointBuilder {

    private String name = null;
    private float   latitude = 0.0F;
    private float longitude = 0.0F;
    private float penalty = 0.0F;
    private boolean parkingForRecreation = false;
    private boolean parkingForRepairs = false;
    private float kmToCheckpoint = 0.0F;


    public OptionalControlPointBuilder setName(String value){

        this.name = value;
        return this;

    }

    public OptionalControlPointBuilder setLatitude(float value){

        this.latitude = value;
        return this;
    }

    public OptionalControlPointBuilder setLongitude(float  value){

        this.longitude = value;
        return this;

    }

    public OptionalControlPointBuilder setParkingForRecreation(boolean value){

        this.parkingForRecreation = value;
        return this;

    }

    public OptionalControlPointBuilder setParkingForRepairs(boolean value){

        this.parkingForRepairs = value;
        return this;

    }


    public OptionalControlPointBuilder setKmToCheckpoint(float value) {
        this.kmToCheckpoint = value;
        return this;
    }


    public OptionalControlPoint build() {
         return new OptionalControlPoint(name,latitude,longitude,penalty,parkingForRecreation,parkingForRepairs,kmToCheckpoint);
    }


    public OptionalControlPointBuilder setPenalty(float value) {
        this.penalty = value;
        return this;
    }



}
