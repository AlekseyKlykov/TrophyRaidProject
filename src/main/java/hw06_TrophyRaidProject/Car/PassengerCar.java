package hw06_TrophyRaidProject.Car;

import java.util.Random;

public class PassengerCar implements iPassengerCar {

    String brand;
    String model;
    String stateNumber;
    String color;
    String horsepower;
    int fuelReserve;
    float averageSpeedKmPerHour;
    boolean trunk;
    private float timeSpent;
    String name;


private PassengerCar(){};
    private PassengerCar(PassengerCar copy){
        this.brand = copy.getBrand();
        this.model = copy.getModel();
        this.stateNumber = copy.getStateNumber();
        this.color = copy.getColor();
        this.horsepower = copy.getHorsepower();
        this.fuelReserve = copy.getFuelReserve();
        this.averageSpeedKmPerHour = copy.getAverageSpeedKmPerHour();
        this.trunk = copy.isTrunk();
        this.timeSpent = copy.getTimeSpent();
        this.name = copy.name;


    }

    public PassengerCar(String brand, String model, String stateNumber, String color,
                        String horsepower, int fuelReserve, float averageSpeedKmPerHour, boolean trunk,float timeSpent, String name){
        this.brand = brand;
        this.model = model;
        this.stateNumber = stateNumber;
        this.color = color;
        this.horsepower = horsepower;
        this.fuelReserve = fuelReserve;
        this.averageSpeedKmPerHour = averageSpeedKmPerHour;
        this.trunk = trunk;
        this.timeSpent = timeSpent;
        this.name = name;

    };
    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getStateNumber() {
        return this.stateNumber;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getHorsepower() {
        return this.horsepower;
    }

    @Override
    public int getFuelReserve() {
        return this.fuelReserve;
    }

    @Override
    public float getAverageSpeedKmPerHour() {
        return this.averageSpeedKmPerHour;
    }

    @Override
    public iCar clone() {
        return new PassengerCar(this);
    }

    @Override
    public void setBrand(String value) {
    this.brand = value;
    }

    @Override
    public void setModel(String value) {
    this.model = value;
    }

    @Override
    public void setStateNumber(String value) {
    this.stateNumber = value;
    }

    @Override
    public void setColor(String value) {
    this.color = value;
    }

    @Override
    public void setHorsepower(String value) {
    this.horsepower = value;
    }

    @Override
    public void setFuelReserve(int value) {
    this.fuelReserve = value;
    }

    @Override
    public void setAverageSpeedKmPerHour(float value) {
    this.averageSpeedKmPerHour = value;

    }

    @Override
    public float getTimeSpent() {
        return this.timeSpent;
    }

    @Override
    public void setTimeSpent(float value) {
    this.timeSpent = value;
    }

    @Override
    public void setName(String value) {
        this.name = value;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean decisionSkip() {
        var res = new Random();
        return res.nextBoolean();
    }

    @Override
    public boolean isTrunk() {
       return trunk;
    }

    @Override
    public void setTrunk(boolean value) {
    this.trunk = value;
    }

    @Override
    public String toString() {
        return "brand: " + this.brand
        + "\nmodel: " + this.model
        + "\nstateNumber: " + this.stateNumber
        + "\ncolor: " + this.color
        + "\nhorsepower: " + this.horsepower
        + "\nfuelReserve: " + this.fuelReserve
        + "\naverageSpeedKmPerHour: " + this.averageSpeedKmPerHour
        + "\ntrunk: " + this.trunk
        + "timeSpent: " + this.timeSpent;
    }
}
