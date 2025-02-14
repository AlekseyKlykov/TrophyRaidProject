package hw06_TrophyRaidProject.Car;

import hw06_TrophyRaidProject.CarBuilder.iPassengerBuilder;
import hw06_TrophyRaidProject.CarBuilder.iTruckBuilder;

public interface CarFactory {
    iTruckBuilder createTruck();
    iPassengerBuilder createPassengerCar();
}
