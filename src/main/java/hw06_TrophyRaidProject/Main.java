package hw06_TrophyRaidProject;

import hw06_TrophyRaidProject.Car.CarFactory;
import hw06_TrophyRaidProject.Car.CarFactoryImpl;
import hw06_TrophyRaidProject.Car.iCar;
import hw06_TrophyRaidProject.ControlPoint.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ControlPointFactory controlPointFactory = new ControlPointFactoryImpl();

        ObligatoryControlPoint cpp1 = controlPointFactory.createObligatoryControlPoint().setName("KP1").setLatitude(120).setLongitude(120).
                setParkingForRecreation(true).
                setParkingForRepairs(true).setKmToCheckpoint(150).build();
        OptionalControlPoint cpp4 = controlPointFactory.createOptionalControlPoint().setName("KP4").setLatitude(90)
                .setLongitude(80).setParkingForRecreation(true).setParkingForRepairs(true).setKmToCheckpoint(160).setPenalty(15).build();




      var cpp2  = cpp1.clone();
        cpp2.SetKmToCheckpoint(160);
        cpp2.setName("KP2");
        var cpp3  = cpp1.clone();
        cpp3.SetKmToCheckpoint(170);
        cpp3.setName("KP3");
        CarFactory carFactory = new CarFactoryImpl();
        iCar car1 = carFactory.createPassengerCar().trunk(true).brand("Ford").model("JTX").color("Black").averageSpeedKmPerHour(60).build();
car1.setName("Marty");

       var car2 = car1.clone();
       car2.setAverageSpeedKmPerHour(70);
       car2.setName("Mark");
        car2.setBrand("Opel");
       var car3 = carFactory.createTruck().averageSpeedKmPerHour(90).brand("VAZ")
               .model("VIS 2349").color("White").stateNumber("RS425IO").build();

       car3.setName("Polina");

        ArrayList<iCar> car = new ArrayList<>();
        ArrayList<ControlPoint> cp = new ArrayList<>();
        car.add(car1);
        car.add(car2);
        car.add(car3);
        cp.add(cpp1);
        cp.add(cpp2);
        cp.add(cpp3);
        cp.add(cpp4);
        Run run = new Run(car,cp);

        run.Start();
        run.displayResult();
        //run.displayWinner();


    }
}

