package hw06_TrophyRaidProject.Car;

import hw06_TrophyRaidProject.CarBuilder.PassengerCarBuilder;
import hw06_TrophyRaidProject.CarBuilder.TruckBuilder;
import hw06_TrophyRaidProject.CarBuilder.iPassengerBuilder;
import hw06_TrophyRaidProject.CarBuilder.iTruckBuilder;

public class CarFactoryImpl implements CarFactory {

    @Override
    public iTruckBuilder createTruck() {
        return new TruckBuilder();
    }

    @Override
    public iPassengerBuilder createPassengerCar() {
        return new PassengerCarBuilder();
    }
}
