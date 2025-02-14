package hw06_TrophyRaidProject.Car;

public interface iCar {
   String getBrand();

    String getModel();
    String getStateNumber();
    String getColor();
    String getHorsepower();
    int getFuelReserve();
    float getAverageSpeedKmPerHour();
    iCar clone();
    void setBrand(String value);
    void setModel(String value);
    void setStateNumber(String value);
    void setColor(String value);
    void setHorsepower(String value);
    void setFuelReserve(int value);
    void setAverageSpeedKmPerHour(float value);
    float getTimeSpent();
    void setTimeSpent(float  value);
    void setName(String value);
    String getName();
    boolean decisionSkip();



}
