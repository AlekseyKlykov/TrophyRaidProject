package hw06_TrophyRaidProject.ControlPoint;


import hw06_TrophyRaidProject.ControlPointBuilder.ObligatoryControlPointBuilder;
import hw06_TrophyRaidProject.ControlPointBuilder.OptionalControlPointBuilder;

public interface ControlPointFactory {

    public ObligatoryControlPointBuilder createObligatoryControlPoint();
    public OptionalControlPointBuilder createOptionalControlPoint();
}
