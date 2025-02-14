package hw06_TrophyRaidProject.ControlPoint;


import hw06_TrophyRaidProject.ControlPointBuilder.ObligatoryControlPointBuilder;
import hw06_TrophyRaidProject.ControlPointBuilder.OptionalControlPointBuilder;

public class ControlPointFactoryImpl implements ControlPointFactory {
    @Override
    public ObligatoryControlPointBuilder createObligatoryControlPoint() {
        return new ObligatoryControlPointBuilder();
    }

    @Override
    public OptionalControlPointBuilder createOptionalControlPoint() {
        return new OptionalControlPointBuilder();
    }
}
