package hw06_TrophyRaidProject.CarBuilder;

import hw06_TrophyRaidProject.Car.PassengerCar;
import hw06_TrophyRaidProject.Car.iCar;

public class PassengerCarBuilder implements iPassengerBuilder {
    private String brand = null;
    private String model = null;
    private String stateNumber = null;
    private String color = null;
    private String horsepower = null;
    private int fuelReserve = 0;
    private float averageSpeedKmPerHour = 0.0F;
    private boolean trunk = false;
    private float timeSpent;
    private String name = null;




    @Override
    public PassengerCarBuilder brand(String value) {
        this.brand = value;
        return this;
    }

    @Override
    public PassengerCarBuilder model(String value) {
        this.model = value;
        return this;
    }

    @Override
    public PassengerCarBuilder stateNumber(String value) {
        this.stateNumber = value;
        return this;
    }

    @Override
    public PassengerCarBuilder color(String value) {
        this.color = value;
        return this;
    }

    @Override
    public PassengerCarBuilder horsepower(String value) {
        this.horsepower = value;
        return this;
    }

    @Override
    public PassengerCarBuilder fuelReserve(int value) {
        this.fuelReserve = value;
        return this;
    }

    @Override
    public PassengerCarBuilder averageSpeedKmPerHour(float value) {
        this.averageSpeedKmPerHour = value;
        return this;
    }

    @Override
    public iBuilder timeSpent(float value) {
        this.timeSpent = value;
        return this;
    }

    @Override
    public iCar build() {
        return new PassengerCar(this.brand, this.model,this.stateNumber,this.color,
                this.horsepower,this.fuelReserve,this.averageSpeedKmPerHour,this.trunk,this.timeSpent,this.name);
    }

    @Override
    public iBuilder name(String value) {
        this.name = value;
        return this;
    }

    @Override
    public PassengerCarBuilder trunk(boolean value) {
        this.trunk = value;
        return this;
    }
}
