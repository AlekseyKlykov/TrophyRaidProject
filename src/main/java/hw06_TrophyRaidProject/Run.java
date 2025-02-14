package hw06_TrophyRaidProject;

import hw06_TrophyRaidProject.Car.iCar;
import hw06_TrophyRaidProject.ControlPoint.ControlPoint;
import hw06_TrophyRaidProject.ControlPoint.ControlPointPenalty;
import hw06_TrophyRaidProject.ControlPoint.OptionalControlPoint;

import java.util.List;

public class Run {
    private List<iCar> car;
    private List<ControlPoint> cp;

    private Run(){};
    public Run(List<iCar> car,List<ControlPoint> cp){

        this.car = car;
        this.cp = cp;

    }
    public void Start(){

        for(var road: cp)
        {
            for(var participants: car)
            {

                participants.setTimeSpent(participants.getTimeSpent()
                        + road.getKmToCheckpoint()/participants.getAverageSpeedKmPerHour());

                if (road.getClass().getSimpleName() == "OptionalControlPoint" )
                {

                    ControlPointPenalty pt = (ControlPointPenalty)road;
                    if(participants.decisionSkip()){
                       participants.setTimeSpent(participants.getTimeSpent() + pt.getPenalty()/60);

                    }

                }


            }
        }

        }
    public void displayResult(){


        for(var participants: car)
        {
            System.out.println(participants.toString());


        }

    }
    public void displayWinner(){
        int idxres = 0;
        float time = 0;
        for(int i = 0;i<car.size();i++){

            if(time == 0) {
                time = car.get(i).getTimeSpent();
                idxres = i;
            }
            else{
                if(time>car.get(i).getTimeSpent())
                {
                    time = car.get(i).getTimeSpent();
                    idxres = i;
                }
            }
        }
        System.out.println("WINNER:\n\n"+ car.get(idxres).toString());


    }

}
