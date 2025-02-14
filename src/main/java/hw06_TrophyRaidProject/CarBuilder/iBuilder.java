package hw06_TrophyRaidProject.CarBuilder;

import hw06_TrophyRaidProject.Car.iCar;

public interface iBuilder {

    iBuilder brand(String value);
    iBuilder model(String value);
    iBuilder stateNumber(String value);
    iBuilder color(String value);
    iBuilder horsepower(String value);
    iBuilder fuelReserve(int value);
    iBuilder averageSpeedKmPerHour(float value);
    iBuilder timeSpent(float value);
    iCar build();
    iBuilder name(String value);
}
