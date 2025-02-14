package hw06_TrophyRaidProject.CarBuilder;

import hw06_TrophyRaidProject.Car.Truck;
import hw06_TrophyRaidProject.Car.iCar;

public class TruckBuilder implements iTruckBuilder {
    private String brand = null;
    private String model = null;
    private String stateNumber = null;
    private String color = null;
    private String horsepower = null;
    private int fuelReserve = 0;
    private float averageSpeedKmPerHour = 0.0F;
    private float bodyHeight = 0.0F;
    private float timeSpent = 0.0F;
    private String name = null;



    @Override
    public TruckBuilder bodyHeight(float value) {
        this.bodyHeight = value;
        return this;
    }

    @Override
    public TruckBuilder brand(String value) {
        this.brand = value;
        return this;
    }

    @Override
    public TruckBuilder model(String value) {
        this.model = value;
        return this;
    }

    @Override
    public TruckBuilder stateNumber(String value) {
        this.stateNumber = value;
        return this;
    }

    @Override
    public TruckBuilder color(String value) {
        this.color = value;
        return this;
    }

    @Override
    public TruckBuilder horsepower(String value) {
        this.horsepower = value;
        return this;
    }

    @Override
    public TruckBuilder fuelReserve(int value) {
        this.fuelReserve = value;
        return this;
    }

    @Override
    public TruckBuilder averageSpeedKmPerHour(float value) {
        this.averageSpeedKmPerHour = value;
        return this;
    }

    @Override
    public iCar build() {
        return new Truck(this.brand, this.model,this.stateNumber,this.color,
                this.horsepower,this.fuelReserve,this.averageSpeedKmPerHour,this.bodyHeight,this.timeSpent,this.name);
    }

    @Override
    public TruckBuilder name(String value) {
        this.name = value;
        return this;
    }

    @Override
    public TruckBuilder timeSpent(float value) {
        this.timeSpent = value;
        return this;
    }


}
