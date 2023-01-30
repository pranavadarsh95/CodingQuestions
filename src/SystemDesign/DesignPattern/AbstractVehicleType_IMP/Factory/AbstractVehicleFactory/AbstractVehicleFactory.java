package SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.AbstractVehicleFactory;

import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Vehicle;

public abstract class AbstractVehicleFactory {
    public abstract Vehicle getVehicle(String type);
}
